package com.gourdet.julien.chocotastic.features.list

import android.os.Parcel
import com.gourdet.julien.chocotastic.framework.platform.KParcelable
import com.gourdet.julien.chocotastic.framework.platform.parcelableCreator

/**
 * Created by Julien on 16/03/2018.
 */

data class ChocolateViewModel(val id: Int, val name: String, val image: String) : KParcelable {
    companion object {
        @JvmField val CREATOR = parcelableCreator(::ChocolateViewModel)
    }

    constructor(parcel: Parcel) : this(parcel.readInt(), parcel.readString(), parcel.readString())

    override fun writeToParcel(dest: Parcel, flags: Int) {
        with(dest) {
            writeInt(id)
            writeString(name)
            writeString(image)
        }
    }
}