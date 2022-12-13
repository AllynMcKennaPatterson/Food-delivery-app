FROM adoptopenjdk/openjdk11:latest
EXPOSE 8080
ADD target/travis-test-0.0.1-SNAPSHOT.jar travis-test-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar","/travis-test-0.0.1-SNAPSHOT.jar"]