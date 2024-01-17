FROM openjdk:8-jre-alpine

WORKDIR /app

COPY target/data-indicator-0.0.1-SNAPSHOT.jar /app/data-indicator-0.0.1-SNAPSHOT.jar

EXPOSE 8100

ENTRYPOINT ["java","-jar","/app/data-indicator-0.0.1-SNAPSHOT.jar","--spring.profiles.active=docker"]
