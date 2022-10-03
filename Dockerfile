FROM adoptopenjdk/openjdk8
ENV APP_HOME=/app
WORKDIR $APP_HOME
COPY target/KTTKPM-LabTH04-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
CMD ["java","-jar","app.jar"]