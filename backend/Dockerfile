FROM adoptopenjdk:11-jre-hotspot as builder
WORKDIR /opt/travel
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} ./application.jar
RUN java -Djarmode=layertools -jar application.jar extract

FROM adoptopenjdk:11-jre-hotspot
WORKDIR /opt/travel
COPY --from=builder  /opt/travel/dependencies/ ./
COPY --from=builder  /opt/travel/spring-boot-loader/ ./
COPY --from=builder  /opt/travel/snapshot-dependencies/ ./
COPY --from=builder  /opt/travel/application/ ./
EXPOSE 8081
ENTRYPOINT ["java", "org.springframework.boot.loader.JarLauncher"]