package com.github.ericlemieux.discogs.serialization.json

import com.google.gson.FieldNamingPolicy
import com.google.gson.GsonBuilder

class Json {
  private val gson =
      GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES).create()

  fun <T> fromString(data: String?, c: Class<T>): T {
    return gson.fromJson(data, c)
  }

  fun <T> toString(data: T): String {
    return gson.toJson(data)
  }
}
