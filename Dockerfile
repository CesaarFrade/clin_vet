FROM eclipse-temurin:21-jdk-jammy
# Asegúrate de que este nombre coincida con el JAR generado en tu carpeta target
ARG JAR_FILE=target/ClinicaVeterinaria-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar
EXPOSE 8080
# Corregido: sin la "D" extra y java en minúsculas
ENTRYPOINT ["java", "-jar", "app.jar"]