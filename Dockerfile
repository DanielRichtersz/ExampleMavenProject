FROM java:8
RUN apt-get -y update && apt-get install -y maven
ADD . /JenkinsTestApplication
WORKDIR /JenkinsTestApplication
CMD ["mvn", "validate", "compile", "test", "package"]

CMD ["java","-jar","/target/JenkinsTestApplication.jar"]