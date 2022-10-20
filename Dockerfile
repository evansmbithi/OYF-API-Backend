FROM eclipse-temurin:17-jdk-focal

# RUN chmod +x mvnw

WORKDIR /app

COPY .mvn/ .mvn
COPY mvnw pom.xml ./
RUN chmod +x mvnw && ./mvnw dependency:go-offline

COPY src ./src

CMD ["./mvnw", "spring-boot:run"]

# docker build --platform linux/amd64 -t oyf-api-backend .
# docker run -p 3307:8080 -t oyf-api-backend
# docker push username/oyf-api-backend