# FROM maven:3.6-jdk-8 as builder
# COPY . /app
# WORKDIR /app
# RUN mvn clean install

# FROM openjdk:8-jdk-alpine
# VOLUME /myvolume
# ENV FILE_NAME /myvolume/message.txt
# ENV MESSAGE "Hello world!"
# ARG TARGET=app/target
# COPY --from=builder ${TARGET}/ /app/target
# ENTRYPOINT ["java","-jar","./app/target/SimpleGreeting-1.0-SNAPSHOT.jar"]
