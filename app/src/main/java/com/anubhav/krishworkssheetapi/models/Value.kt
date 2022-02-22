package com.anubhav.krishworkssheetapi.models

data class Value(
    val effectiveFormat: EffectiveFormat,
    val effectiveValue: EffectiveValue,
    val formattedValue: String,
    val userEnteredValue: UserEnteredValue
)