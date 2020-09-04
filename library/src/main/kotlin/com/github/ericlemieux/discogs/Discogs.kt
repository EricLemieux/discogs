package com.github.ericlemieux.discogs

import com.github.ericlemieux.discogs.http.Http
import com.github.ericlemieux.discogs.release.ReleaseRepository

/** Main entrypoint for the Discogs library */
class Discogs(http: Http) {
  val releaseRepository: ReleaseRepository = ReleaseRepository(http)
}
