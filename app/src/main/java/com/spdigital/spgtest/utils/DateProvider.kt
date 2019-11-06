package com.spdigital.spgtest.utils

import java.text.SimpleDateFormat
import java.util.*

const val DATE_FORMAT_TIME = "YYYY-MM-dd'T'HH:mm:ss"
const val DATE_FORMAT_SIMPLE = "YYYY-MM-dd"

object DateProvider {

    fun getCurrentDateTime(): Date {
        return Calendar.getInstance().time
    }

    fun formattedDate(dateFormat: String, date: Date): String {
        val simpleFormatter = SimpleDateFormat(dateFormat, Locale.getDefault())
        return simpleFormatter.format(date)
    }
}