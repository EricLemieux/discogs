package com.github.ericlemieux.discogs.auth

class AuthEmpty : Auth {
  override fun getAuthHeader(): String {
    return "Unit test auth header"
  }
}
