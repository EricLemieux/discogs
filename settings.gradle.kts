rootProject.name = "discogs"

include("library")

// Include sample projects
file("samples").listFiles()
  ?.filter { it.isDirectory}
  ?.forEach {
    include(it.name)
    project(":${it.name}").projectDir = it
  }

pluginManagement {
  repositories {
    gradlePluginPortal()
    jcenter()
  }
}
