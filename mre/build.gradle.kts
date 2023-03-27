plugins {
    kotlin("jvm") version "1.8.0"
    id("app.cash.sqldelight") version "2.0.0-alpha05"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("app.cash.sqldelight", "sqlite-driver", "2.0.0-alpha05")
    implementation("app.cash.sqldelight", "primitive-adapters", "2.0.0-alpha05")
}

sqldelight {
    databases {
        create("Database") {
            packageName.set("mypackage")
        }
    }
}