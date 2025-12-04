package com.farhan.prak7_303

import java.io.Serializable
import java.sql.Date

data class Book(
    val title: String?,
    val releaseDate: String?,
    val cover: String?,
    val description: String?,
    val pages: Int?
) : Serializable
