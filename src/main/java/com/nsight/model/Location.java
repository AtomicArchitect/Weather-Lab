package com.nsight.model;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class Location {

    @SerializedName("name")
    private String name;

    @SerializedName("region")
    private String region;

    @SerializedName("country")
    private String country;

    @SerializedName("lat")
    private float lat;

    @SerializedName("lon")
    private float lon;

    @SerializedName("tz_id")
    private String tz_id;

    @SerializedName("localtime_epoch")
    private long localtime_epoch;

    @SerializedName("localtime")
    private String localtime;
}
