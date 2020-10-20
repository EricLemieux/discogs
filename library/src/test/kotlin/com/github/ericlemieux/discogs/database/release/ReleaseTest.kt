package com.github.ericlemieux.discogs.database.release

import com.github.ericlemieux.discogs.serialization.json.Json
import kotlin.test.assertEquals
import org.junit.Test

internal class ReleaseTest {

  private val json = Json()

  @Test
  fun foo() {
    // Setup
    val payload = javaClass.getResource("/payloads/release-200.json").readText()

    // Act
    val release = json.fromString(payload, Release::class.java)

    // Verify
    assertEquals("Never Gonna Give You Up", release.title)
    assertEquals(249504, release.id)
    assertEquals(1, release.artists?.size)
    assertEquals("Rick Astley", release.artists?.get(0)?.name)
    assertEquals(2, release.extraArtists?.size)
  }
}
