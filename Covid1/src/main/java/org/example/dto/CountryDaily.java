package org.example.dto;

import com.google.gson.annotations.SerializedName;

import java.util.Date;

public class CountryDaily {
    @SerializedName("ID")
    public String iD;
    @SerializedName("Country")
    public String country;
    @SerializedName("CountryCode")
    public String countryCode;
    @SerializedName("Province")
    public String province;
    @SerializedName("City")
    public String city;
    @SerializedName("CityCode")
    public String cityCode;
    @SerializedName("Lat")
    public String lat;
    @SerializedName("Lon")
    public String lon;
    @SerializedName("Confirmed")
    public int confirmed;
    @SerializedName("Deaths")
    public int deaths;
    @SerializedName("Recovered")
    public int recovered;
    @SerializedName("Active")
    public int active;
    @SerializedName("Date")
    public Date date;

    @Override
    public String toString() {
        return "CountryDaily{" +
                "iD='" + iD + '\'' +
                ", country='" + country + '\'' +
                ", countryCode='" + countryCode + '\'' +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", cityCode='" + cityCode + '\'' +
                ", lat='" + lat + '\'' +
                ", lon='" + lon + '\'' +
                ", confirmed=" + confirmed +
                ", deaths=" + deaths +
                ", recovered=" + recovered +
                ", active=" + active +
                ", date=" + date +
                '}';
    }
}
