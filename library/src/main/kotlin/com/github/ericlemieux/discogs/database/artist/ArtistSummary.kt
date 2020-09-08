package com.github.ericlemieux.discogs.database.artist

/**
 * Summary about an artist, found within releases. Can retrieve more information about an artist using the id.
 */
data class ArtistSummary(
  val anv: String?,
  val id: Int?,
  val join: String?,
  val name: String?,
  val resourceUrl: String?,
  val role: String?,
  val tracks: String?
)
