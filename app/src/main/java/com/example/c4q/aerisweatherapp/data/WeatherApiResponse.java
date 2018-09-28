package com.example.c4q.aerisweatherapp.data;

import java.util.List;

/**
 * Created by c4q on 9/27/18.
 */

public class WeatherApiResponse {
    private boolean success;
    private String error;
    private List<Response> response;

    public WeatherApiResponse(boolean success, String error, List<Response> response) {
        this.success = success;
        this.error = error;
        this.response = response;
    }

    public boolean isSuccess() {
        return success;
    }

    public String getError() {
        return error;
    }

    public List<Response> getResponse() {
        return response;
    }
}
