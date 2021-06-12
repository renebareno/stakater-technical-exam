# pull base image
FROM java:8
# port
EXPOSE 8080
# jars with the app
ADD target/stakater-technical-exam-0.0.1-SNAPSHOT.jar stakater-technical-exam-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java", "-jar","stakater-technical-exam-0.0.1-SNAPSHOT.jar"]

ENV NAME="René Arturo Bareño Campos" 
  