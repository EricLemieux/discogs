plugins {
  id("com.diffplug.spotless") version "5.3.0"
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
