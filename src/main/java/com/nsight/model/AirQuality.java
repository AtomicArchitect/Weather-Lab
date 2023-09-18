package com.nsight.model;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class AirQuality {

    @SerializedName("co")
    private float co;

    @SerializedName("no2")
    private float no2;

    @SerializedName("o3")
    private float o3;

    @SerializedName("so2")
    private float so2;

    @SerializedName("pm2_5")
    private float pm2_5;

    @SerializedName("pm10")
    private float pm10;

    @SerializedName("us-epa-index")
    private float usEpaIndex;

    @SerializedName("gb-defra-index")
    private float gbDefraIndex;
}
