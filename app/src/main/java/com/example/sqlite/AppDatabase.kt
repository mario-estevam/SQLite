package com.example.sqlite

import androidx.room.Database
import androidx.room.RoomDatabase


@Database(
    entities = [Moto::class], version = 1
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun motoDao(): motoDAO
}