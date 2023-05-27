
FROM amazoncorretto:11-alpine-jdk
maintainer FacNan
copy target/panificadosScafati-0.0.1-SNAPSHOT.jar panificadosScafati-APP.jar
entrypoint ["java", "-jar","/panificadosScafati-APP.jar"]
