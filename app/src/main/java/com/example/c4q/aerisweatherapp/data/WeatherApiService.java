package com.example.c4q.aerisweatherapp.data;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by c4q on 9/27/18.
 */

public interface WeatherApiService {
    public static final String BASE_URL = "http://api.aerisapi.com/";
    String client_id = "lbqOMALZolfnSO3IatQJQ";
    String client_secret = "vusl1g3nM0bi5iSY7sHNwolxxhZuJyq7yeNn5i7G";


    @GET("forecasts/11101?client_id=" + client_id + "&client_secret=" + client_secret)
    Call<WeatherApiResponse> getResponse();

}
