package com.github.ericlemieux.discogs.database.media.video

/**
 * An external video, such as a music video for a song.
 *
 * @see <a href="https://www.discogs.com/developers/#page:database,header:database-videos">Discogs
 * API docs</a>
 */
data class Video(
    val description: String?,
    val duration: Int?,
    val embed: Boolean?,
    val title: String?,
    val uri: String?)
