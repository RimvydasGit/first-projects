package org.example.dto;

import com.google.gson.annotations.SerializedName;


import java.util.List;

public class CovidSummary {
    @SerializedName("Global")
    public Global dayTotal;
    @SerializedName("Countries")
    public List<Country> countries;

}
