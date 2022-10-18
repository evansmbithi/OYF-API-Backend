FROM eclipse-temurin:17-jdk-focal

WORKDIR /app

COPY .mvn/ .mvn
COPY mvnw pom.xml ./
RUN ./mvnw dependency:go-offline

COPY src ./src

CMD ["./mvnw", "spring-boot:run"]

# docker build --platform linux/amd64 -t OYF-API-Backend .
# docker run -p 3307:8080 -t OYF-API-Backend
# docker push username/OYF-API-Backend
