package com.sevdindagdelen.filmleruygulamasi

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class FilmlerAdapter(private val mcontext:Context,private val FilmlerListe:List<Filmler>)
    :RecyclerView.Adapter<FilmlerAdapter.FilmlerCardTutucu>() {

    inner class FilmlerCardTutucu(tasarim:View):RecyclerView.ViewHolder(tasarim){

        val filmler_card:CardView=tasarim.findViewById(R.id.FilmlerCardTasarimi)
        val filmTEXT:TextView=tasarim.findViewById(R.id.textView_filmler)
        val imageFilm:ImageView=tasarim.findViewById(R.id.imageView_filmler)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FilmlerCardTutucu {
        val tasarim=LayoutInflater.from(mcontext).inflate(R.layout.filmler_card_tasarim,parent,false)
        return FilmlerCardTutucu(tasarim)
    }

    override fun getItemCount(): Int {
        return FilmlerListe.size
    }

    override fun onBindViewHolder(holder: FilmlerCardTutucu, position: Int) {
        val list=FilmlerListe[position]
        holder.filmTEXT.text=list.film_ad
        holder.imageFilm.setImageResource(mcontext.resources.getIdentifier(list.film_resim,"drawable",mcontext.packageName))

        holder.filmler_card.setOnClickListener{
            val intent=Intent(mcontext,Detay::class.java)
            intent.putExtra("filmlerNesnesi",list)
            mcontext.startActivity(intent)
        }
    }
}