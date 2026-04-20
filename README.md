# API - Inventario de productos

API REST completa para gestionar inventario de una tienda, construida en Spring Boot, Gradle, Postgres y dockerizado.

## Tecnologias 
> Spring Boot 4.0.5
> Gradle
> PostgreSQL
> JPA - hibernate
> Docker, Docker compose

## Cómo ejecutar localmente
```bash
# 1. Clonar el repositorio
git clone 

# 2. Entrar a la carpeta inventario
cd inventario

# 3. Ejecutar con Docker compose
docker compose up --build
```

## Endpoints
| Método | Endpoint            | Description               |
| :---   | :---:               | ---:                      |
| GET    | /api/prodcutos      | Lista todos los productos |
| GET    | /api/prodcutos{id}  | Obtener producto por ID   |
| PUT    | /api/prodcutos/{id} | Actualizar productos      |
| POST   | /api/prodcutos      | Crear nuevo producto      |
| DELETE | /api/prodcutos/{id} | Eliminar producto         |
