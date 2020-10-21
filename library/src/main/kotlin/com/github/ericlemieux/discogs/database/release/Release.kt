package com.github.ericlemieux.discogs.database.release

import com.github.ericlemieux.discogs.database.artist.ArtistSummary
import com.github.ericlemieux.discogs.database.community.ReleaseCommunityContributions
import com.github.ericlemieux.discogs.database.label.LabelSummary
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
    val artists: List<ArtistSummary> = listOf(),
    val dataQuality: String?,
    val thumb: String?,
    val community: ReleaseCommunityContributions?,
    val companies: List<LabelSummary> = listOf(),
    val country: String?,
    val dateAdded: Date?,
    val dateChanged: Date?,
    val estimatedWeight: Int?,
    @SerializedName("extraartists")
    val extraArtists: List<ArtistSummary> = listOf(),
    val formatQuality: Int?,
    // TODO: formats
    val genres: List<String> = listOf(),
    // TODO: identifiers
    val images: List<Image> = listOf(),
    val labels: List<LabelSummary> = listOf(),
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
    val style: List<String> = listOf(),
    // TODO: tracklist
    val uri: String?,
    val videos: List<Video> = listOf(),
    val year: Int?)
