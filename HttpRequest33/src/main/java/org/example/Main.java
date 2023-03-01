package org.example;
import com.google.gson.Gson;
import java.io.IOException;

//http://api.meteo.lt/v1/stations/vilniaus-ams/observations/latest
public class Main {
    //json converter https://json2csharp.com/code-converters/json-to-pojo
    private static final String GET_URL = "https://api.meteo.lt/v1/stations/utenos-ams/observations";
    private static final String GET_URL_2 ="https://api.meteo.lt/v1/stations/vilniaus-ams/observations";
    public static void main(String[] args) throws IOException {
       String json = Utils.sendGET(GET_URL);
       Gson gs = new Gson();
       Stotis stotis = gs.fromJson(json, Stotis.class);
       System.out.println(stotis.code);

    }



}