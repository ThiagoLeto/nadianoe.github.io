USE examen;

CREATE TABLE barrios (
   id           INT  NOT NULL PRIMARY KEY,
   nombre       VARCHAR(50) NOT NULL,
   nro_comuna   INT  NOT NULL,
   perimetro    VARCHAR(50) NOT NULL,
   area         VARCHAR(50) NOT NULL
);

INSERT INTO barrios (id,nombre,comuna,perimetro,area) VALUES (0,'CHACARITA',15,'7724.85295457','3115707.10627');
INSERT INTO barrios (id,nombre,comuna,perimetro,area) VALUES (1,'PATERNAL',15,'7087.51329533','2229829.03363');
INSERT INTO barrios (id,nombre,comuna,perimetro,area) VALUES (2,'VILLA CRESPO',15,'8131.85707532','3615977.55634');
INSERT INTO barrios (id,nombre,comuna,perimetro,area) VALUES (3,'VILLA DEL PARQUE',11,'7705.38979708','3399595.6414799998');
INSERT INTO barrios (id,nombre,comuna,perimetro,area) VALUES (4,'ALMAGRO',5,'8537.90136849','4050752.24524');
INSERT INTO barrios (id,nombre,comuna,perimetro,area) VALUES (5,'CABALLITO',6,'10990.9644715','6851028.91357');
INSERT INTO barrios (id,nombre,comuna,perimetro,area) VALUES (6,'VILLA SANTA RITA',11,'5757.75233471','2153690.81329');
INSERT INTO barrios (id,nombre,comuna,perimetro,area) VALUES (7,'MONTE CASTRO',10,'7361.03641755','2627481.32508');
INSERT INTO barrios (id,nombre,comuna,perimetro,area) VALUES (8,'VILLA REAL',10,'5070.96565244','1334146.08283');
INSERT INTO barrios (id,nombre,comuna,perimetro,area) VALUES (9,'FLORES',7,'15772.4395096','8590784.13129');
INSERT INTO barrios (id,nombre,comuna,perimetro,area) VALUES (10,'FLORESTA',10,'7519.6540918','2320640.73551');
INSERT INTO barrios (id,nombre,comuna,perimetro,area) VALUES (11,'CONSTITUCION',1,'6326.84137473','2101994.9981299997');
INSERT INTO barrios (id,nombre,comuna,perimetro,area) VALUES (12,'SAN CRISTOBAL',3,'5987.22647879','2043711.12166');
INSERT INTO barrios (id,nombre,comuna,perimetro,area) VALUES (13,'BOEDO',5,'6602.51026593','2609850.87921');
INSERT INTO barrios (id,nombre,comuna,perimetro,area) VALUES (14,'VELEZ SARSFIELD',10,'7045.57833172','2400518.32602');
INSERT INTO barrios (id,nombre,comuna,perimetro,area) VALUES (15,'VILLA LURO',10,'8652.93003127','2566936.8725099997');
INSERT INTO barrios (id,nombre,comuna,perimetro,area) VALUES (16,'PARQUE PATRICIOS',4,'7878.43499311','3743439.99645');
INSERT INTO barrios (id,nombre,comuna,perimetro,area) VALUES (17,'MATADEROS',9,'11124.6357921','7398178.84035');
INSERT INTO barrios (id,nombre,comuna,perimetro,area) VALUES (18,'VILLA LUGANO',8,'15057.468389399999','9296142.3614');
INSERT INTO barrios (id,nombre,comuna,perimetro,area) VALUES (19,'SAN TELMO',1,'5178.03283928','1232270.1587399999');
INSERT INTO barrios (id,nombre,comuna,perimetro,area) VALUES (20,'SAAVEDRA',12,'11132.1393456','5538676.83282');
INSERT INTO barrios (id,nombre,comuna,perimetro,area) VALUES (21,'COGHLAN',12,'4627.56313138','1279951.37256');
INSERT INTO barrios (id,nombre,comuna,perimetro,area) VALUES (22,'VILLA URQUIZA',12,'10021.459664799999','5449058.92285');
INSERT INTO barrios (id,nombre,comuna,perimetro,area) VALUES (23,'COLEGIALES',13,'6374.61904507','2289774.10428');
INSERT INTO barrios (id,nombre,comuna,perimetro,area) VALUES (24,'BALVANERA',3,'8375.82181081','4342280.26804');
INSERT INTO barrios (id,nombre,comuna,perimetro,area) VALUES (25,'VILLA GRAL. MITRE',11,'6290.44056056','2162275.11535');
INSERT INTO barrios (id,nombre,comuna,perimetro,area) VALUES (26,'PARQUE CHAS',15,'4531.25339628','1385411.5137399998');
INSERT INTO barrios (id,nombre,comuna,perimetro,area) VALUES (27,'AGRONOMIA',15,'6556.16777187','2122169.34212');
INSERT INTO barrios (id,nombre,comuna,perimetro,area) VALUES (28,'VILLA ORTUZAR',15,'5684.99521114','1853802.05203');
INSERT INTO barrios (id,nombre,comuna,perimetro,area) VALUES (29,'BARRACAS',4,'12789.791771200002','7953453.43143');
INSERT INTO barrios (id,nombre,comuna,perimetro,area) VALUES (30,'PARQUE AVELLANEDA',9,'10165.614027700001','4732708.20931');
INSERT INTO barrios (id,nombre,comuna,perimetro,area) VALUES (31,'PARQUE CHACABUCO',7,'8406.91432075','3832116.69922');
INSERT INTO barrios (id,nombre,comuna,perimetro,area) VALUES (32,'NUEVA POMPEYA',4,'11033.5103019','4951510.87427');
INSERT INTO barrios (id,nombre,comuna,perimetro,area) VALUES (33,'PALERMO',14,'22126.5318584','15845871.287999999');
INSERT INTO barrios (id,nombre,comuna,perimetro,area) VALUES (34,'VILLA RIACHUELO',8,'10596.8267392','4232595.924790001');
INSERT INTO barrios (id,nombre,comuna,perimetro,area) VALUES (35,'VILLA SOLDATI',8,'12441.695877299999','8688163.55828');
INSERT INTO barrios (id,nombre,comuna,perimetro,area) VALUES (36,'VILLA PUEYRREDON',12,'7522.36038243','3303239.50936');
INSERT INTO barrios (id,nombre,comuna,perimetro,area) VALUES (37,'VILLA DEVOTO',11,'11562.0068','6404480.8537099995');
INSERT INTO barrios (id,nombre,comuna,perimetro,area) VALUES (38,'LINIERS',9,'9256.92732129','4374418.736769999');
INSERT INTO barrios (id,nombre,comuna,perimetro,area) VALUES (39,'VERSALLES',10,'5650.46628643','1406833.5958');
INSERT INTO barrios (id,nombre,comuna,perimetro,area) VALUES (40,'PUERTO MADERO',1,'17725.7208212','5040970.88514');
INSERT INTO barrios (id,nombre,comuna,perimetro,area) VALUES (41,'MONSERRAT',1,'6739.22231102','2198621.94089');
INSERT INTO barrios (id,nombre,comuna,perimetro,area) VALUES (42,'SAN NICOLAS',1,'6548.08475396','2289007.5825900002');
INSERT INTO barrios (id,nombre,comuna,perimetro,area) VALUES (43,'BELGRANO',13,'20609.7753969','7999239.813839999');
INSERT INTO barrios (id,nombre,comuna,perimetro,area) VALUES (44,'RECOLETA',2,'21452.8386478','6317264.56056');
INSERT INTO barrios (id,nombre,comuna,perimetro,area) VALUES (45,'RETIRO',1,'18837.988687','4512710.90703');
INSERT INTO barrios (id,nombre,comuna,perimetro,area) VALUES (46,'NUÑEZ',13,'10785.2610814','4424199.26509');
INSERT INTO barrios (id,nombre,comuna,perimetro,area) VALUES (47,'BOCA',4,'20060.0039394','5036240.45441');
