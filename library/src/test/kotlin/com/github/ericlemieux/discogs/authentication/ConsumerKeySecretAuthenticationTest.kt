package com.github.ericlemieux.discogs.authentication

import kotlin.test.Test
import kotlin.test.assertEquals

internal class ConsumerKeySecretAuthenticationTest {

  @Test(expected = IllegalArgumentException::class)
  fun exceptionWhenMissingKey() {
    ConsumerKeySecretAuthentication("", "some-secret")
  }

  @Test(expected = IllegalArgumentException::class)
  fun exceptionWhenMissingSecret() {
    ConsumerKeySecretAuthentication("some-key", "")
  }

  @Test
  fun getAuthHeader() {
    // Setup
    val auth = ConsumerKeySecretAuthentication("my-key", "my-secret")

    // Act
    val actual = auth.getAuthHeader()

    // Verify
    assertEquals("Discogs key=my-key, secret=my-secret", actual)
  }
}
