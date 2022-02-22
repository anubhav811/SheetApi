package com.anubhav.krishworkssheetapi.api

import com.google.gson.annotations.SerializedName


class NewSheetRequest(@field:SerializedName("requests") var requests: Requests) {

    class Requests(@field:SerializedName("addSheet") var addsheet: AddSheet) {

        class AddSheet(@field:SerializedName("properties") var properties: Properties) {

            class Properties(title: String) {
                @SerializedName("title")
                var title = "Results"
                @JvmName("setTitle1")
                fun setTitle(title: String) {
                    this.title = title
                }

                init {
                    this.title = title
                }
            }
        }
    }
}