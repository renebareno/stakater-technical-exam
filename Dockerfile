FROM java:8

EXPOSE 8080

ADD target/technical-exam-backend.jar  technical-exam-backend.jar

ENTRYPOINT ["java", "-jar","technical-exam-backend.jar"]
