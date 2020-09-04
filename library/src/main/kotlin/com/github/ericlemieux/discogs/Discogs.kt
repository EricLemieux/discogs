package com.github.ericlemieux.discogs

import com.github.ericlemieux.discogs.http.Http
import com.github.ericlemieux.discogs.release.Release
import com.github.ericlemieux.discogs.release.ReleaseRepository

/** Main entrypoint for the Discogs library */
class Discogs(private val http: Http) {
  val releaseRepository: ReleaseRepository = ReleaseRepository(http)

  fun someLibraryMethod(): Boolean {
    return true
  }
}
