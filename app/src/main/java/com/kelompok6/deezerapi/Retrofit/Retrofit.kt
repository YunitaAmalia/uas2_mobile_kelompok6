package com.kelompok6.deezerapi.Retrofit

import com.kelompok6.deezerapi.models.*

import retrofit2.http.GET
import retrofit2.http.Path

interface Retrofit {

    @GET("genre")
    fun getCategory(): retrofit2.Call<Category>

    @GET("genre/{genre_id}/artists")
    fun getDetails(@Path("genre_id") id :Int) : retrofit2.Call<Details>

    @GET("artist/{artist_id}")
    fun getArtist(@Path("artist_id") idArtist :Int) : retrofit2.Call<artistX>

    @GET("artist/{artist_id}/top?limit=50")
    fun getAlbum(@Path("artist_id") idAlbums: Int) : retrofit2.Call<com.kelompok6.deezerapi.models.album.Album>

    @GET("album/{album_id}/tracks")
    fun getMusic(@Path("album_id") idMusic :Int) : retrofit2.Call<com.kelompok6.deezerapi.models.album.Album>


}