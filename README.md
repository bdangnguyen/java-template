# java-template

A Java 25 (LTS) project template using [Maven](https://maven.apache.org/) as the build tool, [JUnit 5](https://junit.org/junit5/) as the testing framework, and [AssertJ](https://assertj.github.io/doc/) for fluent assertions.

## Requirements

- Java 25 (LTS)
- Maven 3.9+

## Getting Started

Clone the repo and build:

```bash
mvn clean install
```

Run the application:

```bash
java -jar target/template-1.0-SNAPSHOT.jar
```

## Testing

```bash
mvn clean test
```

## Project Structure

```
src/
├── main/java/com/java/template/
│   └── Main.java
└── test/java/com/java/template/
    └── MainTest.java
```

## Dependencies

| Dependency | Version | Scope |
|---|---|---|
| JUnit Jupiter | 5.12.0 | test |
| AssertJ | 3.27.0 | test |
