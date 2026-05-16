-- CREATE TABLE alumnos(
--     calumno INTEGER PRIMARY KEY AUTOINCREMENT,
--     nombre TEXT,
--     apellidos TEXT,
--     fechanac TEXT,
--     curso TEXT
-- );
-- 
-- CREATE TABLE examenes(
--     cexamen INTEGER PRIMARY KEY AUTOINCREMENT,
--     fechaex TEXT,
--     casig TEXT,
--     cprof TEXT,
--     nota REAL,
--     calumno INTEGER REFERENCES alumnos(calumno)
-- );

-- INSERT INTO alumnos (nombre, apellidos, fechanac, curso) VALUES
-- ('Juan', 'Perez', '2005-04-10', '2A'),
-- ('Maria', 'Lopez', '2004-09-21', '2B'),
-- ('Carlos', 'Garcia', '2005-01-15', '2A');
-- 
-- INSERT INTO examenes (fechaex, casig, cprof, nota, calumno) VALUES
-- ('2024-01-10', 'Matematicas', 'Ruiz', 8.5, 1),
-- ('2024-01-12', 'Lengua', 'Sanchez', 7.0, 1),
-- ('2024-01-10', 'Matematicas', 'Ruiz', 9.0, 2),
-- ('2024-01-11', 'Historia', 'Diaz', 6.5, 3);

SELECT *
FROM alumnos a
INNER JOIN examenes e
ON a.calumno = e.calumno;