package com.example.apiapp

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class CustomResponseModel {
    @SerializedName("id")
    @Expose
    var id : String? = null

    @SerializedName("user")
    @Expose
    var user : String? = null
}