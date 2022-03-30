import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import java.beans.EventHandler.create

plugins {
    id ("org.jetbrains.kotlin.jvm") version "1.5.10"
    `maven-publish`
}


publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = "org.brandjunhoe"
            artifactId = "e-commerce-common-module"
            version = "0.1"
            from(components["java"])
        }
    }
}

group = "org.brandjunhoe"
version = "1.0.1"


repositories {
    mavenCentral()
}


dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib")
}


tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs = listOf("-Xjsr305=strict")
        jvmTarget = "11"
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}
