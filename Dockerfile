FROM amazoncorretto:8
MAINTAINER manuelorozco
COPY target\backEnd-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]