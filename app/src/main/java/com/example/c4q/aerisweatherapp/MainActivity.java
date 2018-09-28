package com.example.c4q.aerisweatherapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.ToggleButton;

import com.example.c4q.aerisweatherapp.data.Periods;
import com.example.c4q.aerisweatherapp.data.WeatherApiResponse;
import com.example.c4q.aerisweatherapp.data.WeatherApiService;
import com.example.c4q.aerisweatherapp.presentation.WeatherAdapter;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    ToggleButton switchWeather;
    RecyclerView weatherRV;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWeatherForecast();

    }


    public void getWeatherForecast(){
        Call<WeatherApiResponse> call = getWeatherApiService().getResponse();
        call.enqueue(new Callback<WeatherApiResponse>() {
            @Override
            public void onResponse(Call<WeatherApiResponse> call, Response<WeatherApiResponse> response) {
                List<Periods> periods = response.body().getResponse().get(0).getPeriods();
                Log.e("Period ", periods.toString());
                Log.e("icon url", periods.get(0).getIcon());
                setWeatherRV(periods);
            }

            @Override
            public void onFailure(Call<WeatherApiResponse> call, Throwable t) {
                t.printStackTrace();
            }
        });
    }

    public void setWeatherRV(List<Periods> periodsList) {
        weatherRV = findViewById(R.id.weather_rv);
        weatherRV.setAdapter(new WeatherAdapter(periodsList));
        weatherRV.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false));
    }

    public WeatherApiService getWeatherApiService(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(WeatherApiService.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        return retrofit.create(WeatherApiService.class);
    }


}
