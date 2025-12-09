# -------------------------------------------------------------
# ETAPA 1: BUILD (Construcción)
# Usamos una imagen que tiene Maven y el JDK completo para compilar
# -------------------------------------------------------------
FROM maven:3.9.6-eclipse-temurin-21 AS builder

# Creamos una carpeta de trabajo dentro del contenedor
WORKDIR /app

# Copiamos el código de tu proyecto (del PC al contenedor)
COPY . .

# Compilamos y empaquetamos (generamos el .jar) saltando los tests
# (Los tests ya los pasaste tú en tu fase TDD)
RUN mvn clean package -DskipTests

# -------------------------------------------------------------
# ETAPA 2: RUN (Ejecución / Producción)
# Usamos una imagen "slim" (ligera) que SOLO tiene lo necesario para correr Java (JRE)
# -------------------------------------------------------------
FROM eclipse-temurin:21-jre

# Definimos el directorio de trabajo
WORKDIR /app

# ¡AQUÍ ESTÁ LA MAGIA!
# Copiamos SOLO el archivo .jar generado en la etapa anterior (builder)
# No copiamos ni el código fuente, ni Maven, ni basura extra.
COPY --from=builder /app/target/*.jar app.jar

# Informamos que la app usa el puerto 8080
EXPOSE 8080

# El comando que arranca la aplicación
ENTRYPOINT ["java", "-jar", "app.jar"]