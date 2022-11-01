/* Populate tabla clientes */

INSERT INTO regiones (id, nombre) VALUES (1, 'Norteamérica');
INSERT INTO regiones (id, nombre) VALUES (2, 'Centroamérica');
INSERT INTO regiones (id, nombre) VALUES (3, 'Sudamérica');
INSERT INTO regiones (id, nombre) VALUES (4, 'Europa');
INSERT INTO regiones (id, nombre) VALUES (5, 'Asia');
INSERT INTO regiones (id, nombre) VALUES (6, 'Africa');
INSERT INTO regiones (id, nombre) VALUES (7, 'Oceanía');
INSERT INTO regiones (id, nombre) VALUES (8, 'Antártida');

INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES(1, 'José', 'Pérez', 'Jperez@gmail.com', NOW());
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES(2, 'Luis', 'Molina', 'Lmolina@gmail.com', NOW());
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES(3, 'Humberto', 'Ruiz', 'Hruiz@gmail.com', NOW());
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES(4, 'Jorge', 'Matias', 'Jmatias@gmail.com', NOW());
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES(5, 'Angel', 'Hernandez', 'Ahernandez@gmail.com', NOW());
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES(6, 'José', 'Villatoro', 'Jvillatoro@gmail.com', NOW());
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES(7, 'Angel', 'Molina', 'Amolina@gmail.com', NOW());
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES(8, 'Abner', 'Obed', 'Aobed@gmail.com', NOW());
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES(1, 'Carlos', 'Alonzo', 'Alonzo@gmail.com', NOW());
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES(2, 'Gustavo', 'Jimenez', 'Gjimenez@gmail.com', NOW());
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES(3, 'Gustavo', 'Hernandez', 'Ghernandez@gmail.com', NOW());
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES(4, 'Yoisy', 'Herrera', 'Yherrera@gmail.com', NOW());
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES(5, 'Ludwing', 'Chavarria', 'Lchavarria@gmail.com', NOW());
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES(6, 'Julio', 'Cesar', 'Jcesar@gmail.com', NOW());
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES(7, 'Yefri', 'Andre', 'Yandre@gmail.com', NOW());

INSERT INTO `usuarios` (username, password, enabled, nombre, apellido, email) VALUES ('usuario','$2a$10$C3Uln5uqnzx/GswADURJGOIdBqYrly9731fnwKDaUdBkt/M3qvtLq',1, 'Luis', 'Ruiz','Lruiz@gmail.com');
INSERT INTO `usuarios` (username, password, enabled, nombre, apellido, email) VALUES ('admin','$2a$10$RmdEsvEfhI7Rcm9f/uZXPebZVCcPC7ZXZwV51efAvMAp1rIaRAfPK',1, 'José', 'Villatoro','Jvillatoro@gmail.com');

INSERT INTO `roles` (nombre) VALUES ('ROLE_USER');
INSERT INTO `roles` (nombre) VALUES ('ROLE_ADMIN');

INSERT INTO `usuarios_roles` (usuario_id, role_id) VALUES (1, 1);
INSERT INTO `usuarios_roles` (usuario_id, role_id) VALUES (2, 2);
INSERT INTO `usuarios_roles` (usuario_id, role_id) VALUES (2, 1);

INSERT INTO productos (nombre, precio, create_at) VALUES ('Impresora Canon G1110', 580, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES ('Impresora Epson L1110', 550, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES ('Computadora Asus X515EP', 8100, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES ('Celular Samsung Note 10s', 9500, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES ('Computadora Asus FA506ICB', 10100, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES ('Computadora Dell G15 5515', 13200, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES ('Computadora Asus FX516PM', 13650, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES ('Computadora HP VICTUS 16-D0503LA', 8160, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES ('Audifonos Sony WH-1000XM4', 2290, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES ('Audifonos AudioTechnica ATH-M50X', 1800, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES ('Computadora HP 22-DF0000LA', 5640, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES ('Computadora HP 24-DP0016LA', 5700, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES ('Computadora Dell Inspiron 5400', 9900, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES ('Iphone 13 Pro Max', 13000, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES ('Google Chromecast 3era generaci�n', 280, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES ('Amazon Fire tv stick lite', 310, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES ('Amazon Fire tv stick 4k', 410, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES ('Xiaomi Mi stick', 420, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES ('Roku streaming stick', 480, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES ('Xiaomi Mi box S', 570, NOW());

INSERT INTO facturas (descripcion, observacion, cliente_id, create_at) VALUES ('Factura de equipos de straming', null, 10, NOW());
INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES (2, 1, 20);
INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES (2, 1, 19);
INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES (1, 1, 16);

INSERT INTO facturas (descripcion, observacion, cliente_id, create_at) VALUES ('Factura de computadoras', null, 2, NOW());
INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES (1, 2, 3);
INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES (1, 2, 5);
INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES (1, 2, 7);

INSERT INTO facturas (descripcion, observacion, cliente_id, create_at) VALUES ('Factura de impresoras y audifonos', null, 1, NOW());
INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES (2, 3, 1);
INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES (1, 3, 2);
INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES (1, 3, 9);
INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES (2, 3, 10);
