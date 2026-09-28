# Java Health App

A tiny Spring Boot app for practicing GitHub Actions CI.

## Requirements

Java 17 and Maven 3.9+.

## Run

```bash
mvn spring-boot:run
```

Open http://localhost:8080/health in your browser. The page displays **Healthy**. `/` redirects to `/health`.

## Test and package

```bash
mvn verify
java -jar target/health-app-0.0.1-SNAPSHOT.jar
```

The included GitHub Actions workflow tests and packages the app on pushes and pull requests. Later, add your project code alongside this health endpoint.
