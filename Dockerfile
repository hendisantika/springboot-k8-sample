FROM openjdk:8-jre-alpine

COPY build/libs/springboot-k8-sample-0.0.1-SNAPSHOT.jar /application.jar

CMD ["java", "-jar", "/application.jar"]