plugins {
    application
    alias(libs.plugins.dokka)
    alias(libs.plugins.gitSemVer)
    alias(libs.plugins.kotlin.jvm)
}

group = "io.github.andrea-acampora"
val projectId = "$group.$name"
val fullName = "Template project for DevOps Course"
val projectDetails = "A template project with DevOps practice"
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
