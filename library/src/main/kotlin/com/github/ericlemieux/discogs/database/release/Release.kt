package com.github.ericlemieux.discogs.database.release

import com.github.ericlemieux.discogs.database.artist.ArtistSummary
import com.github.ericlemieux.discogs.database.media.image.Image
import com.github.ericlemieux.discogs.database.media.video.Video
import com.google.gson.annotations.SerializedName
import java.util.*

/**
 * The Release resource represents a particular physical or digital object released by one or more
 * Artists.
 *
 * @see <a href="https://www.discogs.com/developers/#page:database,header:database-release">Discogs
 * API docs Release</a>
 */
data class Release(
    val title: String?,
    val id: Int?,
    val artists: List<ArtistSummary>?,
    val dataQuality: String?,
    val thumb: String?,
    // TODO: community
    // TODO: companies
    val country: String?,
    val dateAdded: Date?,
    val dateChanged: Date?,
    val estimatedWeight: Int?,
    @SerializedName("extraartists")
    val extraArtists: List<ArtistSummary>?,
    val formatQuality: Int?,
    // TODO: formats
    // TODO: genres
    // TODO: identifiers
    val images: List<Image>?,
    // TODO: labels
    val lowestPrice: Float?,
    val masterId: Int?,
    val masterUrl: String?,
    val notes: String?,
    val numberForSale: Int?,
    val released: String?,
    val releasedFormatted: String?,
    val resourceUrl: String?,
    // TODO: series
    val status: String?,
    // TODO: styles
    // TODO: tracklist
    val uri: String?,
    val videos: List<Video>?,
    val year: Int?)
