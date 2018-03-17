package com.gourdet.julien.chocotastic.features.list

/**
 * Created by Julien on 16/03/2018.
 */
data class ChocolateEntity(private val id: Int, private val name: String) {

    fun toChocolate(): Chocolate {
        return Chocolate.create {
            this@ChocolateEntity.let {
                id = it.id
                name = it.name
            }
        }
    }
}