FROM openjdk:17
VOLUME /tmp
##ENV IMG_PATH=/img
EXPOSE 8080
##RUN mkdir -p /img
ADD ./target/tipocambio-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT [ "java" , "-jar" , "/app.jar" ]