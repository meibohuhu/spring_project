FROM eclipse-temurin:17

LABEL mentainer="meibohu96@gmail.com"

WORKDIR /app

COPY target/springboot-restful-webservices-0.0.1-SNAPSHOT.jar /app/springboot-restful-ws.jar

ENTRYPOINT ["java", "-jar", "springboot-restful-ws.jar"]