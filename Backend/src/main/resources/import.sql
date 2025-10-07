-- ========================
-- 1️⃣ Tablas base (sin dependencias)
-- ========================

INSERT INTO public.usuario (correo, nombre) VALUES ('u1@mail.com', 'Usuario1'),('u2@mail.com', 'Usuario2'),('u3@mail.com', 'Usuario3');
INSERT INTO public.casa (id, descripcion, fecha_creacion, nombre, ruta_imagen) VALUES (1, 'Casa 1', now(), 'Casa1', 'ruta1.jpg'),(2, 'Casa 2', now(), 'Casa2', 'ruta2.jpg'),(3, 'Casa 3', now(), 'Casa3', 'ruta3.jpg');
INSERT INTO public.elemento (completado, descripcion, nombre) VALUES (TRUE, 'Elemento 1', 'Elem1'),(FALSE, 'Elemento 2', 'Elem2'),(TRUE, 'Elemento 3', 'Elem3');
INSERT INTO public.gasto (descripcion, fecha_inicio, nombre) VALUES ('Gasto 1', now(), 'Gasto1'),('Gasto 2', now(), 'Gasto2'),('Gasto 3', now(), 'Gasto3');
INSERT INTO public.lienzo (id, bytes, pixelsx, pixelsy) VALUES (1,decode('6461746131', 'hex'), 100, 200),(2,decode('6461746132', 'hex'), 150, 250),(3,decode('6461746133', 'hex'), 200, 300);
INSERT INTO public.lista (descripcion, nombre) VALUES ('Lista 1', 'Lista1'),('Lista 2', 'Lista2'),('Lista 3', 'Lista3');
INSERT INTO public.notificacion (dtype, cuerpo, titulo) VALUES ('Push', 'Cuerpo 1', 'Titulo1'),('Push', 'Cuerpo 2', 'Titulo2'),('PopUp', 'Cuerpo 3', 'Titulo3');
INSERT INTO public.opcion (nombre) VALUES ('Opcion1'),('Opcion2'),('Opcion3');
INSERT INTO public.resumen DEFAULT VALUES;
INSERT INTO public.resumen DEFAULT VALUES;
INSERT INTO public.resumen DEFAULT VALUES;

-- ========================
-- 2️⃣ Tablas dependientes simples
-- ========================
INSERT INTO public.multimedia (posicionx, posiciony, ruta, usuario_id) VALUES (10, 20, 'rutaA', 1),(30, 40, 'rutaB', 2),(50, 60, 'rutaC', 3);
INSERT INTO public.evento (descripcion, fecha_inicio, nombre, creado_por_id) VALUES ('Evento 1', now(), 'Evento1', 1),('Evento 2', now(), 'Evento2', 2),('Evento 3', now(), 'Evento3', 3);
INSERT INTO public.pago (cantidad, fecha, pagado_por_id) VALUES (10.50, now(), 1),(25.75, now(), 2),(100.00, now(), 3);
INSERT INTO public.voto (votante_id) VALUES (1),(2),(3);

-- ========================
-- 3️⃣ Tablas intermedias y relaciones
-- ========================
INSERT INTO public.casa_gastos (casa_id, gastos_id) VALUES (1, 1),(2, 2),(3, 3);
INSERT INTO public.casa_lienzos (casa_id, lienzos_id) VALUES (1, 1),(2, 2),(3, 3);
INSERT INTO public.casa_listas (casa_id, listas_id) VALUES (1, 1),(2, 2),(3, 3);
INSERT INTO public.lista_elementos (lista_id, elementos_id) VALUES (1, 1),(2, 2),(3, 3);
INSERT INTO public.casa_notifaciones (casa_id, notifaciones_id) VALUES (1, 1),(2, 2),(3, 3);
INSERT INTO public.casa_administradores (casa_id, administradores_id) VALUES (1, 1),(2, 2),(3, 3);
INSERT INTO public.casa_usuarios (casa_id, usuarios_id) VALUES (1, 2),(2, 3),(3, 1);
INSERT INTO public.casa_eventos (casa_id, eventos_id) VALUES (1, 1),(2, 2),(3, 3);
INSERT INTO public.evento_asistentes (evento_id, asistentes_id) VALUES (1, 2),(2, 3),(3, 1);
INSERT INTO public.gasto_pagos (gasto_id, pagos_id) VALUES (1, 1),(2, 2),(3, 3);
INSERT INTO public.casa_multimedia (casa_id, multimedia_id) VALUES (1, 1),(2, 2),(3, 3);
INSERT INTO public.encuesta (titulo, id) VALUES ('Encuesta1', 1),('Encuesta2', 2),('Encuesta3', 3);
INSERT INTO public.encuesta_opciones (encuesta_id, opciones_id) VALUES (1, 1),(2, 2),(3, 3);
INSERT INTO public.opcion_votos (opcion_id, votos_id) VALUES (1, 1),(2, 2),(3, 3);
INSERT INTO public.item (id) VALUES (1),(2),(3);
INSERT INTO public.tarea (id, fecha_fin, frecuencia, periodica) VALUES (1, now(), now(), TRUE),(2, now(), now(), FALSE),(3, now(), now(), TRUE);
INSERT INTO public.post_it (id, lienzo_id) VALUES (1, 1),(2, 2),(3, 3);
INSERT INTO public.invitacion (anfitrion_id, miembro_id, casa_id) VALUES (1, 2, 1),(2, 3, 2),(3, 1, 3);
INSERT INTO public.audio (id) VALUES (1),(2),(3);
INSERT INTO public.imagen (id) VALUES (1),(2),(3);