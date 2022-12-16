plugins {
    id("com.gradle.enterprise") version "3.11.1"
    id("org.danilopianini.gradle-pre-commit-git-hooks") version "1.0.23"
}

rootProject.name = "devops-practice"

enableFeaturePreview("VERSION_CATALOGS")

gradleEnterprise {
    buildScan {
        termsOfServiceUrl = "https://gradle.com/terms-of-service"
        termsOfServiceAgree = "yes"
    }
}

gitHooks {
    commitMsg {
        conventionalCommits()
    }
    createHooks(true)
}
