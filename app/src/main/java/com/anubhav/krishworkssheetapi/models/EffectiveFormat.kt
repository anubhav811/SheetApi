package com.anubhav.krishworkssheetapi.models

data class EffectiveFormat(
    val backgroundColor: BackgroundColorX,
    val backgroundColorStyle: BackgroundColorStyleX,
    val horizontalAlignment: String,
    val hyperlinkDisplayType: String,
    val padding: PaddingX,
    val textFormat: TextFormatX,
    val verticalAlignment: String,
    val wrapStrategy: String
)