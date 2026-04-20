# Etapa 1 Build
FROM gradle:8.10-jdk17 AS build
WORKDIR /app

# Copia el contenido del proyecto
COPY inventario/ . 

# Compila omitiendo las pruebas para evitar errores de conexión a BD en el build
RUN gradle build --no-daemon -x test

# Etapa 2 Runtime
FROM eclipse-temurin:17-jre-alpine
WORKDIR /app

# Copia el JAR (ajustando el nombre si es necesario)
COPY --from=build /app/build/libs/*.jar app.jar

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]