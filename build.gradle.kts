plugins {
    id("java")
    id("org.springframework.boot") version "3.2.1"
}
apply(plugin = "io.spring.dependency-management")



group = "br.com.gamerandonizator"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
    compileOnly ("org.projectlombok:lombok:1.18.30")
    annotationProcessor ("org.projectlombok:lombok:1.18.30")
    testCompileOnly ("org.projectlombok:lombok:1.18.30")
    testAnnotationProcessor ("org.projectlombok:lombok:1.18.30")

}

tasks.test {
    useJUnitPlatform()
}