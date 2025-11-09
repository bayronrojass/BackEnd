package org.pin.backend.configs

import jakarta.annotation.PostConstruct
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.stereotype.Component

@Component
class SequenceFixer(val jdbc: JdbcTemplate) {

    @PostConstruct
    fun fixSequences() {
        val sql = """
            SELECT table_name 
            FROM information_schema.columns
            WHERE column_name = 'id' AND table_schema = 'public'
        """.trimIndent()

        val tables = jdbc.queryForList(sql, String::class.java)

        tables.forEach { table ->
            jdbc.execute(
                """
                SELECT setval(
                    pg_get_serial_sequence('$table', 'id'),
                    (SELECT COALESCE(MAX(id), 0) + 1 FROM $table)
                )
                """.trimIndent()
            )
        }
    }
}