-- CLAVE FORÁNEA o FOREIGN KEY

 CREATE TABLE barrios (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50),
    perimetro VARCHAR(50),
    área VARCHAR(50),
    nro_comuna INT,
    FOREIGN KEY (nro_comuna) REFERENCES comunas(nro_comuna)
) 

CREATE TABLE comunas (
    nro_comuna INT PRIMARY KEY,
    perimetro VARCHAR(50),
    área VARCHAR(50)
) 










