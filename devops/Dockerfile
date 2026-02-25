FROM eclipse-temurin:17-jdk-jammy
RUN apt-get update && apt-get install -y curl && rm -rf /var/lib/apt/lists/*
WORKDIR /app
EXPOSE 80
ENTRYPOINT ["java","-jar","app.jar"]
COPY target/ip-app-1.0.5-SNAPSHOT.jar app.jar