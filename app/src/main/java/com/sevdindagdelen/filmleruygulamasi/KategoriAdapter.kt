package com.sevdindagdelen.filmleruygulamasi

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView


class KategoriAdapter(private val mcontext:Context,private val kategoriListe:List<Kategori>)
    :RecyclerView.Adapter<KategoriAdapter.KategorikardtasarimTutucu>() {

    inner class KategorikardtasarimTutucu(tasarim:View):RecyclerView.ViewHolder(tasarim){

        val kategori_kart:CardView=tasarim.findViewById(R.id.kategoriCard)
        val kategoriTextviewAd:TextView=tasarim.findViewById(R.id.textView_kategori)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): KategorikardtasarimTutucu {
        val tasarim=LayoutInflater.from(mcontext).inflate(R.layout.kategori_card_tasarim,parent,false)
        return KategorikardtasarimTutucu(tasarim)
    }

    override fun getItemCount(): Int {
        return kategoriListe.size
    }

    override fun onBindViewHolder(holder: KategorikardtasarimTutucu, position: Int) {
        val list=kategoriListe[position]
        holder.kategoriTextviewAd.text=list.kategori_ad

        holder.kategori_kart.setOnClickListener {
            val intent=Intent(mcontext,FilmlerActivtiy::class.java)
            intent.putExtra("kategoriNesne",list)
            mcontext.startActivity(intent)
        }
    }
}