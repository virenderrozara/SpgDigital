package com.spdigital.spgtest.utils

import com.spdigital.spgtest.network.BaseResponse
import com.spdigital.spgtest.network.response.*

object FormatedPsiData {
    private val co_eight_hour_max: String = "co_eight_hour_max"
    private val co_sub_index: String = "co_sub_index"
    private val no2_one_hour_max: String = "no2_one_hour_max"
    private val o3_eight_hour_max: String = "o3_eight_hour_max"
    private val o3_sub_index: String = "o3_sub_index"
    private val pm10_sub_index: String = "pm10_sub_index"
    private val pm10_twenty_four_hourly: String = "pm10_twenty_four_hourly"
    private val pm25_sub_index: String = "pm25_sub_index"
    private val pm25_twenty_four_hourly: String = "pm25_twenty_four_hourly"
    private val psi_twenty_four_hourly: String = "psi_twenty_four_hourly"
    private val so2_sub_index: String = "so2_sub_index"
    private val so2_twenty_four_hourly: String = "so2_twenty_four_hourly"

    fun getFormatedData(item: Item, name: String): String {

        item.let {

            return  when (name) {

                "east" -> {
                    "$co_eight_hour_max =${it.readings.co_eight_hour_max.east}" + "\n"
                    "$co_sub_index =${it.readings.co_sub_index.east}" + "\n" +
                            "$no2_one_hour_max =${it.readings.no2_one_hour_max.east}" + "\n" +
                            "$o3_eight_hour_max =${it.readings.o3_eight_hour_max.east}" + "\n" +
                            "$o3_sub_index =${it.readings.o3_sub_index.east}" + "\n" +
                            "$pm10_sub_index =${it.readings.pm10_sub_index.east}" + "\n" +
                            "$pm10_twenty_four_hourly =${it.readings.pm10_twenty_four_hourly.east}" + "\n" +
                            "$pm25_sub_index =${it.readings.pm25_sub_index.east}" + "\n" +
                            "$pm25_twenty_four_hourly =${it.readings.pm25_twenty_four_hourly.east}" + "\n" +
                            "$psi_twenty_four_hourly =${it.readings.psi_twenty_four_hourly.east}" + "\n" +
                            "$so2_sub_index =${it.readings.so2_sub_index.east}" + "\n" +
                            "$so2_twenty_four_hourly =${it.readings.so2_twenty_four_hourly.east}"
                }
                "west" -> {
                    "$co_eight_hour_max =${it.readings.co_eight_hour_max.west}" + "\n"
                    "$co_sub_index =${it.readings.co_sub_index.west}" + "\n" +
                            "$no2_one_hour_max =${it.readings.no2_one_hour_max.west}" + "\n" +
                            "$o3_eight_hour_max =${it.readings.o3_eight_hour_max.west}" + "\n" +
                            "$o3_sub_index =${it.readings.o3_sub_index.west}" + "\n" +
                            "$pm10_sub_index =${it.readings.pm10_sub_index.west}" + "\n" +
                            "$pm10_twenty_four_hourly =${it.readings.pm10_twenty_four_hourly.west}" + "\n" +
                            "$pm25_sub_index =${it.readings.pm25_sub_index.west}" + "\n" +
                            "$pm25_twenty_four_hourly =${it.readings.pm25_twenty_four_hourly.west}" + "\n" +
                            "$psi_twenty_four_hourly =${it.readings.psi_twenty_four_hourly.west}" + "\n" +
                            "$so2_sub_index =${it.readings.so2_sub_index.west}" + "\n" +
                            "$so2_twenty_four_hourly =${it.readings.so2_twenty_four_hourly.west}"
                }
                "central" -> {
                    "$co_eight_hour_max =${it.readings.co_eight_hour_max.central}" + "\n"
                    "$co_sub_index =${it.readings.co_sub_index.central}" + "\n" +
                            "$no2_one_hour_max =${it.readings.no2_one_hour_max.central}" + "\n" +
                            "$o3_eight_hour_max =${it.readings.o3_eight_hour_max.central}" + "\n" +
                            "$o3_sub_index =${it.readings.o3_sub_index.central}" + "\n" +
                            "$pm10_sub_index =${it.readings.pm10_sub_index.central}" + "\n" +
                            "$pm10_twenty_four_hourly =${it.readings.pm10_twenty_four_hourly.central}" + "\n" +
                            "$pm25_sub_index =${it.readings.pm25_sub_index.central}" + "\n" +
                            "$pm25_twenty_four_hourly =${it.readings.pm25_twenty_four_hourly.central}" + "\n" +
                            "$psi_twenty_four_hourly =${it.readings.psi_twenty_four_hourly.central}" + "\n" +
                            "$so2_sub_index =${it.readings.so2_sub_index.central}" + "\n" +
                            "$so2_twenty_four_hourly =${it.readings.so2_twenty_four_hourly.central}"
                }
                "national" -> {
                    "$co_eight_hour_max =${it.readings.co_eight_hour_max.national}" + "\n"
                    "$co_sub_index =${it.readings.co_sub_index.national}" + "\n" +
                            "$no2_one_hour_max =${it.readings.no2_one_hour_max.national}" + "\n" +
                            "$o3_eight_hour_max =${it.readings.o3_eight_hour_max.national}" + "\n" +
                            "$o3_sub_index =${it.readings.o3_sub_index.national}" + "\n" +
                            "$pm10_sub_index =${it.readings.pm10_sub_index.national}" + "\n" +
                            "$pm10_twenty_four_hourly =${it.readings.pm10_twenty_four_hourly.national}" + "\n" +
                            "$pm25_sub_index =${it.readings.pm25_sub_index.national}" + "\n" +
                            "$pm25_twenty_four_hourly =${it.readings.pm25_twenty_four_hourly.national}" + "\n" +
                            "$psi_twenty_four_hourly =${it.readings.psi_twenty_four_hourly.national}" + "\n" +
                            "$so2_sub_index =${it.readings.so2_sub_index.national}" + "\n" +
                            "$so2_twenty_four_hourly =${it.readings.so2_twenty_four_hourly.national}"
                }
                "north" -> {
                    "$co_eight_hour_max =${it.readings.co_eight_hour_max.north}" + "\n"
                    "$co_sub_index =${it.readings.co_sub_index.north}" + "\n" +
                            "$no2_one_hour_max =${it.readings.no2_one_hour_max.north}" + "\n" +
                            "$o3_eight_hour_max =${it.readings.o3_eight_hour_max.north}" + "\n" +
                            "$o3_sub_index =${it.readings.o3_sub_index.north}" + "\n" +
                            "$pm10_sub_index =${it.readings.pm10_sub_index.north}" + "\n" +
                            "$pm10_twenty_four_hourly =${it.readings.pm10_twenty_four_hourly.north}" + "\n" +
                            "$pm25_sub_index =${it.readings.pm25_sub_index.north}" + "\n" +
                            "$pm25_twenty_four_hourly =${it.readings.pm25_twenty_four_hourly.north}" + "\n" +
                            "$psi_twenty_four_hourly =${it.readings.psi_twenty_four_hourly.north}" + "\n" +
                            "$so2_sub_index =${it.readings.so2_sub_index.north}" + "\n" +
                            "$so2_twenty_four_hourly =${it.readings.so2_twenty_four_hourly.north}"
                }
                "south" -> {
                    "$co_eight_hour_max =${it.readings.co_eight_hour_max.south}" + "\n"
                    "$co_sub_index =${it.readings.co_sub_index.south}" + "\n" +
                            "$no2_one_hour_max =${it.readings.no2_one_hour_max.south}" + "\n" +
                            "$o3_eight_hour_max =${it.readings.o3_eight_hour_max.south}" + "\n" +
                            "$o3_sub_index =${it.readings.o3_sub_index.south}" + "\n" +
                            "$pm10_sub_index =${it.readings.pm10_sub_index.south}" + "\n" +
                            "$pm10_twenty_four_hourly =${it.readings.pm10_twenty_four_hourly.south}" + "\n" +
                            "$pm25_sub_index =${it.readings.pm25_sub_index.south}" + "\n" +
                            "$pm25_twenty_four_hourly =${it.readings.pm25_twenty_four_hourly.south}" + "\n" +
                            "$psi_twenty_four_hourly =${it.readings.psi_twenty_four_hourly.south}" + "\n" +
                            "$so2_sub_index =${it.readings.so2_sub_index.south}" + "\n" +
                            "$so2_twenty_four_hourly =${it.readings.so2_twenty_four_hourly.south}"
                }
                else -> {
                    "Data not found!"
                }

            }


        }
        return "Data not found!"
    }

}