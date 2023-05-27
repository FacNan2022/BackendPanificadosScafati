FROM amazoncorretto:11-alpine-jdk
maintainer FacNan
copy target/panificadosScafati-AP-0.0.1-SNAPSHOT.jar panificadosScafati-APP.jar
entrypoint ["java", "-jar","/panificadosscafati-APP.jar"]
