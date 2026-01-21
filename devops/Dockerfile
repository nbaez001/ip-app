FROM eclipse-temurin:17-jre-jammy
RUN apt-get update && apt-get install -y curl && rm -rf /var/lib/apt/lists/*
WORKDIR /app
EXPOSE 80
ENTRYPOINT ["java","-jar","app.jar"]
COPY target/app.jar app.jar