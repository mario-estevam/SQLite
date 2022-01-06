package com.example.sqlite

import androidx.room.*

@Dao
interface motoDAO {
    @Insert
    fun inserir(moto:Moto): Long

    @Insert
    fun insereDois(m1:Moto, m2:Moto)

    @Delete
    fun deletarVarios(vararg motos: Moto)

    @Query("DELETE FROM tabela_moto")
    fun deletaTodos()

    @Update
    fun atualizar(moto: Moto):Int

    @Query("SELECT * FROM tabela_moto")
    fun listAll(): Array<Moto>

    @Query("SELECT * FROM tabela_moto WHERE id=:id")
    fun findById(id:Long):Moto

    @Query("SELECT * FROM tabela_moto WHERE nome=:nome")
    fun findByName(nome:String):Moto


}