plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.5.0"
}
rootProject.name = "spring-examples"
include(":entity-service")
include(":entity-common")
include(":entity-models")

dependencyResolutionManagement {
    repositories {
        mavenCentral()
        maven {
            url = uri("https://repo.spring.io/release")
        }
        maven {
            url = uri("https://repo.spring.io/snapshot")
        }
        maven {
            url = uri("https://repository.jboss.org/maven2")
        }
        maven {
            url = uri("https://repo1.maven.org/maven2/")
        }
        maven {
            url = uri("https://repo.spring.io/milestone")
        }
    }
}

dependencyResolutionManagement {
    repositoriesMode = RepositoriesMode.PREFER_PROJECT
}