package com.gourdet.julien.chocotastic.features.list

/**
 * Created by Julien on 16/03/2018.
 */

class Chocolate
private constructor(val id: Int, val name: String) {

    private constructor(builder: Builder) : this(builder.id, builder.name)

    companion object { fun create(init: Builder.() -> Unit) = Builder(init).build() }

    class Builder private constructor() {
        constructor(init: Builder.() -> Unit) : this() { init() }

        var id = 0
        var name = "https://raw.githubusercontent.com/android10/Sample-Data/master/Android-CleanArchitecture-Kotlin/posters/038001.jpg"

        fun build() = Chocolate(this)
    }
}