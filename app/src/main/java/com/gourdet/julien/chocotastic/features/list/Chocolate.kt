package com.gourdet.julien.chocotastic.features.list


import com.gourdet.julien.chocotastic.framework.extension.empty

/**
 * Created by Julien on 16/03/2018.
 */

data class Chocolate(val id: Int, val name: String) {

    companion object {
        fun empty() = Chocolate(0, String.empty())
    }
}