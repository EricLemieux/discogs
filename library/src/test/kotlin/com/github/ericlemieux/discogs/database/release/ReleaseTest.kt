package com.github.ericlemieux.discogs.database.release

import com.google.gson.FieldNamingPolicy
import com.google.gson.GsonBuilder
import kotlin.test.assertEquals
import org.junit.Test

internal class ReleaseTest {
  // TODO: Figure out where to put this so that it's somewhat global
  val gson =
      GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES).create()

  @Test
  fun foo() {
    // Setup
    val json = javaClass.getResource("/payloads/release-200.json").readText()

    // Act
    val release = gson.fromJson(json, Release::class.java)

    // Verify
    assertEquals("Never Gonna Give You Up", release.title)
    assertEquals(249504, release.id)
    assertEquals(1, release.artists?.size)
    assertEquals("Rick Astley", release.artists?.get(0)?.name)
    assertEquals(2, release.extraArtists?.size)
  }
}
