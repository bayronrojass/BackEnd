-- =================================================================================================
-- 1. USUARIOS
-- =================================================================================================
ALTER SEQUENCE IF EXISTS usuario_id_seq RESTART WITH 10;
INSERT INTO public.usuario (id, correo, nombre, contrasena, puntos_convivencia) VALUES (1,'u1@mail.com', 'Natalia', '1', 0) ON CONFLICT (id) DO NOTHING;
INSERT INTO public.usuario (id, correo, nombre, contrasena, puntos_convivencia) VALUES (2,'u2@mail.com', 'Manolo', '2', 10) ON CONFLICT (id) DO NOTHING;
INSERT INTO public.usuario (id, correo, nombre, contrasena, puntos_convivencia) VALUES (3,'u3@mail.com', 'David', '3', 50) ON CONFLICT (id) DO NOTHING;
INSERT INTO public.usuario (id, correo, nombre, contrasena, puntos_convivencia) VALUES (4,'i4@mail.com', 'Paula', '4', 100) ON CONFLICT (id) DO NOTHING;

-- =================================================================================================
-- 2. LIENZOS
-- =================================================================================================
ALTER SEQUENCE IF EXISTS lienzo_id_seq RESTART WITH 10;
INSERT INTO public.lienzo (id, bytes, width, height, last_edited, is_image) VALUES (1, decode(repeat('00', 500000), 'hex'), 1000, 1000, NOW(), false) ON CONFLICT (id) DO NOTHING;
INSERT INTO public.lienzo (id, bytes, width, height, last_edited, is_image) VALUES (2, decode(repeat('00', 500000), 'hex'), 1000, 1000, NOW(), false) ON CONFLICT (id) DO NOTHING;
INSERT INTO public.lienzo (id, bytes, width, height, last_edited, is_image) VALUES (3, decode(repeat('00', 500000), 'hex'), 1000, 1000, NOW(), false) ON CONFLICT (id) DO NOTHING;
INSERT INTO public.lienzo (id, bytes, width, height, last_edited, is_image) VALUES (4, decode(repeat('00', 500000), 'hex'), 1000, 1000, NOW(), false) ON CONFLICT (id) DO NOTHING;
INSERT INTO public.lienzo (id, bytes, width, height, last_edited, is_image) VALUES (5, decode(repeat('00', 500000), 'hex'), 1000, 1000, NOW(), false) ON CONFLICT (id) DO NOTHING;
INSERT INTO public.lienzo (id, bytes, width, height, last_edited, is_image) VALUES (6, decode(repeat('00', 500000), 'hex'), 1000, 1000, NOW(), false) ON CONFLICT (id) DO NOTHING;

-- =================================================================================================
-- 3. CASAS
-- =================================================================================================
ALTER SEQUENCE IF EXISTS casa_id_seq RESTART WITH 10;
INSERT INTO public.casa (id, descripcion, fecha_creacion, nombre, ruta_imagen) VALUES (1, 'Dani me debes 10€', now(), 'Escultor José Capuz 29', 'ruta1.jpg') ON CONFLICT (id) DO NOTHING;
INSERT INTO public.casa (id, descripcion, fecha_creacion, nombre, ruta_imagen) VALUES (2, 'Prohibida la entrada a pelirrojos', now(), 'Matías Perelló 12', 'ruta2.jpg') ON CONFLICT (id) DO NOTHING;
INSERT INTO public.casa (id, descripcion, fecha_creacion, nombre, ruta_imagen) VALUES (3, 'La casa del terror', now(), 'Av. Dr. Waksman 33', 'ruta3.jpg') ON CONFLICT (id) DO NOTHING;

-- Relaciones Casa-Usuario
INSERT INTO public.casa_usuarios (casa_id, usuarios_id) VALUES (1, 1) ON CONFLICT DO NOTHING;
INSERT INTO public.casa_usuarios (casa_id, usuarios_id) VALUES (1, 2) ON CONFLICT DO NOTHING;
INSERT INTO public.casa_usuarios (casa_id, usuarios_id) VALUES (1, 3) ON CONFLICT DO NOTHING;
INSERT INTO public.casa_usuarios (casa_id, usuarios_id) VALUES (2, 4) ON CONFLICT DO NOTHING;
INSERT INTO public.casa_administradores (casa_id, admin_id) VALUES (1, 1) ON CONFLICT DO NOTHING;



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
INSERT INTO public.lista (id, descripcion, nombre, fecha_creacion, fecha_edicion, propietario_id, casa_id) VALUES (1, 'Lista 1', 'Lista Natalia', '2025-10-11 15:00:00', NULL, 1, 1) ON CONFLICT (id) DO NOTHING;
INSERT INTO public.lista (id, descripcion, nombre, fecha_creacion, fecha_edicion, propietario_id, casa_id) VALUES (2, 'Lista 2', 'Tareas x hacer', '2025-05-11 19:00:00', NULL, 2, 1) ON CONFLICT (id) DO NOTHING;
INSERT INTO public.lista (id, descripcion, nombre, fecha_creacion, fecha_edicion, propietario_id, casa_id) VALUES (3, 'Lista 3', 'Lista David', '2025-12-05 21:00:00', NULL, 3, 1) ON CONFLICT (id) DO NOTHING;
INSERT INTO public.lista (id, nombre, descripcion, fecha_creacion, fecha_edicion, propietario_id, casa_id) VALUES (4, 'Lista de la compra', 'Compra semanal', '2025-10-11 15:00:00', NULL, 1, 1);
INSERT INTO public.lista (id, nombre, descripcion, fecha_creacion, fecha_edicion, propietario_id, casa_id) VALUES (5, 'Lista de Navidad', 'Cosas para Navidad', '2025-11-13 10:00:00', NULL, 2, 1);

INSERT INTO public.lista_participantes (lista_id, usuario_id) VALUES (4, 1);
INSERT INTO public.lista_participantes (lista_id, usuario_id) VALUES (4, 2);
INSERT INTO public.lista_participantes (lista_id, usuario_id) VALUES (5, 2);
INSERT INTO public.lista_participantes (lista_id, usuario_id) VALUES (5, 1);

INSERT INTO public.casa_listas (casa_id, listas_id) VALUES (1, 1) ON CONFLICT DO NOTHING;
INSERT INTO public.casa_listas (casa_id, listas_id) VALUES (1, 2) ON CONFLICT DO NOTHING;
INSERT INTO public.casa_listas (casa_id, listas_id) VALUES (1, 3) ON CONFLICT DO NOTHING;

-- =================================================================================================
-- 8. CATÁLOGO DE LOGROS (MEDALLAS)
-- =================================================================================================
ALTER SEQUENCE IF EXISTS logro_id_seq RESTART WITH 100;

-- TAREAS: Míster Proper
INSERT INTO public.logro (id, codigo, nombre, descripcion, categoria, nivel, meta) VALUES (1, 'TAREAS_MISTER_PROPER_BRONCE', 'Míster Proper (Bronce)', 'Completa 10 tareas', 'TAREAS', 'BRONCE', 10) ON CONFLICT DO NOTHING;
INSERT INTO public.logro (id, codigo, nombre, descripcion, categoria, nivel, meta) VALUES (2, 'TAREAS_MISTER_PROPER_PLATA', 'Míster Proper (Plata)', 'Completa 50 tareas', 'TAREAS', 'PLATA', 50) ON CONFLICT DO NOTHING;
INSERT INTO public.logro (id, codigo, nombre, descripcion, categoria, nivel, meta) VALUES (3, 'TAREAS_MISTER_PROPER_ORO', 'Míster Proper (Oro)', 'Completa 100 tareas', 'TAREAS', 'ORO', 100) ON CONFLICT DO NOTHING;

-- TAREAS: Reloj Suizo
INSERT INTO public.logro (id, codigo, nombre, descripcion, categoria, nivel, meta) VALUES (4, 'TAREAS_RELOJ_SUIZO_BRONCE', 'Reloj Suizo (Bronce)', 'Completa 5 tareas a tiempo', 'TAREAS', 'BRONCE', 5) ON CONFLICT DO NOTHING;
INSERT INTO public.logro (id, codigo, nombre, descripcion, categoria, nivel, meta) VALUES (5, 'TAREAS_RELOJ_SUIZO_PLATA', 'Reloj Suizo (Plata)', 'Completa 15 tareas a tiempo', 'TAREAS', 'PLATA', 15) ON CONFLICT DO NOTHING;
INSERT INTO public.logro (id, codigo, nombre, descripcion, categoria, nivel, meta) VALUES (6, 'TAREAS_RELOJ_SUIZO_ORO', 'Reloj Suizo (Oro)', 'Completa 30 tareas a tiempo', 'TAREAS', 'ORO', 30) ON CONFLICT DO NOTHING;

-- ECONOMÍA: El Contable
INSERT INTO public.logro (id, codigo, nombre, descripcion, categoria, nivel, meta) VALUES (7, 'ECONOMIA_CONTABLE_BRONCE', 'El Contable (Bronce)', 'Sube 5 gastos', 'ECONOMIA', 'BRONCE', 5) ON CONFLICT DO NOTHING;
INSERT INTO public.logro (id, codigo, nombre, descripcion, categoria, nivel, meta) VALUES (8, 'ECONOMIA_CONTABLE_PLATA', 'El Contable (Plata)', 'Sube 20 gastos', 'ECONOMIA', 'PLATA', 20) ON CONFLICT DO NOTHING;
INSERT INTO public.logro (id, codigo, nombre, descripcion, categoria, nivel, meta) VALUES (9, 'ECONOMIA_CONTABLE_ORO', 'El Contable (Oro)', 'Sube 50 gastos', 'ECONOMIA', 'ORO', 50) ON CONFLICT DO NOTHING;

-- ECONOMÍA: Moroso Cero
INSERT INTO public.logro (id, codigo, nombre, descripcion, categoria, nivel, meta) VALUES (10, 'ECONOMIA_MOROSO_CERO_BRONCE', 'Moroso Cero (Bronce)', 'Paga 5 deudas en <24h', 'ECONOMIA', 'BRONCE', 5) ON CONFLICT DO NOTHING;
INSERT INTO public.logro (id, codigo, nombre, descripcion, categoria, nivel, meta) VALUES (11, 'ECONOMIA_MOROSO_CERO_PLATA', 'Moroso Cero (Plata)', 'Paga 15 deudas en <24h', 'ECONOMIA', 'PLATA', 15) ON CONFLICT DO NOTHING;
INSERT INTO public.logro (id, codigo, nombre, descripcion, categoria, nivel, meta) VALUES (12, 'ECONOMIA_MOROSO_CERO_ORO', 'Moroso Cero (Oro)', 'Paga 30 deudas en <24h', 'ECONOMIA', 'ORO', 30) ON CONFLICT DO NOTHING;

-- SOCIAL: Comunicador
INSERT INTO public.logro (id, codigo, nombre, descripcion, categoria, nivel, meta) VALUES (13, 'SOCIAL_COMUNICADOR_BRONCE', 'El Comunicador (Bronce)', 'Escribe 5 post-its', 'SOCIAL', 'BRONCE', 5) ON CONFLICT DO NOTHING;
INSERT INTO public.logro (id, codigo, nombre, descripcion, categoria, nivel, meta) VALUES (14, 'SOCIAL_COMUNICADOR_PLATA', 'El Comunicador (Plata)', 'Escribe 20 post-its', 'SOCIAL', 'PLATA', 20) ON CONFLICT DO NOTHING;
INSERT INTO public.logro (id, codigo, nombre, descripcion, categoria, nivel, meta) VALUES (15, 'SOCIAL_COMUNICADOR_ORO', 'El Comunicador (Oro)', 'Escribe 50 post-its', 'SOCIAL', 'ORO', 50) ON CONFLICT DO NOTHING;

-- =================================================================================================
-- 4. ELEMENTOS
-- =================================================================================================
ALTER SEQUENCE IF EXISTS elemento_id_seq RESTART WITH 20;
INSERT INTO public.elemento (id, completado, descripcion, nombre, cantidad, lista_id) VALUES (1, TRUE, '2 barras', 'Pan', 4, 1) ON CONFLICT (id) DO NOTHING;
INSERT INTO public.elemento (id, completado, descripcion, nombre, cantidad, lista_id) VALUES (2, FALSE, 'Para limpiar el baño', 'Lejía', 2, 1) ON CONFLICT (id) DO NOTHING;
INSERT INTO public.elemento (id, completado, descripcion, nombre, cantidad, lista_id) VALUES (3, TRUE, 'Está caro', 'Pollo', 3, 2) ON CONFLICT (id) DO NOTHING;
INSERT INTO public.elemento (id, completado, descripcion, nombre, cantidad, lista_id) VALUES (10, FALSE, 'Bajar al contenedor azul', 'Sacar basura (Mañana)',1, 3) ON CONFLICT (id) DO NOTHING;
INSERT INTO public.elemento (id, completado, descripcion, nombre, cantidad, lista_id) VALUES (11, FALSE, 'Fregar azulejos', 'Limpiar Baño',1, 4) ON CONFLICT (id) DO NOTHING;
INSERT INTO public.elemento (id, completado, descripcion, nombre, cantidad, lista_id) VALUES (12, FALSE, 'Hablar de gastos', 'Reunión de Piso',1, 5) ON CONFLICT (id) DO NOTHING;


INSERT INTO public.opcion (id, nombre) VALUES (1, 'Opcion1') ON CONFLICT (id) DO NOTHING;
INSERT INTO public.opcion (id, nombre) VALUES (2, 'Opcion2') ON CONFLICT (id) DO NOTHING;
INSERT INTO public.opcion (id, nombre) VALUES (3, 'Opcion3') ON CONFLICT (id) DO NOTHING;

INSERT INTO public.voto (id, votante_id) VALUES (1, 1) ON CONFLICT (id) DO NOTHING;
INSERT INTO public.voto (id, votante_id) VALUES (2, 2) ON CONFLICT (id) DO NOTHING;
INSERT INTO public.voto (id, votante_id) VALUES (3, 3) ON CONFLICT (id) DO NOTHING;

INSERT INTO public.resumen (id) VALUES (1) ON CONFLICT (id) DO NOTHING;
INSERT INTO public.resumen (id) VALUES (2) ON CONFLICT (id) DO NOTHING;
INSERT INTO public.resumen (id) VALUES (3) ON CONFLICT (id) DO NOTHING;

INSERT INTO public.multimedia (id, posicionx, posiciony, width, height, ruta, usuario_id, casa_id, localizacion) VALUES (1, 200, 200, 450, 400, 'rutaA', 1, 1,'Home') ON CONFLICT (id) DO NOTHING;
INSERT INTO public.multimedia (id, posicionx, posiciony, width, height, ruta, usuario_id, casa_id, localizacion) VALUES (2, 300, 490, 450, 400, 'rutaB', 2, 2,'Home') ON CONFLICT (id) DO NOTHING;
INSERT INTO public.multimedia (id, posicionx, posiciony, width, height, ruta, usuario_id, casa_id, localizacion) VALUES (3, 300, 500,450, 400, 'rutaC', 3, 3,'Home') ON CONFLICT (id) DO NOTHING;

ALTER SEQUENCE IF EXISTS tarea_id_seq RESTART WITH 20;
INSERT INTO public.tarea (id, fecha_fin, frecuencia, periodica, casa_id, asignadoa_id, completado, nombre, prioridad) VALUES (1, now(), 'Semanal', TRUE, 1, 1, false, 'Sacar basura (Mañana)', 'Alta') ON CONFLICT (id) DO NOTHING;
INSERT INTO public.tarea (id, fecha_fin, frecuencia, periodica, casa_id, asignadoa_id, completado, nombre, prioridad) VALUES (2, now(), 'Mensual', FALSE, 1, 2, false, 'Limpiar Baño', 'Alta') ON CONFLICT (id) DO NOTHING;
INSERT INTO public.tarea (id, fecha_fin, frecuencia, periodica, casa_id, asignadoa_id, completado, nombre, prioridad) VALUES (3, now(), 'Diaria', TRUE, 1, 3, false, 'Reunion piso', 'Media') ON CONFLICT (id) DO NOTHING;
INSERT INTO public.tarea (id, fecha_fin, frecuencia, periodica, casa_id, asignadoa_id, completado, nombre, prioridad) VALUES (10, NOW() + INTERVAL '1 day', 'Diaria', TRUE, 1, 1, false, 'Cargar el lavaplatos', 'Media') ON CONFLICT (id) DO NOTHING;
INSERT INTO public.tarea (id, fecha_fin, frecuencia, periodica, casa_id, asignadoa_id, completado, nombre, prioridad) VALUES (11, NOW() + INTERVAL '3 days', 'Semanal', TRUE, 1, 2, false, 'Ir a la lavandería', 'Baja') ON CONFLICT (id) DO NOTHING;
INSERT INTO public.tarea (id, fecha_fin, frecuencia, periodica, casa_id, asignadoa_id, completado, nombre, prioridad) VALUES (12, NOW() + INTERVAL '7 days', 'Mensual', FALSE, 1, 3, false,'Pasar la aspiradora', 'Baja') ON CONFLICT (id) DO NOTHING;
INSERT INTO public.tarea (id, fecha_fin, frecuencia, periodica, casa_id, asignadoa_id, completado, nombre, prioridad) VALUES (13, now() - INTERVAL '4 days', 'Semanal', TRUE, 1, 1, true, 'Sacar al perro', 'Baja') ON CONFLICT (id) DO NOTHING;
INSERT INTO public.tarea (id, fecha_fin, frecuencia, periodica, casa_id, asignadoa_id, completado, nombre, prioridad) VALUES (14, now() - INTERVAL '7 days', 'Mensual', FALSE, 1, 2, true, 'Limpiar Cocina', 'Alta') ON CONFLICT (id) DO NOTHING;
INSERT INTO public.tarea (id, fecha_fin, frecuencia, periodica, casa_id, asignadoa_id, completado, nombre, prioridad) VALUES (15, now() - INTERVAL '15 days', 'Diaria', TRUE, 1, 3, true, 'Reunion propietaria', 'Media') ON CONFLICT (id) DO NOTHING;

INSERT INTO public.post_it (id, lienzo_id) VALUES (1, 4) ON CONFLICT (id) DO NOTHING;
INSERT INTO public.post_it (id, lienzo_id) VALUES (2, 5) ON CONFLICT (id) DO NOTHING;
INSERT INTO public.post_it (id, lienzo_id) VALUES (3, 6) ON CONFLICT (id) DO NOTHING;

ALTER SEQUENCE IF EXISTS invitacion_id_seq RESTART WITH 10;
INSERT INTO public.invitacion (id, remitente_id, destinatario_id, casa_id, fecha_creacion, estado) VALUES (1, 1, 4, 1, NOW(), 'PENDIENTE') ON CONFLICT (id) DO NOTHING;

-- =================================================================================================
-- 9. ENCUESTAS Y VOTOS (Heredan de Multimedia)
-- =================================================================================================

-- ---------------------------------------------------------
-- ENCUESTA 1: Sin votos
-- ---------------------------------------------------------
INSERT INTO public.multimedia (id, posicionx, posiciony, width, height, ruta, usuario_id, casa_id, localizacion) VALUES (10, 0, 0, 0, 0, '', 1, 1, 'Encuestas') ON CONFLICT (id) DO NOTHING;
INSERT INTO public.encuestas (id, titulo, creador_id, estado, fecha_creacion, color_hex) VALUES (10, '¿Qué cenamos hoy?', 1, 'ABIERTA', NOW(), '#FF9800') ON CONFLICT (id) DO NOTHING;
INSERT INTO public.encuesta_opciones (id, texto, encuesta_id) VALUES (101, 'Pizza', 10) ON CONFLICT (id) DO NOTHING;
INSERT INTO public.encuesta_opciones (id, texto, encuesta_id) VALUES (102, 'Sushi', 10) ON CONFLICT (id) DO NOTHING;
INSERT INTO public.encuesta_opciones (id, texto, encuesta_id) VALUES (103, 'Ensalada', 10) ON CONFLICT (id) DO NOTHING;

-- ---------------------------------------------------------
-- ENCUESTA 2: Con votos y cerrada
-- ---------------------------------------------------------
INSERT INTO public.multimedia (id, posicionx, posiciony, width, height, ruta, usuario_id, casa_id, localizacion) VALUES (11, 0, 0, 0, 0, '', 2, 1, 'Encuestas') ON CONFLICT (id) DO NOTHING;
INSERT INTO public.encuestas (id, titulo, creador_id, estado, fecha_creacion, color_hex) VALUES (11, '¿Cuándo hacemos limpieza general?', 2, 'CERRADA', NOW(), '#4CAF50') ON CONFLICT (id) DO NOTHING;
INSERT INTO public.encuesta_opciones (id, texto, encuesta_id) VALUES (104, 'Sábado por la mañana', 11) ON CONFLICT (id) DO NOTHING;
INSERT INTO public.encuesta_opciones (id, texto, encuesta_id) VALUES (105, 'Domingo por la tarde', 11) ON CONFLICT (id) DO NOTHING;
INSERT INTO public.encuesta_votos (id, votante_id, opcion_id) VALUES (101, 1, 104) ON CONFLICT (id) DO NOTHING;
INSERT INTO public.encuesta_votos (id, votante_id, opcion_id) VALUES (102, 3, 104) ON CONFLICT (id) DO NOTHING;

-- Actualizamos secuencias
ALTER SEQUENCE IF EXISTS encuestas_id_seq RESTART WITH 100;
ALTER SEQUENCE IF EXISTS encuesta_opciones_id_seq RESTART WITH 100;
ALTER SEQUENCE IF EXISTS encuesta_votos_id_seq RESTART WITH 100;
