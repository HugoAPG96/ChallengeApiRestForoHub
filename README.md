# Foro Hub API

Foro Hub es una API REST desarrollada en Java usando Spring Boot. La aplicación permite la gestión de usuarios y tópicos en un foro. 

## Dependencias

Este proyecto utiliza las siguientes dependencias de Spring Boot y otras librerías:

- `spring-boot-starter-web`
- `spring-boot-devtools`
- `lombok`
- `spring-boot-starter-test`
- `spring-boot-starter-data-jpa`
- `flyway-core`
- `flyway-mysql`
- `mysql-connector-j`
- `spring-boot-starter-validation`
- `spring-boot-starter-security`
- `spring-security-test`
- `java-jwt`

## Configuración

### Base de Datos

El proyecto utiliza una base de datos MySQL con las siguientes tablas:

- `usuarios`
- `topicos`

### Endpoints

#### Autenticarse

**POST**: `http://localhost:8080/login`

**Body**:
```json
{
    "login": "hugo.peral",
    "clave": "123456"
}
```
### Tópicos

#### Listar Tópicos
**GET**: `/topicos`

#### Obtener Tópico por ID
**GET**: `/topicos/{id}`

#### Registrar Nuevo Tópico
**POST**: `/topicos`
```json
{
    "titulo": "Error validación1",
    "mensaje": "Error al ejecutar un metodo obtener datos1",
    "autor": "Jose Perez",
    "curso": "HTTP en la web"
}
```

#### Actualizar Tópico
**PUT**: `/topicos`
```json
{
    "id": 5,
    "titulo": "Error validación usuario2"
}
```

#### Eliminar Tópico
**DELETE**: `/topicos/{id}`

## Seguridad

La API utiliza JWT (JSON Web Tokens) para la autorización. Asegúrate de enviar el token en el encabezado de autorización para acceder a los endpoints protegidos.

### Configuración de Seguridad

- La autenticación se realiza mediante el endpoint `/login`
- Tras un login exitoso, se genera un token JWT
- Para acceder a endpoints protegidos, incluye el token en el encabezado de la solicitud:

