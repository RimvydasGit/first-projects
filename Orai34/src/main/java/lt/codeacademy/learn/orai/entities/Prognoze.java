package lt.codeacademy.learn.orai.entities;

import java.util.List;

public class Prognoze {
    public Place place;
    public String forecastType;
    public String forecastCreationTimeUtc;
    public List<ForecastTimestamp> forecastTimestamps;
}
