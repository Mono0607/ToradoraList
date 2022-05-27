package Eduaardo.Yaniez.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import Eduaardo.Yaniez.myapplication.adaptador.PersonajeAdapter
import Eduaardo.Yaniez.myapplication.modelo.Personaje

class MainActivity : AppCompatActivity() {
    lateinit var miRecycler:RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val listaPersonajes = ArrayList<Personaje>()

        listaPersonajes.add(Personaje("LALA ( ララ･サタリン・デビルーク)","https://images6.alphacoders.com/104/1040238.png"))
        listaPersonajes.add(Personaje("TAIGA AISAKA ( 逢坂 大河 )","https://images3.alphacoders.com/841/841345.png"))
        listaPersonajes.add(Personaje("MINORI KUSHIEDA (櫛枝 実乃梨 )","https://images4.alphacoders.com/733/733183.png"))
        listaPersonajes.add(Personaje("AMI KAWASHIMA ( 川嶋 亜美 )","https://images.alphacoders.com/104/1041700.jpg"))
        listaPersonajes.add(Personaje("MASHIRO SHIINA ( 椎名 ましろ)","https://images2.alphacoders.com/866/866103.png"))
        listaPersonajes.add(Personaje("DESUMI MEGAHAARA ( 禍原 デス美 )","https://images8.alphacoders.com/122/1229096.png"))
        listaPersonajes.add(Personaje("LALA ( ララ･サタリン・デビルーク)","https://images6.alphacoders.com/104/1040238.png"))



        miRecycler= findViewById(R.id.RecyclerPersonajes)

        miRecycler.adapter=PersonajeAdapter(listaPersonajes)
        miRecycler.layoutManager=LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        //GridLayoutManager
        //StaggeredGridLayoutManager


    }
}

