package org.example.dto;

import com.google.gson.annotations.SerializedName;

import java.util.Date;

public class Global {
    @SerializedName("NewConfirmed")
    protected int newConfirmed;
    @SerializedName("TotalConfirmed")
    protected int totalConfirmed;
    @SerializedName("NewDeaths")
    protected int newDeaths;
    @SerializedName("TotalDeaths")
    protected int totalDeaths;
    @SerializedName("NewRecovered")
    protected int newRecovered;
    @SerializedName("TotalRecovered")
    protected int totalRecovered;
    @SerializedName("Date")
    protected Date date;

    @Override
    public String toString() {
        return "Global{" +
                "newConfirmed=" + newConfirmed +
                ", totalConfirmed=" + totalConfirmed +
                ", newDeaths=" + newDeaths +
                ", totalDeaths=" + totalDeaths +
                ", newRecovered=" + newRecovered +
                ", totalRecovered=" + totalRecovered +
                ", date=" + date +
                '}';
    }
}
