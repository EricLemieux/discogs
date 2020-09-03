package com.github.ericlemieux.discogs.http

import com.github.ericlemieux.discogs.auth.Auth
import com.github.kittinunf.fuel.Fuel
import com.google.gson.Gson

const val URL_BASE = "https://api.discogs.com/"

private const val HEADER_USER_AGENT = "User-Agent"

private const val HEADER_AUTHORIZATION = "Authorization"

class Http(private val auth: Auth, private val userAgent: String) {
  fun <T> get(route: String, c: Class<T>): T {
    val res =
        Fuel.get("${URL_BASE}${route}")
            .set(HEADER_USER_AGENT, userAgent)
            .set(HEADER_AUTHORIZATION, auth.getAuthHeader())
            .responseString()
            .third
            .get()

    return Gson().fromJson(res, c)
  }
}
