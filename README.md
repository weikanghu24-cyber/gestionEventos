# Gestión de Eventos y Ponentes

Aplicación web desarrollada con **Spring Boot, JPA/Hibernate, Thymeleaf y MySQL** para la gestión de eventos y ponentes.

---

## 🚀 URL en Railway

**https://gestioneventos-production.up.railway.app**

---

## 📋 Descripción

Plataforma para gestionar **eventos** (nombre, fecha, lugar, aforo) y **ponentes** (nombre, apellidos, empresa, tema de charla), con listados completos y formularios de alta.

---

## ⚙️ Requisitos Previos

- Java 17+
- MySQL 8.0+ (puerto 3307)
- Maven 3.8+
- Spring Boot 3.2.5

---

## 🛠️ Pasos para Ejecutarlo

### 1. Clonar el repositorio
```bash
git clone https://github.com/TU-USUARIO/gestionEventos.git
cd gestionEventos
```

### 2. Crear la base de datos en MySQL
```sql
CREATE DATABASE gestion_eventos;
CREATE USER IF NOT EXISTS 'alumno'@'localhost' IDENTIFIED BY 'alumno_pass';
GRANT ALL PRIVILEGES ON gestion_eventos.* TO 'alumno'@'localhost';
FLUSH PRIVILEGES;
```

### 3. Configurar application.properties
El archivo ya está configurado para conectarse a MySQL en el puerto 3307 con usuario `alumno`.

### 4. Ejecutar la aplicación
```bash
mvn spring-boot:run
```

Accede en: **http://localhost:8090/inicio**

---

## 📌 Endpoints

| Método | Ruta | Descripción |
|--------|------|-------------|
| GET | `/inicio` | Página principal |
| GET | `/listadoEvento` | Tabla de todos los eventos |
| GET | `/listadoPonente` | Tabla de todos los ponentes |
| GET/POST | `/altaEvento` | Formulario alta de evento |
| GET/POST | `/altaPonente` | Formulario alta de ponente |

---

## 🗂️ Estructura del Proyecto
