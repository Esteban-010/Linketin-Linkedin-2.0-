DROP TABLE USUARIO;
DROP TABLE TEMATICA;
DROP TABLE CURSO;

CREATE TABLE USUARIO (
    ID SERIAL PRIMARY KEY,
    USERNAME VARCHAR(30),
    NOMBRES VARCHAR(30),
    APELLIDO_PAT VARCHAR(30),
    APELLIDO_MAT VARCHAR(30),
    CONTRA VARCHAR(20)
);

CREATE TABLE TEMATICA (
    ID INTEGER PRIMARY KEY,
    NOMBRE VARCHAR(40)
);

CREATE TABLE CURSO (
    ID INTEGER PRIMARY KEY,
    NOMBRE VARCHAR(80),
    DESCRIPCION TEXT,
    PREMIUM BOOLEAN,
    TEMATICA INTEGER
);

INSERT INTO TEMATICA VALUES(100, 'NEGOCIO');
INSERT INTO TEMATICA VALUES(101, 'FINANZAS Y CONTABILIDAD');
INSERT INTO TEMATICA VALUES(102, 'INFORMATICA Y SOFTWARE');
INSERT INTO TEMATICA VALUES(103, 'DESARROLLO PERSONAL');
INSERT INTO TEMATICA VALUES(104, 'MARKETING');
INSERT INTO TEMATICA VALUES(105, 'SALUD Y FITNESS');
INSERT INTO TEMATICA VALUES(106, 'MUSICA');
INSERT INTO TEMATICA VALUES(107, 'FOTOGRAFIA Y VIDEO');
INSERT INTO TEMATICA VALUES(108, 'DISEÑO');

INSERT INTO CURSO VALUES(2100, 'Scrum Master + Liderar Equipos Scrum y Ágil', 'Lorem Ipsum has been the industrys standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.', TRUE, 100);
INSERT INTO CURSO VALUES(2101, 'Desarrollo de Tiendas Virtuales con WordPress y WooCommerce', 'Lorem Ipsum has been the industrys standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.', TRUE, 100);
INSERT INTO CURSO VALUES(2102, 'Crea tu Tienda Online Sin Inventario y Aprende Dropshipping', 'Lorem Ipsum has been the industrys standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.', FALSE, 100);

INSERT INTO CURSO VALUES(2103, 'Súper Cerebro: Lectura Rápida, Súper Lectura y Foto Lectura.', 'Lorem Ipsum has been the industrys standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.', FALSE, 103);
INSERT INTO CURSO VALUES(2104, 'Master en Inteligencia Emocional y Soft Skills YPD', 'Lorem Ipsum has been the industrys standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.', TRUE, 103);
INSERT INTO CURSO VALUES(2105, 'Inteligencia emocional y su efecto en tus destrezas sociales', 'Lorem Ipsum has been the industrys standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.', FALSE, 103);

INSERT INTO USUARIO VALUES(DEFAULT, 'blocked', 'Esteban', 'Palomino', 'Valdivia', 'esteban123');

SELECT * FROM TEMATICA;
SELECT * FROM USUARIO;

DELETE FROM USUARIO;

SELECT * FROM CURSO WHERE TEMATICA = 100;
SELECT * FROM TEMATICA WHERE ID = 100;