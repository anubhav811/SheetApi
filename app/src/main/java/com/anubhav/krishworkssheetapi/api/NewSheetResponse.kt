package com.anubhav.krishworkssheetapi.api

import com.google.gson.annotations.SerializedName


class NewSheetResponse {
    @SerializedName("spreadsheetId")
    var spreadsheetId: String? = null
}