# Use the official OpenJDK base image for Java 17
FROM openjdk:17-jdk-slim-buster
# Set maintainer name
MAINTAINER truongbn
# Set the working directory inside the container
WORKDIR /app
# Copy the compiled Java application JAR file into the container
COPY target/address-service1-0.0.1-SNAPSHOT.jar /app/address-service1.jar
# Expose the port that the application will run on
EXPOSE 8080
# Command to run the Java application
CMD ["java", "-jar", "address-service1.jar"]