package com.nsight.model;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class Astro {

    @SerializedName("sunrise")
    private String sunrise;

    @SerializedName("sunset")
    private String sunset;

    @SerializedName("moonrise")
    private String moonrise;

    @SerializedName("moonset")
    private String moonset;

    @SerializedName("moon_phase")
    private String moonPhase;

    @SerializedName("moon_illumination")
    private int moonIllumination;

    @SerializedName("is_moon_up")
    private int isMoonUp;

    @SerializedName("is_sun_up")
    private int isSunUp;
}
