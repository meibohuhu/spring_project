FROM eclipse-temurin:17

LABEL mentainer="meibohu96@gmail.com"

WORKDIR /app

COPY target/test-service-0.0.1-SNAPSHOT.jar /app/test-service.jar

ENTRYPOINT ["java", "-jar", "test-service.jar"]