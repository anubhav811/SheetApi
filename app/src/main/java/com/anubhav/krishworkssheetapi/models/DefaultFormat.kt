package com.anubhav.krishworkssheetapi.models

data class DefaultFormat(
    val backgroundColor: BackgroundColor,
    val backgroundColorStyle: BackgroundColorStyle,
    val padding: Padding,
    val textFormat: TextFormat,
    val verticalAlignment: String,
    val wrapStrategy: String
)