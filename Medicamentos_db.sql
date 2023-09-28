
-- Si la base de datos existe, elimínala
DROP DATABASE IF EXISTS Medicamentos_db;
-- Crea la base de datos
CREATE DATABASE Medicamentos_db;
USE Medicamentos_db;

-- -----------------------------------------------------------
CREATE TABLE medicamentos
(
idMedicamento int PRIMARY KEY,
nombre VARCHAR(255),
descripcion TEXT,
categoria VARCHAR(50),
precio DECIMAL(	10,2),
stock INT,
fechaVencimiento DATE,
proveedor VARCHAR(100)
);
----------------------------------------
