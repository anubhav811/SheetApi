package com.anubhav.krishworkssheetapi.api

import com.anubhav.krishworkssheetapi.models.SpreadsheetResponse
import com.anubhav.krishworkssheetapi.utils.Constants
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.POST

interface SheetsApi  {
    @GET("v4/spreadsheets/1fGoTmZVvHee-pcoIMGnlQBceURVOIHzKbqAmLpg0baQ?includeGridData=true&&key="+ Constants.ApiKey)
    suspend fun getSheet(): Response<SpreadsheetResponse>

//    @POST("v4/spreadsheets/1fGoTmZVvHee-pcoIMGnlQBceURVOIHzKbqAmLpg0baQ:batchUpdate?key="+Constants.ApiKey)

}