package com.spdigital.spgtest.network.response

data class ReadingsX(
    val co_eight_hour_max: CoEightHourMax,
    val co_sub_index: CoSubIndex,
    val no2_one_hour_max: No2OneHourMax,
    val o3_eight_hour_max: O3EightHourMax,
    val o3_sub_index: O3SubIndex,
    val pm10_sub_index: Pm10SubIndex,
    val pm10_twenty_four_hourly: Pm10TwentyFourHourly,
    val pm25_sub_index: Pm25SubIndex,
    val pm25_twenty_four_hourly: Pm25TwentyFourHourly,
    val psi_twenty_four_hourly: PsiTwentyFourHourly,
    val so2_sub_index: So2SubIndex,
    val so2_twenty_four_hourly: So2TwentyFourHourly
)