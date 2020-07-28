package com.github.ericlemieux.discogs.auth

interface Auth {
  fun getAuthHeader(): String
}
