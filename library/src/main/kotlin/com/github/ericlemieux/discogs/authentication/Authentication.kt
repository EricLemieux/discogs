package com.github.ericlemieux.discogs.authentication

/**
 * Authentication interface to capture the different ways of authenticating with the Discogs API.
 *
 * @see <a href="https://www.discogs.com/developers/#page:authentication">Discogs API
 * Authentication</a>
 */
interface Authentication {
  fun getAuthHeader(): String
}
