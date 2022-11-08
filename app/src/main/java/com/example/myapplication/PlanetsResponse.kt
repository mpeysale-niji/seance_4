package com.example.myapplication

import com.google.gson.annotations.SerializedName

class PlanetsResponse {

    var count: Int? = null
    var previous: String? = null
    var next: String? = null

    @SerializedName("results")
    var planets: List<Planet>? = null
}

class Planet {

    var name: String? = null
    var population: String? = null
    var climate: String? = null

}