package com.nsight.model;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class Day {

    @SerializedName("maxtemp_c")
    private float maxTempC;

    @SerializedName("maxtemp_f")
    private float maxTempF;

    @SerializedName("mintemp_c")
    private float minTempC;

    @SerializedName("mintemp_f")
    private float minTempF;

    @SerializedName("avgtemp_c")
    private float avgTempC;

    @SerializedName("avgtemp_f")
    private float avgTempF;

    @SerializedName("condition")
    private Condition condition;

    @SerializedName("maxwind_mph")
    private float maxWindMph;

    @SerializedName("maxwind_kph")
    private float maxWindKph;

    @SerializedName("totalprecip_mm")
    private float totalPrecipMM;

    @SerializedName("totalprecip_in")
    private float totalPrecipIn;

    @SerializedName("totalsnow_cm")
    private float totalSnowCm;

    @SerializedName("avgvis_km")
    private float avgVisKm;

    @SerializedName("avgvis_miles")
    private float avgVisMiles;

    @SerializedName("uv")
    private float uv;

    @SerializedName("avghumidity")
    private float avgHumidity;

    @SerializedName("daily_will_it_rain")
    private float dailyWillItRain;

    @SerializedName("daily_chance_of_rain")
    private float dailyChanceOfRain;

    @SerializedName("daily_will_it_snow")
    private float dailyWillItSnow;

    @SerializedName("daily_chance_of_snow")
    private float dailyChanceOfSnow;

    @SerializedName("air_quality")
    private AirQuality airQuality;
}
