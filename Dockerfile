FROM openjdk:8-jre-alpine
WORKDIR /app
EXPOSE 8080
COPY spring-hello-*.jar /app/spring-hello.jar
CMD ["java", "-jar", "spring-hello.jar"]
