import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	id("org.springframework.boot") version "3.0.5"
	id("io.spring.dependency-management") version "1.1.0"
	kotlin("jvm") version "1.7.22"
	kotlin("plugin.spring") version "1.7.22"
}

group = "com.example"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_17

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter:3.0.5")
	implementation("org.springframework.boot:spring-boot-starter-data-jpa:3.0.5")
	implementation("org.jetbrains.kotlin:kotlin-reflect:1.8.0")
	implementation("org.springframework.boot:spring-boot-starter-web:3.0.4")
	implementation("org.eclipse.persistence:javax.persistence:2.2.1")
	implementation("org.springframework.boot:spring-boot-starter-webflux:3.0.6")
	runtimeOnly("org.postgresql:postgresql:42.5.0")

	testImplementation("org.springframework.boot:spring-boot-starter-test:3.0.5")
	implementation("net.java.dev.jna:jna:5.12.1")

	testImplementation("net.java.dev.jna:jna-platform:5.12.1")



	testImplementation("org.junit.jupiter:junit-jupiter:5.8.1")
	testImplementation("org.testcontainers:testcontainers:1.17.6")
	testImplementation("org.testcontainers:junit-jupiter:1.18.0")
	testImplementation("org.testcontainers:postgresql:1.18.0")

	testImplementation("com.tngtech.archunit:archunit:1.0.1")
	testImplementation("com.tngtech.archunit:archunit-junit5-api:1.0.0")
	testImplementation("com.tngtech.archunit:archunit-junit5-engine:1.0.0")


}

tasks.withType<KotlinCompile> {
	kotlinOptions {
		freeCompilerArgs = listOf("-Xjsr305=strict")
		jvmTarget = "17"
	}
}

tasks.withType<Test> {
	useJUnitPlatform()
}
