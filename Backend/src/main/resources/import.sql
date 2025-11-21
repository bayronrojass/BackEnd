-- =================================================================================================
-- 1. USUARIOS
-- =================================================================================================
ALTER SEQUENCE IF EXISTS usuario_id_seq RESTART WITH 10;
INSERT INTO public.usuario (id, correo, nombre, contrasena) VALUES (1,'u1@mail.com', 'Usuario1', '1') ON CONFLICT (id) DO NOTHING;
INSERT INTO public.usuario (id, correo, nombre, contrasena) VALUES (2,'u2@mail.com', 'Usuario2', '2') ON CONFLICT (id) DO NOTHING;
INSERT INTO public.usuario (id, correo, nombre, contrasena) VALUES (3,'u3@mail.com', 'Usuario3', '3') ON CONFLICT (id) DO NOTHING;
INSERT INTO public.usuario (id, correo, nombre, contrasena) VALUES (4,'i4@mail.com', 'Invitado', '4') ON CONFLICT (id) DO NOTHING;

-- =================================================================================================
-- 2. LIENZOS
-- =================================================================================================
ALTER SEQUENCE IF EXISTS lienzo_id_seq RESTART WITH 10;
INSERT INTO public.lienzo (id, bytes, width, height, is_image, last_edited) VALUES (1,decode(repeat('88', 1875000), 'hex'), 1500, 2500, false,NOW()) ON CONFLICT (id) DO NOTHING;
INSERT INTO public.lienzo (id, bytes, width, height, is_image, last_edited) VALUES (2,decode(repeat('88', 1875000), 'hex'), 1500, 2500,false, NOW()) ON CONFLICT (id) DO NOTHING;
INSERT INTO public.lienzo (id, bytes, width, height, is_image, last_edited) VALUES (3,decode(repeat('88', 1875000), 'hex'), 1500, 2500,false, NOW()) ON CONFLICT (id) DO NOTHING;
INSERT INTO public.lienzo (id, bytes, width, height, is_image, last_edited) VALUES (4,decode(repeat('22', 1875000), 'hex'), 1500, 2500,false, NOW()) ON CONFLICT (id) DO NOTHING;
INSERT INTO public.lienzo (id, bytes, width, height, is_image, last_edited) VALUES (5,decode(repeat('33', 1875000), 'hex'), 1500, 2500,false, NOW()) ON CONFLICT (id) DO NOTHING;
INSERT INTO public.lienzo (id, bytes, width, height, is_image, last_edited) VALUES (6,decode(repeat('55', 1875000), 'hex'), 1500, 2500,false, NOW()) ON CONFLICT (id) DO NOTHING;

-- =================================================================================================
-- 3. CASAS
-- =================================================================================================
ALTER SEQUENCE IF EXISTS casa_id_seq RESTART WITH 10;
INSERT INTO public.casa (id, descripcion, fecha_creacion, lienzo_id, nombre, ruta_imagen) VALUES (1, 'Casa 1', now(), 1, 'Casa1', 'ruta1.jpg') ON CONFLICT (id) DO NOTHING;
INSERT INTO public.casa (id, descripcion, fecha_creacion, lienzo_id, nombre, ruta_imagen) VALUES (2, 'Casa 2', now(), 2, 'Casa2', 'ruta2.jpg') ON CONFLICT (id) DO NOTHING;
INSERT INTO public.casa (id, descripcion, fecha_creacion, lienzo_id, nombre, ruta_imagen) VALUES (3, 'Casa 3', now(), 3, 'Casa3', 'ruta3.jpg') ON CONFLICT (id) DO NOTHING;

-- Relaciones
INSERT INTO public.casa_usuarios (casa_id, usuarios_id) VALUES (1, 1) ON CONFLICT DO NOTHING;
INSERT INTO public.casa_usuarios (casa_id, usuarios_id) VALUES (1, 2) ON CONFLICT DO NOTHING;
INSERT INTO public.casa_usuarios (casa_id, usuarios_id) VALUES (1, 3) ON CONFLICT DO NOTHING;
INSERT INTO public.casa_usuarios (casa_id, usuarios_id) VALUES (2, 4) ON CONFLICT DO NOTHING;
INSERT INTO public.casa_administradores (casa_id, admin_id) VALUES (1, 1) ON CONFLICT DO NOTHING;

-- =================================================================================================
-- 4. GASTOS (CORREGIDO: Inserción línea a línea para evitar error de sintaxis)
-- =================================================================================================
ALTER SEQUENCE IF EXISTS gasto_id_seq RESTART WITH 20;

-- Nota: Incluimos importe, categoria y pagado_por_id porque tu Entidad Java ahora los requiere (nullable=false)
INSERT INTO public.gasto (id, nombre, descripcion, importe, fecha_inicio, categoria, pagado_por_id) VALUES (1, 'Alquiler Noviembre', 'Pago mensual', 900.00, NOW(), 'ALQUILER', 1) ON CONFLICT (id) DO NOTHING;
INSERT INTO public.gasto (id, nombre, descripcion, importe, fecha_inicio, categoria, pagado_por_id) VALUES (2, 'Compra Mercadona', 'Comida semanal', 85.50, NOW(), 'COMIDA', 2) ON CONFLICT (id) DO NOTHING;
INSERT INTO public.gasto (id, nombre, descripcion, importe, fecha_inicio, categoria, pagado_por_id) VALUES (3, 'Factura Luz', 'Octubre', 45.20, NOW(), 'SUMINISTROS', 3) ON CONFLICT (id) DO NOTHING;
INSERT INTO public.gasto (id, nombre, descripcion, importe, fecha_inicio, categoria, pagado_por_id) VALUES (4, 'Cena Viernes', 'Pizzas', 32.00, NOW(), 'OCIO', 1) ON CONFLICT (id) DO NOTHING;
INSERT INTO public.gasto (id, nombre, descripcion, importe, fecha_inicio, categoria, pagado_por_id) VALUES (5, 'Limpieza', 'Lejía', 12.90, NOW(), 'OTROS', 2) ON CONFLICT (id) DO NOTHING;

-- Relación Casa-Gasto (Ahora sí funcionará porque los gastos se crean línea a línea antes)
INSERT INTO public.casa_gastos (casa_id, gastos_id) VALUES (1, 1) ON CONFLICT DO NOTHING;
INSERT INTO public.casa_gastos (casa_id, gastos_id) VALUES (1, 2) ON CONFLICT DO NOTHING;
INSERT INTO public.casa_gastos (casa_id, gastos_id) VALUES (1, 3) ON CONFLICT DO NOTHING;
INSERT INTO public.casa_gastos (casa_id, gastos_id) VALUES (1, 4) ON CONFLICT DO NOTHING;
INSERT INTO public.casa_gastos (casa_id, gastos_id) VALUES (1, 5) ON CONFLICT DO NOTHING;

-- Pagos y relación
INSERT INTO public.pago (id, cantidad, fecha, pagado_por_id) VALUES (1, 900.00, now(), 1) ON CONFLICT (id) DO NOTHING;
INSERT INTO public.pago (id, cantidad, fecha, pagado_por_id) VALUES (2, 85.50, now(), 2) ON CONFLICT (id) DO NOTHING;
INSERT INTO public.pago (id, cantidad, fecha, pagado_por_id) VALUES (3, 45.20, now(), 3) ON CONFLICT (id) DO NOTHING;
INSERT INTO public.gasto_pagos (gasto_id, pagos_id) VALUES (1, 1) ON CONFLICT DO NOTHING;
INSERT INTO public.gasto_pagos (gasto_id, pagos_id) VALUES (2, 2) ON CONFLICT DO NOTHING;
INSERT INTO public.gasto_pagos (gasto_id, pagos_id) VALUES (3, 3) ON CONFLICT DO NOTHING;


-- =================================================================================================
-- 5. EVENTOS (CORREGIDO: Inserción línea a línea)
-- =================================================================================================
ALTER SEQUENCE IF EXISTS evento_id_seq RESTART WITH 20;

-- Limpiamos para evitar duplicados raros si recargas
DELETE FROM public.casa_eventos WHERE eventos_id IN (1, 2, 3, 4, 5);
DELETE FROM public.evento WHERE id IN (1, 2, 3, 4, 5);

INSERT INTO public.evento (id, nombre, descripcion, fecha_inicio, creado_por_id) VALUES (1, 'Cena de Piso', 'Pizza y juegos', CURRENT_TIMESTAMP, 1) ON CONFLICT (id) DO NOTHING;
INSERT INTO public.evento (id, nombre, descripcion, fecha_inicio, creado_por_id) VALUES (2, 'Visita Casero', 'Revisión', CURRENT_DATE + INTERVAL '1 day' + TIME '10:00:00', 2) ON CONFLICT (id) DO NOTHING;
INSERT INTO public.evento (id, nombre, descripcion, fecha_inicio, creado_por_id) VALUES (3, 'Limpieza General', 'Toca baño', CURRENT_DATE + INTERVAL '3 day' + TIME '16:00:00', 3) ON CONFLICT (id) DO NOTHING;
INSERT INTO public.evento (id, nombre, descripcion, fecha_inicio, creado_por_id) VALUES (4, 'Cumpleaños', 'Regalo', CURRENT_DATE + INTERVAL '7 day' + TIME '21:00:00', 1) ON CONFLICT (id) DO NOTHING;
INSERT INTO public.evento (id, nombre, descripcion, fecha_inicio, creado_por_id) VALUES (5, 'Pagar Internet', 'Factura', CURRENT_DATE + INTERVAL '20 day' + TIME '09:00:00', 1) ON CONFLICT (id) DO NOTHING;

INSERT INTO public.casa_eventos (casa_id, eventos_id) VALUES (1, 1) ON CONFLICT DO NOTHING;
INSERT INTO public.casa_eventos (casa_id, eventos_id) VALUES (1, 2) ON CONFLICT DO NOTHING;
INSERT INTO public.casa_eventos (casa_id, eventos_id) VALUES (1, 3) ON CONFLICT DO NOTHING;
INSERT INTO public.casa_eventos (casa_id, eventos_id) VALUES (1, 4) ON CONFLICT DO NOTHING;
INSERT INTO public.casa_eventos (casa_id, eventos_id) VALUES (1, 5) ON CONFLICT DO NOTHING;

INSERT INTO public.evento_asistentes (evento_id, asistentes_id) VALUES (1, 2) ON CONFLICT DO NOTHING;
INSERT INTO public.evento_asistentes (evento_id, asistentes_id) VALUES (2, 3) ON CONFLICT DO NOTHING;
INSERT INTO public.evento_asistentes (evento_id, asistentes_id) VALUES (3, 1) ON CONFLICT DO NOTHING;

-- =================================================================================================
-- 6. ELEMENTOS Y TAREAS (Resto de datos)
-- =================================================================================================
INSERT INTO public.elemento (id, completado, descripcion, nombre) VALUES (1, TRUE, 'Elemento 1', 'Elem1') ON CONFLICT (id) DO NOTHING;
INSERT INTO public.elemento (id, completado, descripcion, nombre) VALUES (2, FALSE, 'Elemento 2', 'Elem2') ON CONFLICT (id) DO NOTHING;
INSERT INTO public.elemento (id, completado, descripcion, nombre) VALUES (3, TRUE, 'Elemento 3', 'Elem3') ON CONFLICT (id) DO NOTHING;
INSERT INTO public.elemento (id, completado, descripcion, nombre) VALUES (10, FALSE, 'Bajar al contenedor azul', 'Sacar basura (Mañana)') ON CONFLICT (id) DO NOTHING;
INSERT INTO public.elemento (id, completado, descripcion, nombre) VALUES (11, FALSE, 'Fregar azulejos', 'Limpiar Baño') ON CONFLICT (id) DO NOTHING;
INSERT INTO public.elemento (id, completado, descripcion, nombre) VALUES (12, FALSE, 'Hablar de gastos', 'Reunión de Piso') ON CONFLICT (id) DO NOTHING;

ALTER SEQUENCE IF EXISTS tarea_id_seq RESTART WITH 20;
INSERT INTO public.tarea (id, fecha_fin, frecuencia, periodica, casa_id, asignadoa_id) VALUES (1, now(), 'Semanal', TRUE, 1, 1) ON CONFLICT (id) DO NOTHING;
INSERT INTO public.tarea (id, fecha_fin, frecuencia, periodica, casa_id, asignadoa_id) VALUES (2, now(), 'Mensual', FALSE, 1, 2) ON CONFLICT (id) DO NOTHING;
INSERT INTO public.tarea (id, fecha_fin, frecuencia, periodica, casa_id, asignadoa_id) VALUES (3, now(), 'Diaria', TRUE, 1, 3) ON CONFLICT (id) DO NOTHING;
INSERT INTO public.tarea (id, fecha_fin, frecuencia, periodica, casa_id, asignadoa_id) VALUES (10, NOW() + INTERVAL '1 day', 'Diaria', TRUE, 1, 1) ON CONFLICT (id) DO NOTHING;
INSERT INTO public.tarea (id, fecha_fin, frecuencia, periodica, casa_id, asignadoa_id) VALUES (11, NOW() + INTERVAL '3 days', 'Semanal', TRUE, 1, 2) ON CONFLICT (id) DO NOTHING;
INSERT INTO public.tarea (id, fecha_fin, frecuencia, periodica, casa_id, asignadoa_id) VALUES (12, NOW() + INTERVAL '7 days', NULL, FALSE, 1, 3) ON CONFLICT (id) DO NOTHING;

-- =================================================================================================
-- 7. OTROS (Listas, Multimedia, etc.)
-- =================================================================================================
INSERT INTO public.lista (id, descripcion, nombre) VALUES (1, 'Lista 1', 'Lista1') ON CONFLICT (id) DO NOTHING;
INSERT INTO public.lista (id, descripcion, nombre) VALUES (2, 'Lista 2', 'Lista2') ON CONFLICT (id) DO NOTHING;
INSERT INTO public.lista (id, descripcion, nombre) VALUES (3, 'Lista 3', 'Lista3') ON CONFLICT (id) DO NOTHING;
INSERT INTO public.casa_listas (casa_id, listas_id) VALUES (1, 1) ON CONFLICT DO NOTHING;
INSERT INTO public.casa_listas (casa_id, listas_id) VALUES (1, 2) ON CONFLICT DO NOTHING;
INSERT INTO public.casa_listas (casa_id, listas_id) VALUES (1, 3) ON CONFLICT DO NOTHING;
INSERT INTO public.lista_elementos (lista_id, elementos_id) VALUES (1, 1) ON CONFLICT DO NOTHING;
INSERT INTO public.lista_elementos (lista_id, elementos_id) VALUES (2, 2) ON CONFLICT DO NOTHING;
INSERT INTO public.lista_elementos (lista_id, elementos_id) VALUES (3, 3) ON CONFLICT DO NOTHING;

ALTER SEQUENCE IF EXISTS notificacion_id_seq RESTART WITH 10;
INSERT INTO public.notificacion (id, dtype, cuerpo, titulo) VALUES (1, 'Push', 'Cuerpo 1', 'Titulo1') ON CONFLICT (id) DO NOTHING;
INSERT INTO public.notificacion (id, dtype, cuerpo, titulo) VALUES (2, 'Push', 'Cuerpo 2', 'Titulo2') ON CONFLICT (id) DO NOTHING;
INSERT INTO public.notificacion (id, dtype, cuerpo, titulo) VALUES (3, 'PopUp', 'Cuerpo 3', 'Titulo3') ON CONFLICT (id) DO NOTHING;
INSERT INTO public.casa_notifaciones (casa_id, notifaciones_id) VALUES (1, 1) ON CONFLICT DO NOTHING;
INSERT INTO public.casa_notifaciones (casa_id, notifaciones_id) VALUES (1, 2) ON CONFLICT DO NOTHING;
INSERT INTO public.casa_notifaciones (casa_id, notifaciones_id) VALUES (1, 3) ON CONFLICT DO NOTHING;
INSERT INTO public.notificacion_receptor (notificacion_id, receptor_id) VALUES (1, 1) ON CONFLICT DO NOTHING;

INSERT INTO public.opcion (id, nombre) VALUES (1, 'Opcion1') ON CONFLICT (id) DO NOTHING;
INSERT INTO public.opcion (id, nombre) VALUES (2, 'Opcion2') ON CONFLICT (id) DO NOTHING;
INSERT INTO public.opcion (id, nombre) VALUES (3, 'Opcion3') ON CONFLICT (id) DO NOTHING;

INSERT INTO public.voto (id, votante_id) VALUES (1, 1) ON CONFLICT (id) DO NOTHING;
INSERT INTO public.voto (id, votante_id) VALUES (2, 2) ON CONFLICT (id) DO NOTHING;
INSERT INTO public.voto (id, votante_id) VALUES (3, 3) ON CONFLICT (id) DO NOTHING;

INSERT INTO public.resumen (id) VALUES (1) ON CONFLICT (id) DO NOTHING;
INSERT INTO public.resumen (id) VALUES (2) ON CONFLICT (id) DO NOTHING;
INSERT INTO public.resumen (id) VALUES (3) ON CONFLICT (id) DO NOTHING;

INSERT INTO public.multimedia (id, posicionx, posiciony, width, height, ruta, usuario_id, casa_id) VALUES (1, 200, 200, 450, 400, 'rutaA', 1, 1) ON CONFLICT (id) DO NOTHING;
INSERT INTO public.multimedia (id, posicionx, posiciony, width, height, ruta, usuario_id, casa_id) VALUES (2, 300, 490, 450, 400, 'rutaB', 2, 2) ON CONFLICT (id) DO NOTHING;
INSERT INTO public.multimedia (id, posicionx, posiciony, width, height, ruta, usuario_id, casa_id) VALUES (3, 300, 500,450, 400, 'rutaC', 3, 3) ON CONFLICT (id) DO NOTHING;

INSERT INTO public.post_it (id, lienzo_id, plegado) VALUES (1, 4, false) ON CONFLICT (id) DO NOTHING;
INSERT INTO public.post_it (id, lienzo_id, plegado) VALUES (2, 5, false) ON CONFLICT (id) DO NOTHING;
INSERT INTO public.post_it (id, lienzo_id, plegado) VALUES (3, 6, false) ON CONFLICT (id) DO NOTHING;

ALTER SEQUENCE IF EXISTS invitacion_id_seq RESTART WITH 10;
INSERT INTO public.invitacion (id, remitente_id, destinatario_id, casa_id, fecha_creacion, estado) VALUES (1, 1, 4, 1, NOW(), 'PENDIENTE') ON CONFLICT (id) DO NOTHING;

INSERT INTO public.item (id) VALUES (1),(2),(3) ON CONFLICT (id) DO NOTHING;