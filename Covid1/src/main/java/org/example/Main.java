package org.example;

import com.google.gson.Gson;
import org.example.dto.CountryDaily;
import org.example.dto.CovidSummary;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.Scanner;
//https://api.covid19api.com/dayone/country/lithuania
//https://api.covid19api.com/summary?fbclid=IwAR1zpfnKbVQWWGvmpe5ZGTtsIRByZuCFu2WosP-LiEEkJapZB6QKlYuZpmA
public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
    CovidSummary countriesAndDayStatement = getCountries();
    List<CountryDaily> countryDaily= getCountryDaily("lithuania");
    System.out.println(countryDaily.size());
    System.out.println(countryDaily.get(0).toString());
    }
    private static CovidSummary getCountries() throws IOException {
        URL placesUrl = new URL("https://api.covid19api.com/summary");
        String jsonPlace = HttpHelper.sendGET(placesUrl);
        System.out.println(jsonPlace);
        Gson gs = new Gson();
        CovidSummary covidSummary = gs.fromJson(jsonPlace,CovidSummary.class);
        System.out.println(covidSummary.dayTotal.toString());
        return covidSummary;
    }
    private static List <CountryDaily> getCountryDaily(String countryName) throws IOException {
        URL placesUrl = new URL("https://api.covid19api.com/dayone/country/" + countryName);
        String jsonPlace = HttpHelper.sendGET(placesUrl);
        System.out.println(jsonPlace);
        Gson gs = new Gson();
        List<CountryDaily> countryDaily;
        countryDaily = List.of(gs.fromJson(jsonPlace,CountryDaily[].class));
        return countryDaily;
    }
}