CREATE TABLE tb_peliculas (
	id_pel INTEGER PRIMARY KEY AUTOINCREMENT,
	titulo_pel TEXT		NOT NULL,
	año_pel INTEGER,
	critica_pel NUMERIC,
	caratula_pel TEXT 		--descripcion
);

CREATE TABLE tb_copias (
	n_cop INTEGER PRIMARY KEY AUTOINCREMENT,
	deteriorada_cop INTEGER,  -- 0 == false, 1 == true
	formato_cop TEXT,
	id_pel REFERENCES tb_peliculas(id_pel),
	precio_alquiler_cop NUMERIC
);

CREATE TABLE tb_clientes (
	cod_cli INTEGER PRIMARY KEY AUTOINCREMENT,
	dni_cli INTEGER,
	nombre_cli TEXT,
	apellido1_cli TEXT,
	apellido2_cli TEXT,
	direccion_cli TEXT,
	email_cli TEXT
);

CREATE TABLE tb_prestamos (
	id_pre INTEGER PRIMARY KEY AUTOINCREMENT,
	fecha_prestamo_pre TEXT,
	fecha_entrega_pre TEXT,
	fecha_tope_pre TEXT,
	cod_cli REFERENCES tb_clientes(cod_cli),
	n_cop REFERENCES tb_copias(n_cop)
);


INSERT INTO tb_peliculas (titulo_pel, año_pel, critica_pel, caratula_pel) VALUES
	('Ironman', 2008, 7.9,'Pelicula de superheroes, accion y ciencia ficcion'),
	('Como entrenar a tu dragon', 2010, 8.6, 'Pelicula de vikingos y dragones'),
	('Dr.Stone: Ryusui', 2022, 8.5, 'Pelicula cientifica y accion');

INSERT INTO tb_copias (deteriorada_cop, formato_cop, id_pel, precio_alquiler_cop) VALUES
	(1, 'DVD', 1, 10000),
	(0, 'BlueRay', 2, 20000),
	(0, 'BlueRay', 3, 15000);

INSERT INTO tb_clientes (dni_cli, nombre_cli, apellido1_cli, apellido2_cli, direccion_cli, email_cli) VALUES
	('1036259057', 'Juan Esteban', 'Ciro', 'Gallego', 'Calle 2C #23-09', 'ciro23@gmail.com'),
	('1043309335', 'Sebastian', 'Hernandez', 'Muñoz', 'Calle 5M #09-01', 'costeñoburrita@gmail.com'),
	('1027570152', 'Simon', 'Camilo', 'Duque', 'Calle 3V #02-27', 'camilotralala@gmail.com');

INSERT INTO tb_prestamos (fecha_prestamo_pre, fecha_entrega_pre, fecha_tope_pre, cod_cli, n_cop) VALUES
	('12/03/2024','4/06/2024','12/06/2024',1,3),
	('27/02/2023','3/04/2023','27/04/2023',1,2),
	('30/05/2021','15/08/2024','30/08/2021',2,1);


SELECT
    p.fecha_prestamo_pre AS FECHA_PRESTAMO,
    p.fecha_entrega_pre AS FECHA_ENTREGA,
    p.fecha_tope_pre AS FECHA_MAXIMA,

    c.nombre_cli AS NOMBRE_CLIENTE,
    c.apellido1_cli AS PRIMER_APELLIDO,

    pe.titulo_pel AS TITULO_PELICULA

FROM tb_prestamos p

JOIN tb_clientes c
    ON p.cod_cli = c.cod_cli

JOIN tb_copias cop
    ON p.n_cop = cop.n_cop

JOIN tb_peliculas pe
    ON cop.id_pel = pe.id_pel;


UPDATE copias
SET deteriorada = deteriorada || ' *'		-- "Se esta poniendo vieja"
WHERE deteriorada == 0;

DELETE FROM copias 
WHERE formato = 'DVD';


