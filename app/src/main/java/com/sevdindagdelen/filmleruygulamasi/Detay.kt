package com.sevdindagdelen.filmleruygulamasi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sevdindagdelen.filmleruygulamasi.databinding.ActivityDetayBinding

class Detay : AppCompatActivity() {
    private lateinit var binding:ActivityDetayBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding=ActivityDetayBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val filmler=intent.getSerializableExtra("filmlerNesnesi") as Filmler

        binding.imageView.setImageResource(resources.getIdentifier(filmler.film_resim,"drawable",packageName))
        binding.textViewYil.text=filmler.film_yil.toString()
        binding.textViewAD.text=filmler.film_ad
        binding.textViewYonetmen.text=filmler.yonetmen.yonetmen_ad.toString()
    }
}