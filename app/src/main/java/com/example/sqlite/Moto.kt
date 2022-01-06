package com.example.sqlite

import android.graphics.Bitmap
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey


@Entity(tableName = "tabela_moto")
data class Moto (
    var nome:String,
    var tipo:String,
    @ColumnInfo(name="descricao")
    var desc:String,
    var ano:Int){
    @PrimaryKey(autoGenerate = true)
    var id:Long = 0;
    @Ignore
    var imagem:Bitmap? = null;
}

