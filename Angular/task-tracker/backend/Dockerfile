FROM maven:3-eclipse-temurin-11-alpine

ENV SRC_DIR="/task-tracker-src"
ENV APP_DIR="/task-tracker"

WORKDIR ${SRC_DIR}
ADD pom.xml .
RUN mvn verify --fail-never

ADD . .

RUN mvn -DskipTests clean package

WORKDIR ${APP_DIR}
RUN cp ../${SRC_DIR}/target/*.jar ./task-tracker.jar

EXPOSE 5200
ENTRYPOINT [ "java", "-jar", "task-tracker.jar" ]