plugins {
    kotlin("jvm") version "1.6.20"
    application
}

group = "io.github.andrea-acampora"

repositories {
    mavenCentral()
}

dependencies {

    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

application {
    mainClass.set("it.unibo.devops.MainKt")
}
