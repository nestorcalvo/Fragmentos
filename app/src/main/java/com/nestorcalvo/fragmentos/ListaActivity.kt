package com.nestorcalvo.fragmentos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_lista.*

class ListaActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    //private lateinit var superheroesAdapter: SuperheroesAdapter
   // private var listSuperheroes = listOf<Superheroes>(Superheroes("Superman",R.drawable.superman,"poder1"))

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista)

        var superheroes: MutableList<Superheroes> = ArrayList()
        superheroes.add(Superheroes(resources.getString(R.string.superman),R.drawable.superman,"poder1"))
        superheroes.add(Superheroes(resources.getString(R.string.batman),R.drawable.batman,"poder1"))
        superheroes.add(Superheroes(resources.getString(R.string.flash),R.drawable.flash,"poder1"))
       // listSuperheroes.add(Superheroes("Superman",R.drawable.superman,"poder1"))
        // recyclerView = RecyclerView(this)
        recyclerView = findViewById(R.id.recycler)
        recyclerView.setHasFixedSize(true)

        recyclerView.layoutManager = LinearLayoutManager(this,RecyclerView.VERTICAL,false)

        val superheroesAdapter = SuperheroesAdapter(superheroes!!,this)
        recyclerView.adapter = superheroesAdapter


    }
}
