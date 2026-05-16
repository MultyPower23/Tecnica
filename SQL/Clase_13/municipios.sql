-- CREATE TABLE departamentos (
-- 	id_departamento INTEGER PRIMARY KEY AUTOINCREMENT,
-- 	nombre_departamento TEXT
-- );
-- 
-- CREATE TABLE municipios (
-- 	codigo_postal INTEGER PRIMARY KEY AUTOINCREMENT,
-- 	nombre_municipio TEXT,
-- 	numero_casas INTEGER,
-- 	cantidad_habitantes INTEGER,
-- 	id_departamento INTEGER,
-- 	
-- 	FOREIGN KEY (id_departamento) REFERENCES departamentos(id_departamento)
-- );
-- 
-- INSERT INTO departamentos (nombre_departamento) VALUES
-- 	('Antioquia'),
-- 	('Cundinamarca'),
-- 	('Valle del Cauca'),
-- 	('Atlántico'),
-- 	('Santander'),
-- 	('Bolívar'),
-- 	('Boyacá'),
-- 	('Meta');
-- 
-- INSERT INTO municipios (nombre_municipio, numero_casas, cantidad_habitantes, id_departamento) VALUES
-- 	('Medellín',180000,2500000,1),
-- 	('El Peñol',4000,18000,1),
-- 	('Envigado',60000,240000,1),
-- 	('Bogotá',2500000,7800000,2),
-- 	('Soacha',150000,750000,2),
-- 	('Cali',550000,2200000,3),
-- 	('Barranquilla',300000,1200000,4),
-- 	('Bucaramanga',140000,580000,5),
-- 	('Cartagena',230000,1000000,6),
-- 	('Tunja',40000,170000,7),
-- 	('Villavicencio',110000,540000,8);

SELECT codigo_postal, nombre_municipio, numero_casas, cantidad_habitantes
FROM municipios;

SELECT 
	m.*,
	d.nombre_departamento AS departamento
FROM municipios AS m
INNER JOIN departamentos AS d
	ON d.id_departamento = m.id_departamento;