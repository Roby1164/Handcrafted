enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

rootProject.name = "handcrafted"

pluginManagement {
    repositories {
        maven(url = "https://maven.architectury.dev/")
        maven(url = "https://maven.minecraftforge.net/")
        maven(url = "https://maven.resourcefulbees.com/repository/maven-public/")
        gradlePluginPortal()
    }
}

include("common")
include("fabric")
include("forge")
