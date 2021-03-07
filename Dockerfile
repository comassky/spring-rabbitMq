FROM adoptopenjdk:11-jre-openj9
EXPOSE 8080
ARG JAR_FILE=target/rabbitMq-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
