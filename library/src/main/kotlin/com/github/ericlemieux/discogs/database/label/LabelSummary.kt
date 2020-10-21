package com.github.ericlemieux.discogs.database.label

// TODO: This may need to be looked into some more, the full label type appears to have some
// different fields, but this could also be a generalized summary type.

data class LabelSummary(
    // Catalog number
    val catno: String?,
    val entityType: String?,
    val id: Int?,
    val name: String?,
    val resourceUrl: String?)
