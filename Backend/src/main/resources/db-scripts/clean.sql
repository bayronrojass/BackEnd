-- ⚠️ IMPORTANTE:
-- Este script borra TODO el contenido de las tablas, pero conserva la estructura.
-- Úsalo solo en entornos de desarrollo o pruebas.

-- 1️⃣ Desactiva temporalmente las restricciones de integridad referencial
SET session_replication_role = replica;

-- 2️⃣ Limpieza de todas las tablas (orden inverso al de dependencias)
TRUNCATE TABLE
    public.opcion_votos,
    public.encuesta_opciones,
    public.encuesta,
    public.audio,
    public.imagen,
    public.post_it,
    public.tarea,
    public.item,
    public.gasto_pagos,
    public.pago,
    public.evento_asistentes,
    public.casa_eventos,
    public.evento,
    public.casa_multimedia,
    public.multimedia,
    public.casa_lienzos,
    public.casa_listas,
    public.lista_elementos,
    public.lista,
    public.lienzo,
    public.casa_notifaciones,
    public.notificacion,
    public.casa_gastos,
    public.gasto,
    public.casa_administradores,
    public.casa_usuarios,
    public.invitacion,
    public.voto,
    public.opcion,
    public.elemento,
    public.resumen,
    public.casa,
    public.usuario
RESTART IDENTITY CASCADE;

-- 3️⃣ Reactiva las restricciones
SET session_replication_role = DEFAULT;

-- 4️⃣ Confirmación
SELECT '✅ Tablas limpiadas y secuencias reiniciadas correctamente.' AS resultado;
