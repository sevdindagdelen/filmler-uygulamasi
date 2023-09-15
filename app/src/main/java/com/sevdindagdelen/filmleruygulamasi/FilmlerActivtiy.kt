package com.sevdindagdelen.filmleruygulamasi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.sevdindagdelen.filmleruygulamasi.databinding.ActivityFilmlerActivtiyBinding

class FilmlerActivtiy : AppCompatActivity() {
    private lateinit var binding: ActivityFilmlerActivtiyBinding
    private lateinit var adapter: FilmlerAdapter
    private lateinit var filmler_liste:ArrayList<Filmler>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityFilmlerActivtiyBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val kategori =intent.getSerializableExtra("kategoriNesne") as Kategori

        binding.toolbar2.title="Filmler: ${kategori.kategori_ad}"

        setSupportActionBar(binding.toolbar2)


        binding.RvFilmler.setHasFixedSize(true)
        binding.RvFilmler.layoutManager=StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)




        filmler_liste= ArrayList()

        val x=Kategori(1,"aksiyon")
        val y=Yonetmen(1,"Tarrantino")

        val f1=Filmler(1,"Django",2002,"django",x,y)
        val f2=Filmler(2,"Inception",2002,"inception",x,y)
        val f3=Filmler(3,"Interstaller",2002,"interstellar",x,y)
        val f4=Filmler(4,"Pianist",2002,"thepianist",x,y)

        filmler_liste.add(f1)
        filmler_liste.add(f2)
        filmler_liste.add(f3)
        filmler_liste.add(f4)

        adapter= FilmlerAdapter(this,filmler_liste)
        binding.RvFilmler.adapter=adapter

    }
}