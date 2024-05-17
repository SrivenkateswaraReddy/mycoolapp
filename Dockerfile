# using base image for creating a container with the following image.
FROM amazoncorretto:17-alpine-jdk

#asking it to expose an port
EXPOSE 8080

VOLUME /tmp

ARG JAR_FILE

COPY /target/mycoolapp-0.0.1-SNAPSHOT.jar mycoolapp.jar

ENTRYPOINT ["java","-Dspring.profiles.active=github","-jar","/mycoolapp.jar"]
