package com.example.c4q.aerisweatherapp.data;

import java.util.List;

/**
 * Created by c4q on 9/27/18.
 */

public class Response {
    private String interval;
    private List<Periods> periods;
    private Profile profile;

    public Response(String interval, List<Periods> periods, Profile profile) {
        this.interval = interval;
        this.periods = periods;
        this.profile = profile;
    }

    public String getInterval() {
        return interval;
    }

    public List<Periods> getPeriods() {
        return periods;
    }

    public Profile getProfile() {
        return profile;
    }
}
