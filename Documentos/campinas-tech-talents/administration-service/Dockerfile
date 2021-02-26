From maven as builder
RUN mkdir /home/maven
COPY pom.xml /home/maven
COPY src /home/maven
WORKDIR /home/maven
RUN mvn -B package
FROM openjdk:8-jdk-alpine
COPY --from=builder /home/maven/target/administration-service.jar .

EXPOSE 8060

ENTRYPOINT ["java","-jar","administration-service.jar"]