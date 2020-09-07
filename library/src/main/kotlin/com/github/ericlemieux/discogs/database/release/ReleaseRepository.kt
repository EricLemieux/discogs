package com.github.ericlemieux.discogs.database.release

import com.github.ericlemieux.discogs.http.Http
import com.github.ericlemieux.discogs.marketplace.Currency

class ReleaseRepository(private val http: Http) {

  /**
   * Get a release using the id.
   *
   * @param id of the release.
   * @param currency to display marketplace pricing data.
   *
   * @see <a
   * href="https://www.discogs.com/developers/#page:database,header:database-release-get">Get a
   * release</a>
   */
  fun getRelease(id: Int, currency: Currency? = null): Release? {
    var url = "/releases/$id"

    if (currency != null) {
      url += "?curr_abbr=${currency}"
    }

    val res = http.get(url, Release::class.java)

    if (res.value == null || res.error != null) {
      return null
    }

    return res.value
  }
}
