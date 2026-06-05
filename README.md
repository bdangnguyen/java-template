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

Run tests and generate a coverage report:

```bash
./gradlew test
```

Coverage report: `build/reports/jacoco/test/html/index.html`

## Code Quality

| Command | Description |
|---------|-------------|
| `./gradlew checkstyleMain` | Check main sources against Google Java Style |
| `./gradlew checkstyleTest` | Check test sources against Google Java Style |
| `./gradlew spotbugsMain` | Run static bug analysis on main sources |
| `./gradlew spotbugsTest` | Run static bug analysis on test sources |
| `./gradlew build` | Run all checks, tests, and coverage |

Reports are generated under `build/reports/`.

## Project Structure

```
├── build.gradle.kts
├── settings.gradle.kts
├── gradlew / gradlew.bat
├── config/
│   ├── checkstyle/
│   │   └── checkstyle.xml       # Google Java Style rules
│   └── spotbugs/
│       └── exclude.xml          # SpotBugs exclusion filters
└── src/
    ├── main/java/com/java/template/
    │   └── Main.java
    └── test/java/com/java/template/
        └── MainTest.java
```

## Dependencies

| Dependency | Version | Scope |
|------------|---------|-------|
| JUnit Jupiter | 5.12.0 | test |
| AssertJ | 3.27.0 | test |

## Tooling

| Tool | Version | Purpose |
|------|---------|---------|
| Checkstyle | 10.21.4 | Google Java Style enforcement |
| SpotBugs | 4.9.8 | Static bug analysis |
| JaCoCo | 0.8.13 | Code coverage |
