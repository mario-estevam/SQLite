package com.example.sqlite

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.room.Room

class MainActivity : AppCompatActivity() {

    val db:AppDatabase by lazy{
        Room.databaseBuilder(
            this,
            AppDatabase::class.java, "database-name")
            .allowMainThreadQueries()
            .build()
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        db.motoDao().inserir(Moto("nome","tipo", "desc", 120))
        db.motoDao().listAll().forEach { Log.i("APROOM",it.toString()) }

        val m1 = Moto("cb125","Honda","nova",2010)
        val m2 = Moto("cb150","Honda","nova",2015)

        db.motoDao().insereDois(m1,m2)
    }
}