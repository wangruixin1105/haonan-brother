FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD target/haonan-auth.jar haonan-auth.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/haonan-auth.jar"]
EXPOSE 8000
RUN /bin/cp /usr/share/zoneinfo/Asia/Shanghai /etc/localtime \&& echo 'Asia/Shanghai' >/etc/timezone
