# Etapa de compilación
FROM maven:3.9-eclipse-temurin-17 AS build
WORKDIR /app
COPY pom.xml .
RUN mvn dependency:go-offline -B

COPY src ./src
RUN mvn package -DskipTests -Dexec.skip=true

# Etapa final (para correr la app ligera)
FROM eclipse-temurin:17-jre
WORKDIR /app
COPY --from=build /app/target/*.jar app.jar
COPY firebase-config.json ./firebase-config.json
ENTRYPOINT ["java", "-jar", "app.jar"]
