FROM openjdk:17-alpine
VOLUME /tmp
COPY target/aws-ecs-test-0.0.1-SNAPSHOT.jar aws-ecs-test.jar
ENTRYPOINT ["java", "-jar" , "aws-ecs-test.jar"]