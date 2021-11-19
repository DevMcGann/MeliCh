package com.gsoft.melichallenge.data.models

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class SelectedProduct(
    val id: String,
    val title: String,
    val thumbnail: String,
    val price: Int,
    val seller_address:String,
    val pictures : List<String?>  //pictures.url  pictures.secure_url
): Parcelable
