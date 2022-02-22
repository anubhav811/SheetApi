package com.anubhav.krishworkssheetapi.models

data class TextFormat(
    val bold: Boolean,
    val fontFamily: String,
    val fontSize: Int,
    val foregroundColor: ForegroundColor,
    val foregroundColorStyle: ForegroundColorStyle,
    val italic: Boolean,
    val strikethrough: Boolean,
    val underline: Boolean
)