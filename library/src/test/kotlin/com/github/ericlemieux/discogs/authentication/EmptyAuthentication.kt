package com.github.ericlemieux.discogs.authentication

class EmptyAuthentication : Authentication {
  override fun getAuthHeader(): String {
    return "Unit test auth header"
  }
}
