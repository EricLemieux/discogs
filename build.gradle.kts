plugins {
  // Apply the Kotlin JVM plugin to add support for Kotlin.
  id("org.jetbrains.kotlin.jvm") version "1.3.71"
  id("com.diffplug.spotless") version "5.3.0"
  id("org.jetbrains.dokka") version "1.4.0"
}

buildscript {
  repositories {
    jcenter()
  }
}

allprojects {
  repositories {
    jcenter()
  }
}

subprojects {
  apply {
    plugin("com.diffplug.spotless")
    plugin("java")
    plugin("org.jetbrains.dokka")
  }

  spotless {
    java {
      googleJavaFormat()
      removeUnusedImports()
    }
    kotlin {
      ktfmt()
    }
  }
}
