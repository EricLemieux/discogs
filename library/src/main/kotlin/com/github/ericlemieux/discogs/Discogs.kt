package com.github.ericlemieux.discogs

import com.github.ericlemieux.discogs.http.Http
import com.github.ericlemieux.discogs.http.URL_BASE
import com.github.ericlemieux.discogs.models.Release

/** Main entrypoint for the Discogs library */
class Discogs(private val http: Http) {
  fun someLibraryMethod(): Boolean {
    return true
  }

  fun getRelease(id: Int): Release {
    val res = http.get("/releases/$id", Release::class.java)
    println(res)
    return res
  }
}
