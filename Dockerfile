FROM openjdk:11
ADD build/libs/logs-0.0.1-SNAPSHOT.jar app2.jar

ENTRYPOINT ["java","-jar","app2.jar"]
