package com.github.ericlemieux.discogs

import com.github.ericlemieux.discogs.http.Http
import com.github.ericlemieux.discogs.http.URL_BASE
import com.github.ericlemieux.discogs.models.Release

class Discogs(private val http: Http) {
  fun someLibraryMethod(): Boolean {
    return true
  }

  fun getRelease(id: Int): Release {
    val res = http.get("$URL_BASE/releases/$id", Release::class.java)
    println(res)
    return res
  }
}
