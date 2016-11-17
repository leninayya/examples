FROM anapsix/alpine-java

ENV SPRING_PROFILES_ACTIVE docker
ADD target/exampleservice-0.0.1-SNAPSHOT.jar app.jar

ADD entrypoint.sh /entrypoint.sh

RUN chmod +x /entrypoint.sh

EXPOSE 8080

ENTRYPOINT ["/entrypoint.sh"]
