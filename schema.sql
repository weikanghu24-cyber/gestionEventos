-- Script de creación de base de datos
-- Ejecutar como root de MySQL

CREATE DATABASE IF NOT EXISTS gestion_eventos CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;

CREATE USER IF NOT EXISTS 'alumno'@'localhost' IDENTIFIED BY 'alumno_pass';
GRANT ALL PRIVILEGES ON gestion_eventos.* TO 'alumno'@'localhost';
FLUSH PRIVILEGES;

USE gestion_eventos;

CREATE TABLE IF NOT EXISTS evento (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nombre_evento VARCHAR(200) NOT NULL,
    fecha DATE NOT NULL,
    lugar VARCHAR(200) NOT NULL,
    aforo INT NOT NULL
);

CREATE TABLE IF NOT EXISTS ponente (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    apellidos VARCHAR(150) NOT NULL,
    empresa VARCHAR(200) NOT NULL,
    tema_charla VARCHAR(300) NOT NULL
);
