package com.sevdindagdelen.filmleruygulamasi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.sevdindagdelen.filmleruygulamasi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var kategoriListe:ArrayList<Kategori>
    private lateinit var adapter: KategoriAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbar)
        binding.rvKategori.setHasFixedSize(true)
        binding.rvKategori.layoutManager=LinearLayoutManager(this@MainActivity)
        kategoriListe= ArrayList()

        val k1=Kategori(1,"Aksiyon")
        val k2=Kategori(2,"Bilim Kurgu")
        val k3=Kategori(3,"Fantastik")

        kategoriListe.add(k1)
        kategoriListe.add(k2)
        kategoriListe.add(k3)

        adapter= KategoriAdapter(this@MainActivity,kategoriListe)
        binding.rvKategori.adapter=adapter



    }
}