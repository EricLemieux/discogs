package com.github.ericlemieux.discogs.http

import com.github.ericlemieux.discogs.authentication.Authentication
import com.google.gson.Gson
import java.net.URL
import okhttp3.OkHttpClient
import okhttp3.Request

const val URL_BASE = "https://api.discogs.com/"

private const val HEADER_USER_AGENT = "User-Agent"

private const val HEADER_AUTHORIZATION = "Authorization"

class Http(
    private val authentication: Authentication,
    private val userAgent: String,
    private val domain: URL = URL(URL_BASE)
) {
  fun <T> get(route: String, c: Class<T>): T {
    val client = OkHttpClient()

    val request =
        Request.Builder()
            .url("${domain}${route}")
            .addHeader(HEADER_USER_AGENT, userAgent)
            .addHeader(HEADER_AUTHORIZATION, authentication.getAuthHeader())
            .build()

    val res = client.newCall(request).execute()

    val resJson = res.body?.string()

    return Gson().fromJson(resJson, c)
  }
}
