package lt.codeacademy.learn.orai;

import com.google.gson.Gson;
import lt.codeacademy.learn.orai.entities.*;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List<Place> places;
    static Scanner sc = new Scanner(System.in);
    //free api
    public static void main(String[] args) throws IOException {
        getPlaces();
        Place place = askForPlace();
        System.out.println(place.name);
        System.out.println(place.administrativeDivision);

        showForecast(place);

    }

    private static void showForecast(Place place) throws IOException {
        String str = String.format("https://api.meteo.lt/v1/places/%s/forecasts/long-term", place.code);
        URL url = new URL(str);
        String json = HttpHelper.sendGET(url);
        Gson gs = new Gson();
        Prognoze prognoze = gs.fromJson(json, Prognoze.class);
        prognoze.forecastTimestamps.stream().forEach(e ->System.out.println(e.airTemperature) );
        printForecast(prognoze);

    }

    private static void printForecast(Prognoze prognoze) {
        double min = prognoze.forecastTimestamps.stream()
                .map(e -> e.airTemperature)
                .min((x, y) -> x.compareTo(y)).get();

        System.out.println("Minimali temperatura : " + min);


    double max = prognoze.forecastTimestamps.stream()
            .map(e -> e.airTemperature)
            .max((x, y) -> x.compareTo(y)).get();
            System.out.println("Maksimali temperatura : " + max);

    int stulpeliuSkaicius = prognoze.forecastTimestamps.size();
    int iki = (int) Math.ceil(max) ;
    int nuo = (int) Math.floor(min);
    for (int i = iki; i > nuo; i--){
    System.out.print(String.format("%5d| ", i));
        for(int j = 0; j < stulpeliuSkaicius; j++) {
            char symbol = ' ';
            if(i == 0) symbol = '-';
            int temp =(int) Math.round(prognoze.forecastTimestamps.get(j).airTemperature);
            if (i == temp) symbol = 'x';
            System.out.print(symbol);
        }
        System.out.println();
    }

}



    private static Place askForPlace() {
            //cikle
            //paklausti vietos pavadinimo
        List<Place> filteredPlaces = getManyPlaces();
        while(true){
            System.out.println("Iveskite vietos numeri:");
            rodytiNumeruotaSarasa(filteredPlaces);
            int numeris = getNumberFromList(filteredPlaces);
            return  filteredPlaces.get(numeris);
        }



    }

    private static int getNumberFromList(List<Place> filteredPlaces) {
            while (true){
                System.out.println("Iveskite vietoves numeri:");
                String answer = sc.nextLine();
                try{
                    int skaicius = Integer.parseInt(answer);
                    if (skaicius < 0 || skaicius >= filteredPlaces.size())
                        continue;
                    return skaicius;
                }catch (Exception e){
                    System.out.println("Ivetete neegzistuojancia vietove:");
                }

            }
    }

    private static void rodytiNumeruotaSarasa(List<Place> filteredPlaces) {
        System.out.println("--------------------------");
            for (int i = 0; i < filteredPlaces.size() ; i++){
                System.out.println(i + " : " + filteredPlaces.get(i).name);
            }
    }

    private static List<Place> getManyPlaces() {
            while (true){
                System.out.println("Iveskite vietos pavadinima:");
                String pavadinimas = sc.nextLine();
                List<Place> sarasas = getFileteredPlaces(pavadinimas);
                if (!sarasas.isEmpty())
                    return sarasas;

            }

    }

    private static List<Place> getFileteredPlaces(String pavadinimas) {
            return  places.stream()
                    .filter(p -> p.name.contains(pavadinimas))
                    .toList();
    }

    private static void getPlaces() throws IOException {
        URL placesUrl = new URL("https://api.meteo.lt/v1/places");
        String jsonPlace = HttpHelper.sendGET(placesUrl);
        Gson gs = new Gson();
        places = List.of(gs.fromJson(jsonPlace,Place[].class));
        System.out.println(places.size());
    }


}