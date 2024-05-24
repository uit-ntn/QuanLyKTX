# Sử dụng hình ảnh Maven để build ứng dụng
FROM maven:3.8.4-openjdk-17 AS build
COPY . /app
WORKDIR /app
RUN mvn clean package -DskipTests




# Sử dụng hình ảnh OpenJDK để chạy ứng dụng
FROM openjdk:21-jdk-slim
COPY --from=build /app/target/QuanLyKyTucXa-0.0.1-SNAPSHOT.jar /app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
