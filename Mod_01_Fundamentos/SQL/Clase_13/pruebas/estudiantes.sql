-- CREATE TABLE estudiantes (
--     id      INTEGER PRIMARY KEY AUTOINCREMENT,
--     nombre  TEXT    NOT NULL,
--     edad    INTEGER,
--     ciudad  TEXT
-- );
-- INSERT INTO estudiantes (nombre, edad, ciudad) VALUES
-- 	('Ana', 22, 'Madrid'),
-- 	('Carlos', 25, 'Lima'),
-- 	('Sofía', 21, 'Bogotá'),
-- 	('Luis', 23, 'México'),
-- 	('María', 22, 'Lima');

-- CREATE TABLE cursos (
--     id     INTEGER PRIMARY KEY AUTOINCREMENT,
--     nombre TEXT NOT NULL,
--     horas  INTEGER
-- );

-- CREATE TABLE inscripciones (
--     id             INTEGER PRIMARY KEY AUTOINCREMENT,
--     estudiante_id  INTEGER REFERENCES estudiantes(id),
--     curso_id       INTEGER REFERENCES cursos(id)
-- );

-- INSERT INTO cursos (nombre, horas) VALUES ('Bases de Datos', 40);
-- INSERT INTO cursos (nombre, horas) VALUES ('Python Básico', 30);
-- INSERT INTO cursos (nombre, horas) VALUES ('Diseño Web', 25);
-- 
-- -- Ana (id=1) se inscribe en Bases de Datos (id=1) y Python (id=2)
-- INSERT INTO inscripciones (estudiante_id, curso_id) VALUES (1, 1);
-- INSERT INTO inscripciones (estudiante_id, curso_id) VALUES (1, 2);
-- 
-- -- Carlos (id=2) se inscribe en Python (id=2)
-- INSERT INTO inscripciones (estudiante_id, curso_id) VALUES (2, 2);
-- 
-- -- Sofía (id=3) se inscribe en Diseño Web (id=3)
-- INSERT INTO inscripciones (estudiante_id, curso_id) VALUES (3, 3);


SELECT e.nombre, c.nombre AS curso, c.horas
FROM inscripciones AS i
INNER JOIN estudiantes AS e ON i.estudiante_id = e.id
INNER JOIN cursos      AS c ON i.curso_id      = c.id