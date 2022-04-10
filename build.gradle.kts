import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("org.springframework.boot") version "2.6.4"
    id("io.spring.dependency-management") version "1.0.11.RELEASE"
    id ("org.jetbrains.kotlin.jvm") version "1.5.10"
    `maven-publish`
}


publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = "org.brandjunhoe"
            artifactId = "e-commerce-common-module"
            version = "1.0.12"
            from(components["java"])
        }
    }
}

group = "org.brandjunhoe"
version = "1.0.12"


repositories {
    mavenCentral()
}


dependencies {
    implementation("org.springframework.boot:spring-boot-starter")
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.jetbrains.kotlin:kotlin-stdlib")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.apache.commons:commons-lang3:3.12.0")
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
