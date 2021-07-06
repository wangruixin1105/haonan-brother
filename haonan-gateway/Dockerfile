FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD target/haonan-gateway.jar haonan-gateway.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/haonan-gateway.jar"]
EXPOSE 9999
RUN /bin/cp /usr/share/zoneinfo/Asia/Shanghai /etc/localtime \&& echo 'Asia/Shanghai' >/etc/timezone
