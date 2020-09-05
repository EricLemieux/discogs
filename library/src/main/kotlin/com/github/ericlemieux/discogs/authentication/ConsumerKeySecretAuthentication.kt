package com.github.ericlemieux.discogs.authentication

/**
 * Authenticating as an application with just a key and secret retrieved from the application
 * configuration. You will not be authenticated as a specific user, and thus cannot retrieve users
 * private information.
 *
 * @see <a
 * href="https://www.discogs.com/developers/#page:authentication,header:authentication-discogs-auth-flow">Discogs
 * API auth flow</a>
 */
class ConsumerKeySecretAuthentication(private val key: String, private val secret: String) :
    Authentication {
  init {
    if (key.isBlank()) {
      throw IllegalArgumentException("Authentication key is required")
    }

    if (secret.isBlank()) {
      throw IllegalArgumentException("Authentication secret is required")
    }
  }

  override fun getAuthHeader(): String {
    return "Discogs key=$key, secret=$secret"
  }
}
