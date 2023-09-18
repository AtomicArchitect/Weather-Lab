package com.nsight.model;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class Current {

    @SerializedName("last_updated_epoch")
    private long lastUpdatedEpoch;

    @SerializedName("last_updated")
    private String lastUpdated;

    @SerializedName("temp_c")
    private float tempC;

    @SerializedName("temp_f")
    private float tempF;

    @SerializedName("is_day")
    private int isDay;

    @SerializedName("condition")
    private Condition condition;

    @SerializedName("wind_mph")
    private float windMph;

    @SerializedName("wind_kph")
    private float windKph;

    @SerializedName("wind_degree")
    private int windDegree;

    @SerializedName("wind_dir")
    private String windDir;

    @SerializedName("pressure_mb")
    private float pressureMb;

    @SerializedName("pressure_in")
    private float pressureIn;

    @SerializedName("precip_mm")
    private float precipMM;

    @SerializedName("precip_in")
    private float precipIn;

    @SerializedName("humidity")
    private int humidity;

    @SerializedName("cloud")
    private int cloud;

    @SerializedName("feelslike_c")
    private float feelslikeC;

    @SerializedName("feelslike_f")
    private float feelslikeF;

    @SerializedName("vis_km")
    private float visKm;

    @SerializedName("vis_miles")
    private float visMiles;

    @SerializedName("uv")
    private float uv;

    @SerializedName("gust_mph")
    private float gustMph;

    @SerializedName("gust_kph")
    private float gustKph;

    @SerializedName("air_quality")
    private AirQuality airQuality;
}
