-- ========================
-- 1️⃣ CREAR USUARIOS
-- ========================
ALTER SEQUENCE IF EXISTS usuario_id_seq RESTART WITH 10;
INSERT INTO public.usuario (id, correo, nombre, contrasena) VALUES
(1, 'u1@mail.com', 'Usuario 1 (Admin)', 'pass1'),
(2, 'u2@mail.com', 'Usuario 2 (Miembro)', 'pass2'),
(3, 'u3@mail.com', 'Usuario 3 (Miembro)', 'pass3'),
(4, 'i4@mail.com', 'Usuario Invitado', 'pass4')
ON CONFLICT (id) DO NOTHING;


-- ========================
-- 2️⃣ CREAR DEPENDENCIAS (LIENZO)
-- ========================
ALTER SEQUENCE IF EXISTS lienzo_id_seq RESTART WITH 10;
INSERT INTO public.lienzo (id, bytes, width, height, last_edited) VALUES
(1, decode(repeat('00', 100), 'hex'), 100, 100, NOW()), -- <-- ¡COMA AÑADIDA!
(2, decode(repeat('00', 100), 'hex'), 100, 100, NOW())
ON CONFLICT (id) DO NOTHING;


-- ========================
-- 3️⃣ CREAR EL PISO (CASA)
-- ========================
ALTER SEQUENCE IF EXISTS casa_id_seq RESTART WITH 10;
INSERT INTO public.casa (id, descripcion, fecha_creacion, lienzo_id, nombre, ruta_imagen) VALUES
(1, 'Piso de Prueba en Matías Perelló', now(), 1, 'Piso de Prueba', null), -- <-- ¡COMA AÑADIDA!
(2, 'Piso de Invitado', now(), 2, 'Piso de Invitado', null) -- <-- ¡ID CORREGIDO (era 1)!
ON CONFLICT (id) DO NOTHING;


-- ========================
-- 4️⃣ ASIGNAR MIEMBROS Y ADMINS
-- ========================

INSERT INTO public.casa_usuarios (casa_id, usuarios_id) VALUES
(1, 1), -- u1 en Casa 1
(1, 2), -- u2 en Casa 1
(1, 3), -- u3 en Casa 1 -- <-- ¡COMA AÑADIDA!
(2, 4)
ON CONFLICT DO NOTHING;

INSERT INTO public.casa_administradores (casa_id, admin_id) VALUES
(1, 1), -- <-- ¡COMA AÑADIDA!
(2, 4)
ON CONFLICT DO NOTHING;

-- ========================
-- 5. AÑADIR INVITACIONES DE EJEMPLO
-- ========================
ALTER SEQUENCE IF EXISTS invitacion_id_seq RESTART WITH 10;
INSERT INTO public.invitacion (id, remitente_id, destinatario_id, casa_id, fecha_creacion, estado) VALUES
(1, 1, 4, 1, NOW(), 'PENDIENTE')
ON CONFLICT (id) DO NOTHING;