package com.github.ericlemieux.discogs.database.media.image

/**
 * User contributed image resource, an example being the picture of the release art.
 *
 * @see <a href="https://www.discogs.com/developers/#page:images">Discogs API docs</a>
 */
data class Image(
    val width: Int?,
    val height: Int?,
    val resourceUrl: String?,
    val type: String?,
    val uri: String?,
    val uri150: String?)
