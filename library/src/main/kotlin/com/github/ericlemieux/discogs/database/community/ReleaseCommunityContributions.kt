package com.github.ericlemieux.discogs.database.community

import com.github.ericlemieux.discogs.database.release.Rating
import com.github.ericlemieux.discogs.user.UserIdentity

data class ReleaseCommunityContributions(
    val contributors: List<UserIdentity>?,
    val dataQuality: String?,
    val have: Int?,
    val rating: Rating?,
    val status: String?,
    val submitter: UserIdentity?,
    val want: Int?)
