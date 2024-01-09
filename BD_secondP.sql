create database library;

use library;

CREATE TABLE libro (
    id INT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(100) NOT NULL,
    autor VARCHAR(100) NOT NULL,
    genero VARCHAR(50),
    anio_publicacion YEAR,
    estado_disponible BOOLEAN
);

INSERT INTO libro (titulo, autor, genero, anio_publicacion, estado_disponible)
VALUES ('La molleja', 'Mnuel', 'Drana politico', 2000, false);

INSERT INTO libro (titulo, autor, genero, anio_publicacion, estado_disponible)
VALUES ('La molleja', 'Mnuel', 'Drana politico', 2000, false);

select * from libro;