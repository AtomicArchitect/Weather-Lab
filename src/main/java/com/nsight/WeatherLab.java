package com.nsight;

import com.google.gson.*;
import com.nsight.exception.UnavailableAPI;
import com.nsight.model.Current;
import com.nsight.model.ForecastDay;
import com.nsight.model.Location;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class WeatherLab {

    private static final String API_LINK = "http://api.weatherapi.com/v1";
    private static final String API_LINK_CURRENT = API_LINK + "/current.json";
    private static final String API_LINK_FORECAST = API_LINK + "/forecast.json";
    private static final String API_LINK_SEARCH = API_LINK + "/search.json";

    private String API_KEY;
    private String lang;
    private String location;
    private Location locationObject;

    private final Gson gson;

    public WeatherLab(String API_KEY) throws UnavailableAPI {
        this(API_KEY, "ru", "Moscow");
    }

    public WeatherLab(String API_KEY, String lang, String location) throws UnavailableAPI {
        this.API_KEY = API_KEY;
        this.lang = lang;
        this.location = location;
        gson = new Gson();
    }

    public Location[] getLocations(String locationName) throws UnavailableAPI {
        String link = API_LINK_SEARCH + "?key=" + API_KEY + "&q=" + locationName + "&lang=" + lang;
        String[] response = sendRequest(link);
        if(response[0].equals("200")) return gson.fromJson(response[1], Location[].class);
        else throw new UnavailableAPI("Not an authorized key");
    }

    public Current getCurrent() throws UnavailableAPI {
        String link = API_LINK_CURRENT + "?key=" + API_KEY + "&q=" + location + "&aqi=yes" + "&lang=" + lang;
        String[] response = sendRequest(link);
        if(response[0].equals("200")) {
            JsonObject document = (JsonObject) JsonParser.parseString(response[1]);
            if(locationObject != null) locationObject = gson.fromJson(document.get("location"), Location.class);
            return gson.fromJson(document.get("current"), Current.class);
        }
        else throw new UnavailableAPI("Not an authorized key");
    }

    public ForecastDay[] getForecast(int days) throws UnavailableAPI {
        String link = API_LINK_FORECAST + "?key=" + API_KEY + "&q=" + location + "&days=" + days + "&aqi=yes" + "&lang=" + lang;
        String[] response = sendRequest(link);
        if(response[0].equals("200")) {
            JsonObject document = (JsonObject) JsonParser.parseString(response[1]);
            if(locationObject != null) locationObject = gson.fromJson(document.get("location"), Location.class);
            return gson.fromJson(((JsonObject) document.get("forecast")).get("forecastday"), ForecastDay[].class);
        }
        else throw new UnavailableAPI("Not an authorized key");
    }

    private static String[] sendRequest(String link) throws UnavailableAPI {
        try {
            HttpRequest request = HttpRequest.newBuilder()
                    .header("Content-Type", "application/x-www-form-urlencoded")
                    .uri(URI.create(link))
                    .build();
            HttpClient client = HttpClient.newHttpClient();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return new String[] {String.valueOf(response.statusCode()), response.body()};
        } catch (IOException | InterruptedException e) {
            throw new UnavailableAPI();
        }
    }

    public void setAPIKey(String newAPIKey) {
        this.API_KEY = newAPIKey;
    }

    public void setLanguage(String LANG) {
        this.lang = LANG;
    }

    public void setLocation(String newLocation) {
        this.location = newLocation;
    }

    public String getAPIKey() {
        return API_KEY;
    }

    public String getLanguage() {
        return lang;
    }

    public String getLocation() {
        return location;
    }

    public Location getLocationObject() {
        return locationObject;
    }
}
