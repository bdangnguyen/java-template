plugins {
    java
    application
    jacoco
    checkstyle
    id("com.github.spotbugs") version "6.5.5"
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(25)
    }
}

application {
    mainClass = "com.java.template.Main"
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.12.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
    testImplementation("org.assertj:assertj-core:3.27.0")

    spotbugs("com.github.spotbugs:spotbugs:4.9.8")
}

// ─── Test ────────────────────────────────────────────────────────────────────

tasks.test {
    useJUnitPlatform()
    finalizedBy(tasks.jacocoTestReport)
}

// ─── JaCoCo ──────────────────────────────────────────────────────────────────

jacoco {
    toolVersion = "0.8.13"
}

tasks.jacocoTestReport {
    dependsOn(tasks.test)
    reports {
        xml.required = true
        html.required = true
    }
}

tasks.jacocoTestCoverageVerification {
    violationRules {
        rule {
            limit {
                minimum = "0.80".toBigDecimal()
            }
        }
    }
}

// ─── Checkstyle (Google style) ───────────────────────────────────────────────
// Config: config/checkstyle/checkstyle.xml (Gradle's default location)

checkstyle {
    toolVersion = "10.21.4"
    isShowViolations = true
}

// ─── SpotBugs ────────────────────────────────────────────────────────────────

spotbugs {
    toolVersion = "4.9.8"
    effort = com.github.spotbugs.snom.Effort.MAX
    reportLevel = com.github.spotbugs.snom.Confidence.MEDIUM
    excludeFilter = file("config/spotbugs/exclude.xml")
}

tasks.spotbugsMain {
    reports.create("html") { required = true }
}

tasks.spotbugsTest {
    reports.create("html") { required = true }
}
