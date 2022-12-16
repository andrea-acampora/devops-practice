plugins {
    application
    alias(libs.plugins.kotlin.jvm)
//    alias(libs.plugins.publishOnCentral)
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

//signing {
//    val signingKey: String? by project
//    val signingPassword: String? by project
//    useInMemoryPgpKeys(signingKey, signingPassword)
//}
//
//val repoSlug = "andrea-acampora/devops-practice"
//
//publishOnCentral {
//    projectDescription.set("DevOps practice project")
//    projectLongName.set("DevOps Practice for LSS-2022")
//    licenseName.set("Apache 2.0")
//    licenseUrl.set("https://github.com/$repoSlug/blob/main/LICENSE.md")
//    scmConnection.set("git:git@github.com:$repoSlug.git")
//    repository("https://maven.pkg.github.com/${repoSlug.toLowerCase()}") {
//        user.set("andrea-acampora")
//        password.set(System.getenv("GITHUB_TOKEN"))
//    }
//}
//
//publishing {
//    publications {
//        withType<MavenPublication>() {
//            pom {
//                developers {
//                    developer {
//                        name.set("Andrea Acampora")
//                        email.set("andrea.acampora@studio.unibo.it")
//                        url.set("http://andrea-acampora.github.io")
//                        roles.set(mutableSetOf("architect", "developer"))
//                    }
//                }
//            }
//        }
//    }
//}
