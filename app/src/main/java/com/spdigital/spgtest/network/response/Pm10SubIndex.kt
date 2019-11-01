package com.spdigital.spgtest.network.response

data class Pm10SubIndex(
    val central: Int,
    val east: Int,
    val national: Int,
    val north: Int,
    val south: Int,
    val west: Int
)