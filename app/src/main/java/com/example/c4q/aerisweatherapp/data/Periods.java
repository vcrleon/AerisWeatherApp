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
    private String icon;

    public Periods(String dateTimeISO, int minTempF, int minTempC, int maxTempF, int maxTempC, String icon) {
        this.dateTimeISO = dateTimeISO;
        this.minTempF = minTempF;
        this.minTempC = minTempC;
        this.maxTempF = maxTempF;
        this.maxTempC = maxTempC;
        this.icon = icon;
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

    public String getIcon() {
        return icon;
    }
}
