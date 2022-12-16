plugins {
    id("org.danilopianini.gradle-pre-commit-git-hooks") version "1.0.23"
}

rootProject.name = "devops-practice"

enableFeaturePreview("VERSION_CATALOGS")

gitHooks {
    commitMsg {
        conventionalCommits()
    }
    createHooks(true)
}
