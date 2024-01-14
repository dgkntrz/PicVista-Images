FROM openjdk:17
ADD Images-0.0.1-SNAPSHOT.jar Images-0.0.1-SNAPSHOT.jar
EXPOSE 8092
ENTRYPOINT ["java","-jar","Images-0.0.1-SNAPSHOT.jar"]