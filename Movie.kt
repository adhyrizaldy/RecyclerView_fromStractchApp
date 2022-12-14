package praktikum.modul4

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Movie(
    var judul: String,
    var details: String,
    var photos: Int
):Parcelable

