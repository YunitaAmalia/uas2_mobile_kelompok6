package com.kelompok6.deezerapi.Room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.kelompok6.deezerapi.models.album.favoriteMusic

@Database(entities = [favoriteMusic::class], version = 1)
    abstract class RoomDataBase : RoomDatabase() {
        abstract fun dataDao(): DataDao
    }

