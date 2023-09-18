package com.nsight.model;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class Condition {

    @SerializedName("text")
    private String text;

    @SerializedName("icon")
    private String icon;

    @SerializedName("code")
    private String code;
}
