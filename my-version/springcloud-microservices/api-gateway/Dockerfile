FROM eclipse-temurin:17

LABEL mentainer="meibohu96@gmail.com"

WORKDIR /app

COPY target/api-gateway-0.0.1-SNAPSHOT.jar /app/api-gateway.jar

ENTRYPOINT ["java", "-jar", "api-gateway.jar"]