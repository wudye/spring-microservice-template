#stage 1
FROM eclipse-temurin:21 AS build

LABEL maintainer="mwu42 <chwmwei@gmail.com>"

ARG JAR_FILE=target/product-composite-service-1.0-SNAPSHOT.jar

COPY ${JAR_FILE} app.jar

#stage 2
FROM eclipse-temurin:21-jre

VOLUME /tmp

COPY --from=build /app.jar app.jar

ENTRYPOINT ["java","-jar","app.jar"]
