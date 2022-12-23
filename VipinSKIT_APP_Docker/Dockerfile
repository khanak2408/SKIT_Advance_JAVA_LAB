FROM tomcat:9-jre11
COPY myapp.war /usr/local/tomcat/webapps/
COPY mysql-connector-java-8.0.30.jar /usr/local/tomcat/lib/
COPY mysql-connector-java-8.0.30.jar /usr/local/lib/mysql-connector-java-8.0.30.jar
ENV CLASSPATH="/usr/local/lib/mysql-connector-java-8.0.30.jar"
EXPOSE 8080
CMD ["catalina.sh", "run"]

