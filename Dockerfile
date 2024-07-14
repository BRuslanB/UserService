FROM openjdk:17-slim
MAINTAINER ruslan
WORKDIR /app
COPY ./build/libs/*.jar app-user-service.jar
ENTRYPOINT ["java", "-jar", "app-user-service.jar"]