package com.kelompok6.deezerapi.Room

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.kelompok6.deezerapi.models.album.favoriteMusic

@Dao
interface DataDao {
    @Query("SELECT * FROM favoriteMusic")
    fun getAll(): List<favoriteMusic>
    @Delete
    fun delete(advent: favoriteMusic)
    @Insert
    fun insert(advent: favoriteMusic)

    @Query("SELECT COUNT(*) FROM favoriteMusic WHERE id = :id")
    fun checkIfDataExists(id: Int): Int
}