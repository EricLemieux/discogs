package com.github.ericlemieux.discogs

import com.github.ericlemieux.discogs.authentication.EmptyAuthentication
import com.github.ericlemieux.discogs.http.Http
import kotlin.test.assertEquals
import okhttp3.mockwebserver.MockResponse
import okhttp3.mockwebserver.MockWebServer
import org.junit.Test

internal class DiscogsTest {
  @Test
  fun getRelease() {
    // Setup
    val mockWebServer = MockWebServer()
    mockWebServer.start()
    val baseUrl = mockWebServer.url("/release/123")
    mockWebServer.enqueue(
        MockResponse().setBody(javaClass.getResource("/payloads/release-200.json").readText()))
    val http = Http(EmptyAuthentication(), "", baseUrl.toUrl())
    val discogs = Discogs(http)

    // Act
    val release = discogs.releaseRepository.getRelease(123)

    // Verify
    assertEquals("Never Gonna Give You Up", release?.title)
  }
}
