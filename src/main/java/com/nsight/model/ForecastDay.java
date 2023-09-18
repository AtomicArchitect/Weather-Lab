package com.nsight.model;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class ForecastDay {

   @SerializedName("date")
   private String date;

    @SerializedName("date_epoch")
    private String date_epoch;

    @SerializedName("day")
    private Day day;

    @SerializedName("astro")
    private Astro astro;

    @SerializedName("hour")
    private Hour[] hours;
}
