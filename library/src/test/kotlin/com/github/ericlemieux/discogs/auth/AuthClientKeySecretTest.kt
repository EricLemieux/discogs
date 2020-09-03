package com.github.ericlemieux.discogs.auth

import kotlin.test.Test
import kotlin.test.assertEquals

internal class AuthClientKeySecretTest {

  @Test(expected = IllegalArgumentException::class)
  fun exceptionWhenMissingKey() {
    AuthClientKeySecret("", "some-secret")
  }

  @Test(expected = IllegalArgumentException::class)
  fun exceptionWhenMissingSecret() {
    AuthClientKeySecret("some-key", "")
  }

  @Test
  fun getAuthHeader() {
    // Setup
    val auth = AuthClientKeySecret("my-key", "my-secret")

    // Act
    val actual = auth.getAuthHeader()

    // Verify
    assertEquals("Discogs key=my-key, secret=my-secret", actual)
  }
}
