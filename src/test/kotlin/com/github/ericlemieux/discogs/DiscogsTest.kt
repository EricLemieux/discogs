package com.github.ericlemieux.discogs

import com.github.ericlemieux.discogs.auth.AuthClientKeySecret
import com.github.ericlemieux.discogs.http.Http
import kotlin.test.*

class DiscogsTest {
  @Test
  fun testSomeLibraryMethod() {
    // Setup
    val auth = AuthClientKeySecret("", "")
    val discogs = Discogs(Http(auth, ""))

    // Verify
    assertTrue(discogs.someLibraryMethod(), "someLibraryMethod should return 'true'")
  }
}
