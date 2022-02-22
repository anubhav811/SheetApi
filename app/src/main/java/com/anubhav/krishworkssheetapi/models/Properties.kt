package com.anubhav.krishworkssheetapi.models

data class Properties(
    val autoRecalc: String,
    val defaultFormat: DefaultFormat,
    val locale: String,
    val spreadsheetTheme: SpreadsheetTheme,
    val timeZone: String,
    val title: String
)