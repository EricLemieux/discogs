plugins {
  id("com.diffplug.gradle.spotless") version "4.0.1"
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
    plugin("com.diffplug.gradle.spotless")
    plugin("java")
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
