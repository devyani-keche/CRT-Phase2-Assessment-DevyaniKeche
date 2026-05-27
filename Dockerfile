# Q19

FROM eclipse-temurin:21-jre

COPY target/app.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]