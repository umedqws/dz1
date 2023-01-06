package com.example.dz1

import android.annotation.SuppressLint
import android.icu.lang.UCharacter.VerticalOrientation
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

lateinit var  firstRecyaclview: RecyclerView
lateinit var  secnodRecyaclview: RecyclerView
lateinit var newArrayList:ArrayList<Spotify>

lateinit var image:Array<Int>
lateinit var name :Array<String>
lateinit var album :Array<String>
class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        image = arrayOf(
            R.drawable.encore,
            R.drawable.evolve,
            R.drawable.hattori,
            R.drawable.mockingbird,
            R.drawable.origins,
            R.drawable.encore,
            R.drawable.evolve,
            R.drawable.hattori,
            R.drawable.mockingbird,
            R.drawable.origins,
            R.drawable.encore,
            R.drawable.evolve,
            R.drawable.hattori,
            R.drawable.mockingbird,
            R.drawable.origins,
        )

        name = arrayOf(
            "Eminem",
            "Imagine Dragons",
            "Miyagi Andy Panda",
            "Eminem",
            "Imagine Dragons",
            "Eminem",
            "Imagine Dragons",
            "Miyagi Andy Panda",
            "Eminem",
            "Imagine Dragons",
            "Eminem",
            "Imagine Dragons",
            "Miyagi Andy Panda",
            "Eminem",
            "Imagine Dragons",
        )
        album = arrayOf(
            "Encore",
            "Evolve",
            "Hattori",
            "mockingbird",
            "origins",
            "Encore",
            "Evolve",
            "Hattori",
            "mockingbird",
            "origins",
            "Encore",
            "Evolve",
            "Hattori",
            "mockingbird",
            "origins",
        )
        secnodRecyaclview = findViewById(R.id.recyaclesecond)
        firstRecyaclview = findViewById(R.id.recyacle)
        firstRecyaclview.layoutManager = LinearLayoutManager(this@MainActivity,LinearLayoutManager.HORIZONTAL,false)
        secnodRecyaclview.layoutManager = LinearLayoutManager(this@MainActivity,LinearLayoutManager.HORIZONTAL,false)
        firstRecyaclview.setHasFixedSize(true)
        newArrayList = arrayListOf<Spotify>()
        getData()
    }

    fun getData(){
        for (i in image.indices){
            val spot = Spotify(image[i], name[i], album[i] )
            newArrayList.add(spot)
        }
        firstRecyaclview.adapter = SpotiAdapter(ArrayList())
        secnodRecyaclview.adapter = SpotiAdapter(ArrayList())
    }
}