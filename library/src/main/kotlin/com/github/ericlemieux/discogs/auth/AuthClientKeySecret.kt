package com.github.ericlemieux.discogs.auth

class AuthClientKeySecret(private val key: String, private val secret: String) : Auth {
  init {
    if (key.isBlank()) {
      throw AuthException("Authentication key is required");
    }

    if (secret.isBlank()) {
      throw AuthException("Authentication secret is required")
    }
  }

  override fun getAuthHeader(): String {
    return "Discogs key=$key, secret=$secret"
  }
}
