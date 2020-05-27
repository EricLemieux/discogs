package com.github.ericlemieux.discogs.auth

class AuthClientKeySecret(private val key: String, private val secret: String): Auth {
    override fun getAuthHeader(): String {
        return "Discogs key=$key, secret=$secret"
    }
}
