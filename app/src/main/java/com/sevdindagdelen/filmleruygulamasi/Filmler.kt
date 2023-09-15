package com.sevdindagdelen.filmleruygulamasi

import java.io.Serializable

data class Filmler(val film_id:Int,
                   val film_ad:String,
                   val film_yil:Int,
                   val film_resim:String,
                   val kategori:Kategori,
                   val yonetmen: Yonetmen):Serializable
