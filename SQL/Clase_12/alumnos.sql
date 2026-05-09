CREATE TABLE alumnos(
    calumno INTEGER PRIMARY KEY AUTOINCREMENT,
    nombre TEXT,
    apellidos TEXT,
    fechanac TEXT,
    curso TEXT
);

CREATE TABLE examenes(
    cexamen INTEGER PRIMARY KEY AUTOINCREMENT,
    fechaex TEXT,
    casig TEXT,
    cprof TEXT,
    nota REAL,
    calumno INTEGER REFERENCES alumnos(calumno)
);