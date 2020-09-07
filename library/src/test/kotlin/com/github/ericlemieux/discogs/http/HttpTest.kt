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
    assertEquals("hello world", res.value?.value)
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
    assertEquals("hello", res.value?.firstName)
  }

  @Test
  fun returnsAnErrorWhenNetworkRequestFails() {
    // Setup
    val mockWebServer = MockWebServer()
    mockWebServer.start()
    val baseUrl = mockWebServer.url("/test")
    mockWebServer.enqueue(
        MockResponse().setResponseCode(404).setBody("{\"message\":\"Release not found.\"}"))
    val http = Http(EmptyAuthentication(), "", baseUrl.toUrl())

    // Act
    val res = http.get("/test", TestModel::class.java)

    // Verify
    assertEquals("Release not found.", res.error?.message)
  }

  class TestModel(var value: String, var firstName: String)
}
