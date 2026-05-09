--== CREACION DDE TABLAS ==--

/*
CREATE TABLE marca(

	id_marca INTEGER PRIMARY KEY AUTOINCREMENT,		--Mayusculas las palabras dedicadas y en minusculas las palabras propias
		--INTEGER = valor entero; PRIMARY KEY es la llave principal o la llave unica; AUTOINCREMENT es que se va autocompletar/autollenar solo

	nombre_marca TEXT,
	/* TEXT = valor string

	nacionalidad TEXT
)
*/		--Se debe comentar ya que como ya se ejecuto una vez la tabla ya existe, y se buguea si se vuelve a ejecutar */

/* CREATE TABLE producto(

	id_producto INTEGER PRIMARY KEY AUTOINCREMENT,
	nombre_producto TEXT,
	descripcion TEXT,
	precio NUMERIC,
	id_marca INTEGER REFERENCES marca(id_marca)
)
*/

--INSERT INTO marca (nombre_marca,nacionalidad) VALUES ('samung','corea'),('redmi','chino')

INSERT INTO producto (nombre_producto,descripcion,precio,id_marca) VALUES 
('monitor','24 " 8k',1000,1),('portatil','ultima generacion',1300,2),
('monitor','4k año 2026',1100,1),('maus','con pesas',1100,3)


SELECT * FROM marca

SELECT * FROM producto as p INNER JOIN marca as m
ON p.id_marca = m.id_marca