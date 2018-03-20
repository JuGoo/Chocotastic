package com.gourdet.julien.chocotastic.features.list

/**
 * Created by Julien on 16/03/2018.
 */
data class ChocolateEntity(private val id: Int, private val name: String, private val price: Float, private val isAlcoholic: Boolean) {
    fun toChocolate() = Chocolate(id, name)
}