FROM maven:3.9-eclipse-temurin-21 AS builder
WORKDIR /workspace
COPY pom.xml .
COPY configserver ./configserver

COPY licensing-service ./licensing-service

RUN mvn -B -DskipTests package -pl licensing-service -am

# 直接使用JRE运行Spring Boot可执行JAR
FROM eclipse-temurin:21-jre
WORKDIR /app
COPY --from=builder /workspace/licensing-service/target/*.jar app.jar

EXPOSE 18091

ENTRYPOINT ["java","-jar","app.jar"]
