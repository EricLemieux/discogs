package com.github.ericlemieux.discogs.database.release

import java.util.*

/**
 * The Release resource represents a particular physical or digital object released by one or more
 * Artists.
 *
 * @see <a href="https://www.discogs.com/developers/#page:database,header:database-release">Discogs
 * API docs Release</a>
 */
data class Release(
    val id: Int?,
    val title: String?,
    val dataQuality: String?,
    val thumb: String?,
    val country: String?,
    val dateAdded: Date?,
    val dateChanged: Date?,
    val estimatedWeight: Int?, // Unsure if the type is correct
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
