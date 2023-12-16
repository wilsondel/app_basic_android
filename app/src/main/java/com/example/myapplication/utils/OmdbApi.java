package com.example.myapplication.utils;

import com.example.myapplication.models.MoviesResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface OmdbApi {

    @GET(".")
    Call<MoviesResponse> getMovies(@Query("s") String search, @Query("apikey") String apiKey);

}
