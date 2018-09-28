package com.example.c4q.aerisweatherapp.data;

/**
 * Created by c4q on 9/27/18.
 */

public class Periods {
    private String dateTimeISO;
    private int minTempF;
    private int minTempC;
    private int maxTempF;
    private int maxTempC;

    public Periods(String dateTimeISO, int minTempF, int minTempC, int maxTempF, int maxTempC) {
        this.dateTimeISO = dateTimeISO;
        this.minTempF = minTempF;
        this.minTempC = minTempC;
        this.maxTempF = maxTempF;
        this.maxTempC = maxTempC;
    }

    public String getDateTimeISO() {
        return dateTimeISO;
    }

    public int getMinTempF() {
        return minTempF;
    }

    public int getMinTempC() {
        return minTempC;
    }

    public int getMaxTempF() {
        return maxTempF;
    }

    public int getMaxTempC() {
        return maxTempC;
    }
}
