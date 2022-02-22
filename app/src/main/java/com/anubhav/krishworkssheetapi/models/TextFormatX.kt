package com.anubhav.krishworkssheetapi.models

data class TextFormatX(
    val bold: Boolean,
    val fontFamily: String,
    val fontSize: Int,
    val foregroundColor: ForegroundColorX,
    val foregroundColorStyle: ForegroundColorStyleX,
    val italic: Boolean,
    val strikethrough: Boolean,
    val underline: Boolean
)