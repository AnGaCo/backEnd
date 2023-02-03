FROM openjdk:8-jdk-slim
MAINTAINER manuelorozco
COPY target/backEnd-0.0.1-SNAPSHOT.jar backend-app.jar
ENTRYPOINT ["java","-jar","/backend-app.jar"]