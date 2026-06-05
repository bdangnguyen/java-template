# java-template

A Java 25 (LTS) project template using [Gradle](https://gradle.org/) as the build tool, [JUnit 5](https://junit.org/junit5/) as the testing framework, and [AssertJ](https://assertj.github.io/doc/) for fluent assertions.

## Requirements

- Java 25 (LTS)
- No Gradle installation needed — the Gradle wrapper (`./gradlew`) is included

## Getting Started

Build the project:

```bash
./gradlew build
```

Run the application:

```bash
./gradlew run
```

## Testing

```bash
./gradlew test
```

## Project Structure

```
├── build.gradle.kts
├── settings.gradle.kts
├── gradlew / gradlew.bat
└── src/
    ├── main/java/com/java/template/
    │   └── Main.java
    └── test/java/com/java/template/
        └── MainTest.java
```

## Dependencies

| Dependency | Version | Scope |
|---|---|---|
| JUnit Jupiter | 5.12.0 | testImplementation |
| AssertJ | 3.27.0 | testImplementation |
