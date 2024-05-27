FROM openjdk:8
ADD target/springboot-database-k8s.jar springboot-database-k8s.jar
ENTRYPOINT ["java","-jar","springboot-database-k8s.jar"]