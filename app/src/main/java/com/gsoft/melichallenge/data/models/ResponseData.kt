package com.gsoft.melichallenge.data.models

data class ResponseData(
    val site_id: String,
    val country_default_time_zone: String,
    val query: String,
    val results: List<Product>
)