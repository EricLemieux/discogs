package com.github.ericlemieux.discogs

import com.github.ericlemieux.discogs.database.release.ReleaseRepository
import com.github.ericlemieux.discogs.http.Http

/** Main entrypoint for the Discogs library */
class Discogs(http: Http) {
  val releaseRepository: ReleaseRepository = ReleaseRepository(http)
}
