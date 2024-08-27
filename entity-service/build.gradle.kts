plugins {
    alias(libs.plugins.springBoot)
}

dependencies {
    api(project(":entity-models"))
    api(libs.springBootStarterWeb)
    api(libs.springBootStarterTest)
}

description = "entity-service"
