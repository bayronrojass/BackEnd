-- =================================================================================================
-- 1. USUARIOS (Sentencias individuales)
-- =================================================================================================
ALTER SEQUENCE IF EXISTS usuario_id_seq RESTART WITH 10;
INSERT INTO public.usuario (id, correo, nombre, contrasena) VALUES (1, 'u1@mail.com', 'Usuario 1 (Admin)', 'pass1') ON CONFLICT (id) DO NOTHING;
INSERT INTO public.usuario (id, correo, nombre, contrasena) VALUES (2, 'u2@mail.com', 'Usuario 2 (Miembro)', 'pass2') ON CONFLICT (id) DO NOTHING;
INSERT INTO public.usuario (id, correo, nombre, contrasena) VALUES (3, 'u3@mail.com', 'Usuario 3 (Miembro)', 'pass3') ON CONFLICT (id) DO NOTHING;

-- =================================================================================================
-- 2. LIENZOS
-- =================================================================================================
ALTER SEQUENCE IF EXISTS lienzo_id_seq RESTART WITH 10;
INSERT INTO public.lienzo (id, bytes, width, height, last_edited, is_image) VALUES (1, decode(repeat('00', 100), 'hex'), 100, 100, NOW(), false) ON CONFLICT (id) DO NOTHING;
INSERT INTO public.lienzo (id, bytes, width, height, last_edited, is_image) VALUES (2, decode(repeat('00', 100), 'hex'), 100, 100, NOW(), false) ON CONFLICT (id) DO NOTHING;
INSERT INTO public.lienzo (id, bytes, width, height, last_edited, is_image) VALUES (3, decode(repeat('00', 100), 'hex'), 100, 100, NOW(), false) ON CONFLICT (id) DO NOTHING;
INSERT INTO public.lienzo (id, bytes, width, height, last_edited, is_image) VALUES (4, decode(repeat('22', 100), 'hex'), 100, 100, NOW(), false) ON CONFLICT (id) DO NOTHING;
INSERT INTO public.lienzo (id, bytes, width, height, last_edited, is_image) VALUES (5, decode(repeat('33', 100), 'hex'), 100, 100, NOW(), false) ON CONFLICT (id) DO NOTHING;
INSERT INTO public.lienzo (id, bytes, width, height, last_edited, is_image) VALUES (6, decode(repeat('55', 100), 'hex'), 100, 100, NOW(), false) ON CONFLICT (id) DO NOTHING;

-- =================================================================================================
-- 3. CASAS
-- =================================================================================================
ALTER SEQUENCE IF EXISTS casa_id_seq RESTART WITH 10;
INSERT INTO public.casa (id, descripcion, fecha_creacion, lienzo_id, nombre, ruta_imagen) VALUES (1, 'Piso de Prueba', now(), 1, 'Piso de Prueba', 'ruta1.jpg') ON CONFLICT (id) DO NOTHING;
INSERT INTO public.casa (id, descripcion, fecha_creacion, lienzo_id, nombre, ruta_imagen) VALUES (2, 'Casa de la Playa', now(), 2, 'Casa Playa', 'ruta2.jpg') ON CONFLICT (id) DO NOTHING;
INSERT INTO public.casa (id, descripcion, fecha_creacion, lienzo_id, nombre, ruta_imagen) VALUES (3, 'Casa de la Montaña', now(), 3, 'Casa Montaña', 'ruta3.jpg') ON CONFLICT (id) DO NOTHING;

-- =================================================================================================
-- 4. ASIGNACIONES USUARIOS-CASA
-- =================================================================================================
INSERT INTO public.casa_usuarios (casa_id, usuarios_id) VALUES (1, 1) ON CONFLICT DO NOTHING;
INSERT INTO public.casa_usuarios (casa_id, usuarios_id) VALUES (1, 2) ON CONFLICT DO NOTHING;
INSERT INTO public.casa_usuarios (casa_id, usuarios_id) VALUES (1, 3) ON CONFLICT DO NOTHING;

INSERT INTO public.casa_administradores (casa_id, admin_id) VALUES (1, 1) ON CONFLICT DO NOTHING;

-- =================================================================================================
-- 5. ELEMENTOS Y TAREAS
-- =================================================================================================
ALTER SEQUENCE IF EXISTS tarea_id_seq RESTART WITH 20;

-- Elementos base
INSERT INTO public.elemento (id, completado, descripcion, nombre) VALUES (10, FALSE, 'Bajar al contenedor azul', 'Sacar basura (Mañana)') ON CONFLICT (id) DO NOTHING;
INSERT INTO public.elemento (id, completado, descripcion, nombre) VALUES (11, FALSE, 'Fregar azulejos', 'Limpiar Baño') ON CONFLICT (id) DO NOTHING;
INSERT INTO public.elemento (id, completado, descripcion, nombre) VALUES (12, FALSE, 'Hablar de gastos', 'Reunión de Piso') ON CONFLICT (id) DO NOTHING;

-- Tareas asociadas
INSERT INTO public.tarea (id, fecha_fin, frecuencia, periodica, asignadoa_id, casa_id) VALUES (10, NOW() + INTERVAL '1 day', 'Diaria', TRUE, 1, 1) ON CONFLICT (id) DO NOTHING;
INSERT INTO public.tarea (id, fecha_fin, frecuencia, periodica, asignadoa_id, casa_id) VALUES (11, NOW() + INTERVAL '3 days', 'Semanal', TRUE, 2, 1) ON CONFLICT (id) DO NOTHING;
INSERT INTO public.tarea (id, fecha_fin, frecuencia, periodica, asignadoa_id, casa_id) VALUES (12, NOW() + INTERVAL '7 days', NULL, FALSE, 3, 1) ON CONFLICT (id) DO NOTHING;

-- =================================================================================================
-- 6. GASTOS (IMPRESCINDIBLE PARA GRÁFICOS)
-- =================================================================================================
ALTER SEQUENCE IF EXISTS gasto_id_seq RESTART WITH 20;

INSERT INTO public.gasto (id, nombre, descripcion, importe, fecha_inicio, categoria, pagado_por_id) VALUES (1, 'Alquiler Noviembre', 'Pago mensual', 900.00, NOW(), 'ALQUILER', 1) ON CONFLICT (id) DO NOTHING;
INSERT INTO public.gasto (id, nombre, descripcion, importe, fecha_inicio, categoria, pagado_por_id) VALUES (2, 'Compra Mercadona', 'Comida semanal', 85.50, NOW(), 'COMIDA', 2) ON CONFLICT (id) DO NOTHING;
INSERT INTO public.gasto (id, nombre, descripcion, importe, fecha_inicio, categoria, pagado_por_id) VALUES (3, 'Factura Luz', 'Octubre', 45.20, NOW(), 'SUMINISTROS', 3) ON CONFLICT (id) DO NOTHING;
INSERT INTO public.gasto (id, nombre, descripcion, importe, fecha_inicio, categoria, pagado_por_id) VALUES (4, 'Cena Viernes', 'Pizzas', 32.00, NOW(), 'OCIO', 1) ON CONFLICT (id) DO NOTHING;
INSERT INTO public.gasto (id, nombre, descripcion, importe, fecha_inicio, categoria, pagado_por_id) VALUES (5, 'Limpieza', 'Lejía', 12.90, NOW(), 'OTROS', 2) ON CONFLICT (id) DO NOTHING;

INSERT INTO public.casa_gastos (casa_id, gastos_id) VALUES (1, 1) ON CONFLICT DO NOTHING;
INSERT INTO public.casa_gastos (casa_id, gastos_id) VALUES (1, 2) ON CONFLICT DO NOTHING;
INSERT INTO public.casa_gastos (casa_id, gastos_id) VALUES (1, 3) ON CONFLICT DO NOTHING;
INSERT INTO public.casa_gastos (casa_id, gastos_id) VALUES (1, 4) ON CONFLICT DO NOTHING;
INSERT INTO public.casa_gastos (casa_id, gastos_id) VALUES (1, 5) ON CONFLICT DO NOTHING;

-- =================================================================================================
-- 7. EVENTOS (IMPRESCINDIBLE PARA CALENDARIO)
-- =================================================================================================
-- Borramos datos viejos por seguridad
DELETE FROM public.casa_eventos WHERE eventos_id IN (1, 2, 3, 4, 5);
DELETE FROM public.evento WHERE id IN (1, 2, 3, 4, 5);

ALTER SEQUENCE IF EXISTS evento_id_seq RESTART WITH 10;

INSERT INTO public.evento (id, nombre, descripcion, fecha_inicio, creado_por_id) VALUES (1, 'Cena de Piso', 'Pizza y juegos', CURRENT_TIMESTAMP, 1) ON CONFLICT (id) DO NOTHING;
INSERT INTO public.evento (id, nombre, descripcion, fecha_inicio, creado_por_id) VALUES (2, 'Visita Casero', 'Revisión', CURRENT_DATE + INTERVAL '1 day' + TIME '10:00:00', 1) ON CONFLICT (id) DO NOTHING;
INSERT INTO public.evento (id, nombre, descripcion, fecha_inicio, creado_por_id) VALUES (3, 'Limpieza General', 'Toca baño', CURRENT_DATE + INTERVAL '3 day' + TIME '16:00:00', 2) ON CONFLICT (id) DO NOTHING;
INSERT INTO public.evento (id, nombre, descripcion, fecha_inicio, creado_por_id) VALUES (4, 'Cumpleaños', 'Regalo', CURRENT_DATE + INTERVAL '7 day' + TIME '21:00:00', 3) ON CONFLICT (id) DO NOTHING;
INSERT INTO public.evento (id, nombre, descripcion, fecha_inicio, creado_por_id) VALUES (5, 'Pagar Internet', 'Factura', CURRENT_DATE + INTERVAL '20 day' + TIME '09:00:00', 1) ON CONFLICT (id) DO NOTHING;

INSERT INTO public.casa_eventos (casa_id, eventos_id) VALUES (1, 1) ON CONFLICT DO NOTHING;
INSERT INTO public.casa_eventos (casa_id, eventos_id) VALUES (1, 2) ON CONFLICT DO NOTHING;
INSERT INTO public.casa_eventos (casa_id, eventos_id) VALUES (1, 3) ON CONFLICT DO NOTHING;
INSERT INTO public.casa_eventos (casa_id, eventos_id) VALUES (1, 4) ON CONFLICT DO NOTHING;
INSERT INTO public.casa_eventos (casa_id, eventos_id) VALUES (1, 5) ON CONFLICT DO NOTHING;

-- =================================================================================================
-- 8. OTROS
-- =================================================================================================
ALTER SEQUENCE IF EXISTS invitacion_id_seq RESTART WITH 10;
INSERT INTO public.invitacion (id, remitente_id, destinatario_id, casa_id, fecha_creacion, estado) VALUES (1, 1, 2, 1, NOW(), 'PENDIENTE') ON CONFLICT (id) DO NOTHING;

INSERT INTO public.notificacion (id, dtype, cuerpo, titulo) VALUES (1, 'Push', 'Cuerpo 1', 'Titulo1') ON CONFLICT (id) DO NOTHING;
INSERT INTO public.notificacion_receptor (notificacion_id, receptor_id) VALUES (1, 1) ON CONFLICT DO NOTHING;