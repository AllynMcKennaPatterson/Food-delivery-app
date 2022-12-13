FROM openjdk:15-jdk-alpine

VOLUME /tmp

EXPOSE 8080

ARG JAR_FILE=target/food_delivery-app-0.0.1-SNAPSHOT.jar

ADD ${JAR_FILE} food_delivery-app-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "food_delivery-app-0.0.1-SNAPSHOT.jar"]

