package com.github.ericlemieux.discogs.http

import com.github.ericlemieux.discogs.authentication.EmptyAuthentication
import kotlin.test.assertEquals
import okhttp3.mockwebserver.MockResponse
import okhttp3.mockwebserver.MockWebServer
import org.junit.Test

internal class HttpTest {
  @Test
  fun transformsDataGivenValidData() {
    // Setup
    val mockWebServer = MockWebServer()
    mockWebServer.start()
    val baseUrl = mockWebServer.url("/test")
    mockWebServer.enqueue(MockResponse().setBody("{\"name\":\"hello world\"}"))
    val http = Http(EmptyAuthentication(), "", baseUrl.toUrl())

    // Act
    val res = http.get("/test", TestModel::class.java)

    // Verify
    assertEquals("hello world", res.name)
  }

  class TestModel(var name: String)
}
