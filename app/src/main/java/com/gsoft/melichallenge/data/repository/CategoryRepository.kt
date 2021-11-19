package com.gsoft.melichallenge.data.repository

import com.gsoft.melichallenge.data.models.Categories

interface CategoryRepository {
    suspend fun getCategories(name:String): List<Categories>
}