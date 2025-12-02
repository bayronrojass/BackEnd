-- =================================================================================================
-- 1. USUARIOS
-- =================================================================================================
ALTER SEQUENCE IF EXISTS usuario_id_seq RESTART WITH 10;
INSERT INTO public.usuario (id, correo, nombre, contrasena) VALUES (1,'u1@mail.com', 'Natalia', '1') ON CONFLICT (id) DO NOTHING;
INSERT INTO public.usuario (id, correo, nombre, contrasena) VALUES (2,'u2@mail.com', 'Manolo', '2') ON CONFLICT (id) DO NOTHING;
INSERT INTO public.usuario (id, correo, nombre, contrasena) VALUES (3,'u3@mail.com', 'David', '3') ON CONFLICT (id) DO NOTHING;
INSERT INTO public.usuario (id, correo, nombre, contrasena) VALUES (4,'i4@mail.com', 'Paula', '4') ON CONFLICT (id) DO NOTHING;

-- =================================================================================================
-- 2. LIENZOS
-- =================================================================================================
ALTER SEQUENCE IF EXISTS lienzo_id_seq RESTART WITH 10;
INSERT INTO public.lienzo (id, bytes, width, height, last_edited, is_image) VALUES (1, decode(repeat('88', 100), 'hex'), 1500, 2500, NOW(), false) ON CONFLICT (id) DO NOTHING;
INSERT INTO public.lienzo (id, bytes, width, height, last_edited, is_image) VALUES (2, decode(repeat('88', 100), 'hex'), 1500, 2500, NOW(), false) ON CONFLICT (id) DO NOTHING;
INSERT INTO public.lienzo (id, bytes, width, height, last_edited, is_image) VALUES (3, decode(repeat('88', 100), 'hex'), 1500, 2500, NOW(), false) ON CONFLICT (id) DO NOTHING;
INSERT INTO public.lienzo (id, bytes, width, height, last_edited, is_image) VALUES (4, decode(repeat('22', 100), 'hex'), 1500, 2500, NOW(), false) ON CONFLICT (id) DO NOTHING;
INSERT INTO public.lienzo (id, bytes, width, height, last_edited, is_image) VALUES (5, decode(repeat('33', 100), 'hex'), 1500, 2500, NOW(), false) ON CONFLICT (id) DO NOTHING;
INSERT INTO public.lienzo (id, bytes, width, height, last_edited, is_image) VALUES (6, decode(repeat('55', 100), 'hex'), 1500, 2500, NOW(), false) ON CONFLICT (id) DO NOTHING;

-- =================================================================================================
-- 3. CASAS
-- =================================================================================================
ALTER SEQUENCE IF EXISTS casa_id_seq RESTART WITH 10;
INSERT INTO public.casa (id, descripcion, fecha_creacion, lienzo_id, nombre, ruta_imagen) VALUES (1, 'DANI MOROSO', now(), 1, 'Escultor José Capuz 29', 'ruta1.jpg') ON CONFLICT (id) DO NOTHING;
INSERT INTO public.casa (id, descripcion, fecha_creacion, lienzo_id, nombre, ruta_imagen) VALUES (2, 'Prohibida la entrada a pelirrojos', now(), 2, 'Matías Perelló 12', 'ruta2.jpg') ON CONFLICT (id) DO NOTHING;
INSERT INTO public.casa (id, descripcion, fecha_creacion, lienzo_id, nombre, ruta_imagen) VALUES (3, 'La casa del terror', now(), 3, 'Av. Dr. Waksman 33', 'ruta3.jpg') ON CONFLICT (id) DO NOTHING;

-- Relaciones Casa-Usuario
INSERT INTO public.casa_usuarios (casa_id, usuarios_id) VALUES (1, 1) ON CONFLICT DO NOTHING;
INSERT INTO public.casa_usuarios (casa_id, usuarios_id) VALUES (1, 2) ON CONFLICT DO NOTHING;
INSERT INTO public.casa_usuarios (casa_id, usuarios_id) VALUES (1, 3) ON CONFLICT DO NOTHING;
INSERT INTO public.casa_usuarios (casa_id, usuarios_id) VALUES (2, 4) ON CONFLICT DO NOTHING;
INSERT INTO public.casa_administradores (casa_id, admin_id) VALUES (1, 1) ON CONFLICT DO NOTHING;

-- =================================================================================================
-- 4. ELEMENTOS
-- =================================================================================================
ALTER SEQUENCE IF EXISTS elemento_id_seq RESTART WITH 20;
INSERT INTO public.elemento (id, completado, descripcion, nombre) VALUES (1, TRUE, '2 barras', 'Pan') ON CONFLICT (id) DO NOTHING;
INSERT INTO public.elemento (id, completado, descripcion, nombre) VALUES (2, FALSE, 'Para limpiar el baño', 'Lejía') ON CONFLICT (id) DO NOTHING;
INSERT INTO public.elemento (id, completado, descripcion, nombre) VALUES (3, TRUE, 'Está caro', 'Pollo') ON CONFLICT (id) DO NOTHING;
-- Elementos extra para tareas
INSERT INTO public.elemento (id, completado, descripcion, nombre) VALUES (10, FALSE, 'Bajar al contenedor azul', 'Sacar basura (Mañana)') ON CONFLICT (id) DO NOTHING;
INSERT INTO public.elemento (id, completado, descripcion, nombre) VALUES (11, FALSE, 'Fregar azulejos', 'Limpiar Baño') ON CONFLICT (id) DO NOTHING;
INSERT INTO public.elemento (id, completado, descripcion, nombre) VALUES (12, FALSE, 'Hablar de gastos', 'Reunión de Piso') ON CONFLICT (id) DO NOTHING;


-- =================================================================================================
-- 5. GASTOS
-- =================================================================================================
ALTER SEQUENCE IF EXISTS gasto_id_seq RESTART WITH 20;

-- Insertamos uno a uno para evitar errores de sintaxis
INSERT INTO public.gasto (id, nombre, descripcion, importe, fecha_inicio, categoria, pagado_por_id) VALUES (1, 'Alquiler Noviembre', 'Pago mensual', 900.00, NOW(), 'ALQUILER', 1) ON CONFLICT (id) DO NOTHING;
INSERT INTO public.gasto (id, nombre, descripcion, importe, fecha_inicio, categoria, pagado_por_id) VALUES (2, 'Compra Mercadona', 'Comida semanal', 85.50, NOW(), 'COMIDA', 2) ON CONFLICT (id) DO NOTHING;
INSERT INTO public.gasto (id, nombre, descripcion, importe, fecha_inicio, categoria, pagado_por_id) VALUES (3, 'Factura Luz', 'Octubre', 45.20, NOW(), 'SUMINISTROS', 3) ON CONFLICT (id) DO NOTHING;
INSERT INTO public.gasto (id, nombre, descripcion, importe, fecha_inicio, categoria, pagado_por_id) VALUES (4, 'Cena Viernes', 'Pizzas', 32.00, NOW(), 'OCIO', 1) ON CONFLICT (id) DO NOTHING;
INSERT INTO public.gasto (id, nombre, descripcion, importe, fecha_inicio, categoria, pagado_por_id) VALUES (5, 'Limpieza', 'Lejía', 12.90, NOW(), 'OTROS', 2) ON CONFLICT (id) DO NOTHING;

-- Relación Casa-Gasto
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
-- 6. EVENTOS
-- =================================================================================================
ALTER SEQUENCE IF EXISTS evento_id_seq RESTART WITH 20;

-- Limpieza previa
DELETE FROM public.casa_eventos WHERE eventos_id IN (1, 2, 3, 4, 5);
DELETE FROM public.evento WHERE id IN (1, 2, 3, 4, 5);

INSERT INTO public.evento (id, nombre, descripcion, fecha_inicio, creado_por_id, fecha_creacion) VALUES (1, 'Cena de Piso', 'Pizza y juegos', CURRENT_TIMESTAMP, 1, NOW()) ON CONFLICT (id) DO NOTHING;
INSERT INTO public.evento (id, nombre, descripcion, fecha_inicio, creado_por_id, fecha_creacion) VALUES (2, 'Visita Casero', 'Revisión', CURRENT_DATE + INTERVAL '1 day' + TIME '10:00:00', 2, NOW()) ON CONFLICT (id) DO NOTHING;
INSERT INTO public.evento (id, nombre, descripcion, fecha_inicio, creado_por_id, fecha_creacion) VALUES (3, 'Limpieza General', 'Toca baño', CURRENT_DATE + INTERVAL '3 day' + TIME '16:00:00', 3, NOW()) ON CONFLICT (id) DO NOTHING;
INSERT INTO public.evento (id, nombre, descripcion, fecha_inicio, creado_por_id, fecha_creacion) VALUES (4, 'Cumpleaños', 'Regalo', CURRENT_DATE + INTERVAL '7 day' + TIME '21:00:00', 1, NOW()) ON CONFLICT (id) DO NOTHING;
INSERT INTO public.evento (id, nombre, descripcion, fecha_inicio, creado_por_id, fecha_creacion) VALUES (5, 'Pagar Internet', 'Factura', CURRENT_DATE + INTERVAL '20 day' + TIME '09:00:00', 1, NOW()) ON CONFLICT (id) DO NOTHING;

-- Relación Casa-Eventos
INSERT INTO public.casa_eventos (casa_id, eventos_id) VALUES (1, 1) ON CONFLICT DO NOTHING;
INSERT INTO public.casa_eventos (casa_id, eventos_id) VALUES (1, 2) ON CONFLICT DO NOTHING;
INSERT INTO public.casa_eventos (casa_id, eventos_id) VALUES (1, 3) ON CONFLICT DO NOTHING;
INSERT INTO public.casa_eventos (casa_id, eventos_id) VALUES (1, 4) ON CONFLICT DO NOTHING;
INSERT INTO public.casa_eventos (casa_id, eventos_id) VALUES (1, 5) ON CONFLICT DO NOTHING;

-- Asistentes
INSERT INTO public.evento_asistentes (evento_id, usuario_id) VALUES (1, 2) ON CONFLICT DO NOTHING;
INSERT INTO public.evento_asistentes (evento_id, usuario_id) VALUES (2, 3) ON CONFLICT DO NOTHING;
INSERT INTO public.evento_asistentes (evento_id, usuario_id) VALUES (3, 1) ON CONFLICT DO NOTHING;


-- =================================================================================================
-- 7. OTROS (Listas, Tareas, etc.)
-- =================================================================================================
INSERT INTO public.lista (id, descripcion, nombre) VALUES (1, 'Lista 1', 'Lista Natalia') ON CONFLICT (id) DO NOTHING;
INSERT INTO public.lista (id, descripcion, nombre) VALUES (2, 'Lista 2', 'Tareas x hacer') ON CONFLICT (id) DO NOTHING;
INSERT INTO public.lista (id, descripcion, nombre) VALUES (3, 'Lista 3', 'Lista David') ON CONFLICT (id) DO NOTHING;
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

ALTER SEQUENCE IF EXISTS tarea_id_seq RESTART WITH 20;
INSERT INTO public.tarea (id, fecha_fin, frecuencia, periodica, casa_id, asignadoa_id, completado, nombre) VALUES (1, now(), 'Semanal', TRUE, 1, 1, false, 'Sacar basura (Mañana)') ON CONFLICT (id) DO NOTHING;
INSERT INTO public.tarea (id, fecha_fin, frecuencia, periodica, casa_id, asignadoa_id, completado, nombre) VALUES (2, now(), 'Mensual', FALSE, 1, 2, false, 'Limpiar Baño') ON CONFLICT (id) DO NOTHING;
INSERT INTO public.tarea (id, fecha_fin, frecuencia, periodica, casa_id, asignadoa_id, completado, nombre) VALUES (3, now(), 'Diaria', TRUE, 1, 3, false, 'Reunion piso') ON CONFLICT (id) DO NOTHING;
INSERT INTO public.tarea (id, fecha_fin, frecuencia, periodica, casa_id, asignadoa_id, completado, nombre) VALUES (10, NOW() + INTERVAL '1 day', 'Diaria', TRUE, 1, 1, false, 'Cargar el lavaplatos') ON CONFLICT (id) DO NOTHING;
INSERT INTO public.tarea (id, fecha_fin, frecuencia, periodica, casa_id, asignadoa_id, completado, nombre) VALUES (11, NOW() + INTERVAL '3 days', 'Semanal', TRUE, 1, 2, false, 'Ir a la lavandería') ON CONFLICT (id) DO NOTHING;
INSERT INTO public.tarea (id, fecha_fin, frecuencia, periodica, casa_id, asignadoa_id, completado, nombre) VALUES (12, NOW() + INTERVAL '7 days', 'Mensual', FALSE, 1, 3, false,'Pasar la aspiradora') ON CONFLICT (id) DO NOTHING;

INSERT INTO public.post_it (id, lienzo_id, localizacion) VALUES (1, 4, "Home") ON CONFLICT (id) DO NOTHING;
INSERT INTO public.post_it (id, lienzo_id, localizacion) VALUES (2, 5, "Home") ON CONFLICT (id) DO NOTHING;
INSERT INTO public.post_it (id, lienzo_id, localizacion) VALUES (3, 6, "Home") ON CONFLICT (id) DO NOTHING;

ALTER SEQUENCE IF EXISTS invitacion_id_seq RESTART WITH 10;
INSERT INTO public.invitacion (id, remitente_id, destinatario_id, casa_id, fecha_creacion, estado) VALUES (1, 1, 4, 1, NOW(), 'PENDIENTE') ON CONFLICT (id) DO NOTHING;

INSERT INTO public.item (id) VALUES (1),(2),(3) ON CONFLICT (id) DO NOTHING;
