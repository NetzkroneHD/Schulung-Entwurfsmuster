FROM openjdk:17

WORKDIR /home/

COPY ./target/*.jar executable.jar

CMD ["java","-jar","executable.jar"]