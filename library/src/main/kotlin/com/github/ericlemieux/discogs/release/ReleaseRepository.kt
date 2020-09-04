package com.github.ericlemieux.discogs.release

import com.github.ericlemieux.discogs.http.Http

class ReleaseRepository(private val http: Http) {
  fun getRelease(id: Int): Release {
    val res = http.get("/releases/$id", Release::class.java)
    println(res)
    return res
  }
}
