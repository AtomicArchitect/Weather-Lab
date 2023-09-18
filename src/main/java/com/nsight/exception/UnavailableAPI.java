package com.nsight.exception;

public class UnavailableAPI extends Exception {

    public UnavailableAPI() {
        super("Failed to connect to API");
    }

    public UnavailableAPI(String message) {
        super(message);
    }
}
