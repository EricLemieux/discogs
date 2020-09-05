package com.github.ericlemieux.discogs.release

import com.github.ericlemieux.discogs.marketplace.Currency
import com.github.ericlemieux.discogs.http.Http

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
  fun getRelease(id: Int, currency: Currency? = null): Release {
    var url = "/releases/$id"

    if (currency != null) {
      url += "?curr_abbr=${currency}"
    }

    return http.get(url, Release::class.java)
  }
}
