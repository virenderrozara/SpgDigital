package com.spdigital.spgtest.network.response

data class Item(
    val readings: ReadingsX,
    val timestamp: String,
    val update_timestamp: String
)