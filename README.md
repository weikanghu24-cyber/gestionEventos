Aplicación web desarrollada con **Spring Boot, JPA/Hibernate, Thymeleaf y MySQL** para la gestión de eventos y ponentes.

---

## 🚀 URL en Railway

**https://gestioneventos-proyects.up.railway.app/**

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
git clone https://github.com/weikanghu24-cyber/gestionEventos
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
src/main/java/pio/daw/navegaweb/
├── NavegawebApplication.java
├── model/
│   ├── Evento.java
│   └── Ponente.java
├── repository/
│   ├── EventoRepository.java
│   └── PonenteRepository.java
├── controller/
│   └── AppController.java
└── runner/
└── DataLoader.java

---

## 📸 Capturas de Pantalla
---
Página inicial
<img width="1132" height="695" alt="Captura de pantalla 2026-05-08 220455" src="https://github.com/user-attachments/assets/dcb59812-f45a-42cd-8d83-7a20ae1bb63c" />
---
Listado de eventos
<img width="1289" height="694" alt="Captura de pantalla 2026-05-08 220627" src="https://github.com/user-attachments/assets/dd1629bc-556d-4633-89b0-9658c012c2b5" />
---
Listado de ponentes
<img width="1211" height="683" alt="Captura de pantalla 2026-05-08 220615" src="https://github.com/user-attachments/assets/7ba0c368-7c9f-4546-b97e-0cadf2925c83" />
---
Alta de evento
<img width="1288" height="721" alt="Captura de pantalla 2026-05-08 220559" src="https://github.com/user-attachments/assets/a9850d89-260a-497c-87c1-84117379d470" />
---
Alta de ponente
<img width="1329" height="723" alt="Captura de pantalla 2026-05-08 220543" src="https://github.com/user-attachments/assets/ece94e8f-6fc1-48a9-8a0c-00cebd82a431" />
---


