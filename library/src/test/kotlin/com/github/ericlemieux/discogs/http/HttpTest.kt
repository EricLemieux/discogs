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
    mockWebServer.enqueue(MockResponse().setBody("{\"value\":\"hello world\"}"))
    val http = Http(EmptyAuthentication(), "", baseUrl.toUrl())

    // Act
    val res = http.get("/test", TestModel::class.java)

    // Verify
    assertEquals("hello world", res.value)
  }

  @Test
  fun properlyParsesSnakeCaseJson() {
    // Setup
    val mockWebServer = MockWebServer()
    mockWebServer.start()
    val baseUrl = mockWebServer.url("/test")
    mockWebServer.enqueue(MockResponse().setBody("{\"first_name\":\"hello\"}"))
    val http = Http(EmptyAuthentication(), "", baseUrl.toUrl())

    // Act
    val res = http.get("/test", TestModel::class.java)

    // Verify
    assertEquals("hello", res.firstName)
  }

  class TestModel(var value: String, var firstName: String)
}
