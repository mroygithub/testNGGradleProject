


plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {

    testImplementation ("io.cucumber:cucumber-java:7.14.0")
    testImplementation ("io.cucumber:cucumber-testng:7.14.0")
    testImplementation ("org.testng:testng:7.9.0")
    testImplementation("org.seleniumhq.selenium:selenium-java:4.37.0")


}

tasks.test {

    // This is the key line
    testLogging.showStandardStreams = true

    // Optional logging configuration
    testLogging {
        // Log events like test start, pass, skip, fail
        events("started", "passed", "skipped", "failed")
        // showStackTraces = true
    }

    useTestNG {
        // CORRECT: Use a path relative to the project root
        suites("src/test/resources/testNG.xml")
        // Disable TestNG's default listeners
        useDefaultListeners = false
    }
}