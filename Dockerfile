FROM openjdk:8-jre-alpine
WORKDIR /app
EXPOSE 8080
COPY employee-hello-*.jar /app/employee-hello.jar
CMD ["java", "-jar", "employee-hello.jar"]
