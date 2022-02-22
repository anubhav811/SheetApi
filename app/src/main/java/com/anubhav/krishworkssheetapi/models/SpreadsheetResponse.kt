package com.anubhav.krishworkssheetapi.models

data class SpreadsheetResponse(
    val properties: Properties,
    val sheets: List<Sheet>,
    val spreadsheetId: String,
    val spreadsheetUrl: String
)