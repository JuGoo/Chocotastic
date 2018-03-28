package com.gourdet.julien.chocotastic.features.details

import com.gourdet.julien.chocotastic.framework.extension.empty

data class ChocolateDetailsEntity(private val id: Int,
                                  private val title: String) {

    companion object {
        fun empty() = ChocolateDetailsEntity(0, String.empty())
    }

    fun toChocolateDetails() = ChocolateDetails(id, title)
}