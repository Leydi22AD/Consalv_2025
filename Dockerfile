# Usar una imagen base de Java
FROM eclipse-temurin:17-jdk-alpine

# Establecer el directorio de trabajo dentro del contenedor
WORKDIR /app

# Copiar el archivo JAR al contenedor
COPY target/SQLCargo-0.0.1-SNAPSHOT.jar app.jar

# Exponer el puerto en el que la aplicación escucha
EXPOSE 8080

# Comando para ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "app.jar"]
