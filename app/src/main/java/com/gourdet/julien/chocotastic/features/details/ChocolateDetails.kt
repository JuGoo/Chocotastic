package com.gourdet.julien.chocotastic.features.details

import com.gourdet.julien.chocotastic.framework.extension.empty

data class ChocolateDetails(val id: Int,
                            val title: String) {
    companion object {
        fun empty() = ChocolateDetails(0, String.empty())
    }
}