package com.anubhav.krishworkssheetapi.api

import com.anubhav.krishworkssheetapi.utils.Constants
import retrofit2.Call
import retrofit2.http.Body

import retrofit2.http.HeaderMap

import retrofit2.http.POST


interface NewSheetInterface {
    @POST("v4/spreadsheets/1fGoTmZVvHee-pcoIMGnlQBceURVOIHzKbqAmLpg0baQ:batchUpdate?key="+Constants.ApiKey)
    open fun newSheet(
        @HeaderMap header: Map<String?, String?>?,
        @Body newSheetRequest: NewSheetRequest?
    ): Call<NewSheetResponse?>?

}