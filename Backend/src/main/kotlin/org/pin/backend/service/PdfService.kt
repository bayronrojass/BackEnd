package org.pin.backend.service

import com.itextpdf.text.*
import com.itextpdf.text.pdf.PdfPCell
import com.itextpdf.text.pdf.PdfPTable
import com.itextpdf.text.pdf.PdfWriter
import org.pin.backend.model.Casa
import org.springframework.stereotype.Service
import java.io.ByteArrayOutputStream
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

@Service
class PdfService {

    fun generarResumenGastosPdf(casa: Casa): ByteArray {
        val out = ByteArrayOutputStream()
        val document = Document()
        PdfWriter.getInstance(document, out)

        document.open()

        // Fuentes
        val fontTitulo = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 18f, BaseColor.BLACK)
        val fontSubtitulo = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 12f, BaseColor.DARK_GRAY)
        val fontNormal = FontFactory.getFont(FontFactory.HELVETICA, 10f, BaseColor.BLACK)
        val fontCabeceraTabla = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 10f, BaseColor.WHITE)

        // 1. Título
        val titulo = Paragraph("Resumen Económico - ${casa.nombre}", fontTitulo)
        titulo.alignment = Element.ALIGN_CENTER
        document.add(titulo)

        val fechaGeneracion = Paragraph("Generado el: ${LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"))}", fontNormal)
        fechaGeneracion.alignment = Element.ALIGN_CENTER
        fechaGeneracion.spacingAfter = 20f
        document.add(fechaGeneracion)

        // 2. Resumen Total
        val totalGastado = casa.gastos.sumOf { it.importe }
        val resumen = Paragraph("Total Gastado: ${String.format("%.2f", totalGastado)} €", fontSubtitulo)
        resumen.spacingAfter = 15f
        document.add(resumen)

        // 3. Tabla de Gastos
        val table = PdfPTable(4)
        table.widthPercentage = 100f
        table.setWidths(floatArrayOf(2f, 3f, 2f, 2f)) // Proporción de columnas

        // Cabeceras
        val cabeceras = listOf("Fecha", "Concepto", "Pagado Por", "Importe")
        cabeceras.forEach { texto ->
            val cell = PdfPCell(Phrase(texto, fontCabeceraTabla))
            cell.backgroundColor = BaseColor(88, 51, 127) // ColorMoradoOscuro de tu app
            cell.horizontalAlignment = Element.ALIGN_CENTER
            //cell.padding = 8f
            table.addCell(cell)
        }

        // Filas de datos
        val dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy")
        casa.gastos.sortedByDescending { it.fechaInicio }.forEach { gasto ->

            val cellFecha = PdfPCell(Phrase(gasto.fechaInicio.format(dateFormatter), fontNormal))
            cellFecha.horizontalAlignment = Element.ALIGN_CENTER
            table.addCell(cellFecha)

            val cellConcepto = PdfPCell(Phrase(gasto.nombre, fontNormal))
            table.addCell(cellConcepto)

            val cellPagador = PdfPCell(Phrase(gasto.pagadoPor?.nombre ?: "Varios", fontNormal))
            cellPagador.horizontalAlignment = Element.ALIGN_CENTER
            table.addCell(cellPagador)

            val cellImporte = PdfPCell(Phrase("${String.format("%.2f", gasto.importe)} €", fontNormal))
            cellImporte.horizontalAlignment = Element.ALIGN_RIGHT
            table.addCell(cellImporte)
        }

        document.add(table)
        document.close()

        return out.toByteArray()
    }
}
