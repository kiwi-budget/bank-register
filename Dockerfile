FROM openjdk:alpine
ADD build/libs/bank-register-0.0.1-SNAPSHOT.jar bank-register.jar
ENTRYPOINT ["java", "-jar", "/bank-register.jar"]
EXPOSE 8080 8778 9779