pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()

        //slider view
        maven { setUrl("https://jitpack.io") }
    }
}

rootProject.name = "Waves Of Food"
include(":app")
