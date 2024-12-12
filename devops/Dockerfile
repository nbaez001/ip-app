FROM openjdk:17-jdk-slim
RUN apt-get update && apt-get install -y curl && rm -rf /var/lib/apt/lists/*
WORKDIR /app
EXPOSE 8080
ENTRYPOINT ["java","-jar","app.jar"]
COPY target/ip-app-1.0.4-SNAPSHOT.jar app.jar