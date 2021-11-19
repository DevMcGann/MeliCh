package com.gsoft.melichallenge.data.repository


import com.gsoft.melichallenge.data.models.Categories
import com.gsoft.melichallenge.data.models.MasVendido

interface HighlistRepository {
   suspend fun getHighlist(id:String): List<MasVendido>
}