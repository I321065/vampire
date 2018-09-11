FROM openjdk:8-jre
MAINTAINER Nick yin <1181476441@qq.com>

# Add Maven dependencies (not shaded into the artifact; Docker-cached)
# Add the service itself
ARG JAR_FILE
ADD target/${JAR_FILE} /usr/share/myservice/gateway.jar
ENTRYPOINT ["/usr/bin/java", "-jar", "/usr/share/myservice/gateway.jar"]