package com.github.ericlemieux.discogs.database.release

import com.github.ericlemieux.discogs.database.artist.ArtistSummary
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
    val country: String?,
    val dateAdded: Date?,
    val dateChanged: Date?,
    val estimatedWeight: Int?,
    @SerializedName("extraartists")
    val extraArtists: List<ArtistSummary>?,
    val formatQuality: Int?,
    val lowestPrice: Float?,
    val masterId: Int?,
    val masterUrl: String?,
    val notes: String?,
    val numberForSale: Int?,
    val released: String?,
    val releasedFormatted: String?,
    val resourceUrl: String?,
    val status: String?,
    val uri: String?,
    val year: Int?
// TODO: Arrays of other entities
)
