package com.gsoft.melichallenge.data.repository

import com.gsoft.melichallenge.data.models.SelectedProduct

interface ProductRepository {
    suspend fun getProduct(prodId:String) : SelectedProduct
}