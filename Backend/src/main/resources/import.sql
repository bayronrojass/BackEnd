-- ========================
-- 1️⃣ USUARIOS
-- ========================
INSERT INTO public.usuario (id, correo, nombre, contrasena) VALUES (1,'u1@mail.com', 'Usuario1', '1'),(2,'u2@mail.com', 'Usuario2', '2'),(3,'u3@mail.com', 'Usuario3', '3') ON CONFLICT (id) DO NOTHING;
ALTER SEQUENCE IF EXISTS usuario_id_seq RESTART WITH 10;

-- ========================
-- 2️⃣ LIENZOS
-- ========================
INSERT INTO public.lienzo (id, bytes, width, height, is_image, last_edited) VALUES (1,decode(repeat('88', 1875000), 'hex'), 1500, 2500, false,NOW()),(2,decode(repeat('88', 1875000), 'hex'), 1500, 2500,false, NOW()),(3,decode(repeat('88', 1875000), 'hex'), 1500, 2500,false, NOW()) ON CONFLICT (id) DO NOTHING;
INSERT INTO public.lienzo (id, bytes, width, height, is_image, last_edited) VALUES (4,decode(repeat('22', 1875000), 'hex'), 1500, 2500,false, NOW()),(5,decode(repeat('33', 1875000), 'hex'), 1500, 2500,false, NOW()),(6,decode(repeat('55', 1875000), 'hex'), 1500, 2500,false, NOW()) ON CONFLICT (id) DO NOTHING;
ALTER SEQUENCE IF EXISTS lienzo_id_seq RESTART WITH 10;

-- ========================
-- 3️⃣ CASAS
-- ========================
INSERT INTO public.casa (id, descripcion, fecha_creacion, lienzo_id, nombre, ruta_imagen) VALUES (1, 'Casa 1', now(), 1, 'Casa1', 'ruta1.jpg'),(2, 'Casa 2', now(), 2, 'Casa2', 'ruta2.jpg'),(3, 'Casa 3', now(), 3, 'Casa3', 'ruta3.jpg') ON CONFLICT (id) DO NOTHING;
ALTER SEQUENCE IF EXISTS casa_id_seq RESTART WITH 10;

-- ========================
-- 4️⃣ ELEMENTOS
-- ========================
INSERT INTO public.elemento (id, completado, descripcion, nombre) VALUES (1, TRUE, 'Elemento 1', 'Elem1'),(2, FALSE, 'Elemento 2', 'Elem2'),(3, TRUE, 'Elemento 3', 'Elem3') ON CONFLICT (id) DO NOTHING;
-- Elementos adicionales para tareas nuevas
INSERT INTO public.elemento (id, completado, descripcion, nombre) VALUES (10, FALSE, 'Bajar al contenedor azul', 'Sacar basura (Mañana)'),(11, FALSE, 'Fregar azulejos', 'Limpiar Baño'),(12, FALSE, 'Hablar de gastos', 'Reunión de Piso') ON CONFLICT (id) DO NOTHING;
ALTER SEQUENCE IF EXISTS elemento_id_seq RESTART WITH 20; -- Asumiendo que existe secuencia para elemento padre

-- ========================
-- 5️⃣ GASTOS (Fusionado y Enriquecido)
-- ========================
-- Se añaden los campos obligatorios: importe, categoria, pagado_por_id
INSERT INTO public.gasto (id, nombre, descripcion, fecha_inicio, importe, categoria, pagado_por_id) VALUES
                                                                                                        (1, 'Alquiler Noviembre', 'Pago mensual', NOW(), 900.00, 'ALQUILER', 1),
                                                                                                        (2, 'Compra Mercadona', 'Comida semanal', NOW(), 85.50, 'COMIDA', 2),
                                                                                                        (3, 'Factura Luz', 'Octubre', NOW(), 45.20, 'SUMINISTROS', 3),
                                                                                                        (4, 'Cena Viernes', 'Pizzas', NOW(), 32.00, 'OCIO', 1),
                                                                                                        (5, 'Limpieza', 'Lejía', NOW(), 12.90, 'OTROS', 2)
    ON CONFLICT (id) DO NOTHING;
ALTER SEQUENCE IF EXISTS gasto_id_seq RESTART WITH 20;

-- ========================
-- 6️⃣ LISTAS
-- ========================
INSERT INTO public.lista (id, descripcion, nombre) VALUES (1, 'Lista 1', 'Lista1'),(2, 'Lista 2', 'Lista2'),(3, 'Lista 3', 'Lista3') ON CONFLICT (id) DO NOTHING;

-- ========================
-- 7️⃣ NOTIFICACIONES
-- ========================
INSERT INTO public.notificacion (id, dtype, cuerpo, titulo) VALUES (1, 'Push', 'Cuerpo 1', 'Titulo1'),(2, 'Push', 'Cuerpo 2', 'Titulo2'),(3, 'PopUp', 'Cuerpo 3', 'Titulo3') ON CONFLICT (id) DO NOTHING;
ALTER SEQUENCE IF EXISTS notificacion_id_seq RESTART WITH 10;

-- ========================
-- 8️⃣ OPCIONES Y RESUMENES
-- ========================
INSERT INTO public.opcion (id, nombre) VALUES (1, 'Opcion1'),(2, 'Opcion2'),(3, 'Opcion3') ON CONFLICT (id) DO NOTHING;
INSERT INTO public.resumen (id) VALUES (1),(2),(3) ON CONFLICT (id) DO NOTHING;

-- ========================
-- 9️⃣ MULTIMEDIA
-- ========================
INSERT INTO public.multimedia (id, posicionx, posiciony, width, height, ruta, usuario_id, casa_id) VALUES (1, 200, 200, 450, 400, 'rutaA', 1, 1),(2, 300, 490, 450, 400, 'rutaB', 2, 2),(3, 300, 500,450, 400, 'rutaC', 3, 3) ON CONFLICT (id) DO NOTHING;

-- ========================
-- 🔟 EVENTOS (Enriquecido con fechas dinámicas)
-- ========================
-- Se añaden fechas dinámicas para que salgan en el calendario (Hoy, Mañana, etc.)
INSERT INTO public.evento (id, nombre, descripcion, fecha_inicio, creado_por_id) VALUES
                                                                                     (1, 'Cena de Piso', 'Pizza y juegos', CURRENT_TIMESTAMP, 1),
                                                                                     (2, 'Visita Casero', 'Revisión', CURRENT_DATE + INTERVAL '1 day' + TIME '10:00:00', 1),
                                                                                     (3, 'Limpieza General', 'Toca baño', CURRENT_DATE + INTERVAL '3 day' + TIME '16:00:00', 2),
                                                                                     (4, 'Cumpleaños', 'Regalo', CURRENT_DATE + INTERVAL '7 day' + TIME '21:00:00', 3),
                                                                                     (5, 'Pagar Internet', 'Factura', CURRENT_DATE + INTERVAL '20 day' + TIME '09:00:00', 1)
    ON CONFLICT (id) DO NOTHING;
ALTER SEQUENCE IF EXISTS evento_id_seq RESTART WITH 20;

-- ========================
-- 1️⃣1️⃣ PAGOS Y VOTOS
-- ========================
INSERT INTO public.pago (id, cantidad, fecha, pagado_por_id) VALUES (1, 10.50, now(), 1),(2, 25.75, now(), 2),(3, 100.00, now(), 3) ON CONFLICT (id) DO NOTHING;
INSERT INTO public.voto (id, votante_id) VALUES (1, 1),(2, 2),(3, 3) ON CONFLICT (id) DO NOTHING;

-- ========================
-- 1️⃣2️⃣ RELACIONES (TABLAS INTERMEDIAS)
-- ========================
INSERT INTO public.casa_gastos (casa_id, gastos_id) VALUES (1, 1),(1, 2),(1, 3),(1, 4),(1, 5) ON CONFLICT DO NOTHING; -- Todos los gastos a la Casa 1 para verlos
INSERT INTO public.casa_listas (casa_id, listas_id) VALUES (1, 1),(2, 2),(3, 3) ON CONFLICT DO NOTHING;
INSERT INTO public.lista_elementos (lista_id, elementos_id) VALUES (1, 1),(2, 2),(3, 3) ON CONFLICT DO NOTHING;
INSERT INTO public.casa_notifaciones (casa_id, notifaciones_id) VALUES (1, 1),(2, 2),(3, 3) ON CONFLICT DO NOTHING;
INSERT INTO public.casa_usuarios (casa_id, usuarios_id) VALUES (1, 1),(1, 2),(1, 3) ON CONFLICT DO NOTHING; -- Todos los usuarios en Casa 1
INSERT INTO public.casa_administradores (casa_id, admin_id) VALUES (1, 1),(2, 2), (3, 3) ON CONFLICT DO NOTHING;

-- Asociamos los eventos enriquecidos a la Casa 1
INSERT INTO public.casa_eventos (casa_id, eventos_id) VALUES (1, 1),(1, 2),(1, 3),(1, 4),(1, 5) ON CONFLICT DO NOTHING;

INSERT INTO public.evento_asistentes (evento_id, asistentes_id) VALUES (1, 2),(2, 3),(3, 1) ON CONFLICT DO NOTHING;
INSERT INTO public.gasto_pagos (gasto_id, pagos_id) VALUES (1, 1),(2, 2),(3, 3) ON CONFLICT DO NOTHING;

-- ========================
-- 1️⃣3️⃣ RESTO DE TABLAS
-- ========================
INSERT INTO public.item (id) VALUES (1),(2),(3) ON CONFLICT (id) DO NOTHING;

-- Tareas originales + las nuevas enriquecidas
INSERT INTO public.tarea (id, fecha_fin, frecuencia, periodica, asignadoa_id, casa_id) VALUES
                                                                                           (1, now(), 'Semanal', TRUE, 1, 1),
                                                                                           (2, now(), 'Diaria', FALSE, 2, 1),
                                                                                           (3, now(), 'Mensual', TRUE, 3, 1),
                                                                                           (10, NOW() + INTERVAL '1 day', 'Diaria', TRUE, 1, 1),
                                                                                           (11, NOW() + INTERVAL '3 days', 'Semanal', TRUE, 2, 1),
                                                                                           (12, NOW() + INTERVAL '7 days', NULL, FALSE, 3, 1)
    ON CONFLICT (id) DO NOTHING;
ALTER SEQUENCE IF EXISTS tarea_id_seq RESTART WITH 20;

INSERT INTO public.post_it (id, lienzo_id, plegado) VALUES (1, 4, false),(2, 5, false),(3, 6, false) ON CONFLICT (id) DO NOTHING;
INSERT INTO public.invitacion (id, remitente_id, destinatario_id, casa_id, fecha_creacion, estado) VALUES (1, 1, 2, 1, NOW(), 'PENDIENTE') ON CONFLICT (id) DO NOTHING;
ALTER SEQUENCE IF EXISTS invitacion_id_seq RESTART WITH 10;

INSERT INTO public.notificacion_receptor (notificacion_id, receptor_id) VALUES (1, 1), (1, 2), (3, 3) ON CONFLICT DO NOTHING;