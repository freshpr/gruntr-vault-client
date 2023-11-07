/*
 * Copyright (c) 2023. Gruntr/ACUZIO BV
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * version 2 as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * https://www.gnu.org/licenses/gpl-3.0.html
 *
 */

plugins {
    id("java")
}

repositories {
    mavenCentral()
}

val junitVersion: String by project
val jacksonDatabindVersion: String by project
val mockWebServerVersion: String by project

dependencies {
    implementation("com.fasterxml.jackson.core:jackson-databind:${jacksonDatabindVersion}")

    testImplementation(platform("org.junit:junit-bom:${junitVersion}"))
    testImplementation("org.junit.jupiter:junit-jupiter:${junitVersion}")
    // https://mvnrepository.com/artifact/com.squareup.okhttp3/mockwebserver
    testImplementation("com.squareup.okhttp3:mockwebserver:${mockWebServerVersion}")

}

tasks.test {
    useJUnitPlatform()
}