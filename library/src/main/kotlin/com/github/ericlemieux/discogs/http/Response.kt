package com.github.ericlemieux.discogs.http

data class Response<T>(val value: T?, val error: Error?)
