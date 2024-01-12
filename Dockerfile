# Use an official Maven image as the base image
FROM maven:3.9.2-amazoncorretto-11 AS build
#FROM tomcat:9.0.68-jdk11-corretto

ENV HTTP_PROXY http://10.15.3.20:80
ENV HTTPS_PROXY http://10.15.3.20:80

# Configure Maven proxy settings
RUN mkdir -p /root/.m2 && \
    echo "<settings><proxies><proxy><id>example-proxy</id><active>true</active><protocol>http</protocol><host>10.15.3.20</host><port>80</port></proxy></proxies></settings>" > /root/.m2/settings.xml


# Set the working directory in the container
WORKDIR /app
# Copy the pom.xml and the project files to the container
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

FROM tomcat:9.0.68-jdk11-corretto
#WORKDIR /app
RUN mv /usr/local/tomcat/webapps /usr/local/tomcat/webapps2
RUN mv /usr/local/tomcat/webapps.dist /usr/local/tomcat/webapps
COPY --from=build /app/target/wrap_bkd-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps
RUN mv /usr/local/tomcat/webapps/wrap_bkd-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps/bkd.war
# RUN mkdir /mnt/carik_assets
# RUN mkdir /mnt/carik_assets/telusur/
# RUN mkdir /opt/report
# RUN mkdir /opt/report/carik_telusur
# COPY http_ca.crt /opt
# COPY Blank.jasper /opt/report/carik_telusur
# COPY Ryan2.jasper /opt/report/carik_telusur
#RUN cp /app/target/auth.war /usr/local/tomcat/webapps
COPY context.xml /usr/local/tomcat/webapps/manager/META-INF/
COPY context.xml /usr/local/tomcat/webapps/host-manager/META-INF/
COPY tomcat-users.xml /usr/local/tomcat/conf/

CMD ["catalina.sh", "run"]
