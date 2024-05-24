# The below Docker code creates an executable jar and then creates an Docker Image out of it.
FROM gradle:8.7-jdk21-alpine AS build
COPY --chown=gradle:gradle . /home/gradle/src
WORKDIR /home/gradle/src
RUN gradle build -x test --no-daemon

FROM bellsoft/liberica-openjdk-debian:21 AS production
EXPOSE 8080
RUN mkdir /app
COPY --from=build /home/gradle/src/build/libs/*.jar /app/app.jar
ENTRYPOINT ["java","-jar","app/app-*.jar"]
