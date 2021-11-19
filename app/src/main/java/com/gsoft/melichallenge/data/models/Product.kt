package com.gsoft.melichallenge.data.models

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class PopularProduct(
    val id: String,
    val title: String,
    val thumbnail: String,
    val price: Int,
    val sold_quantity: Int,
    val seller_address:String,
): Parcelable