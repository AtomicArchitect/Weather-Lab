# Weather-Lab
Simple library for interaction with [WeatherAPI](https://www.weatherapi.com)
## Init
```git
try {
  WeatherLab weatherLab = new WeatherLab("YOUR_KEY", "LANGUAGE", "LOCATION");
  // Code
} catch (UnavailableAPI e) {
  System.out.println(e.getMessage());
}
```
## Current
```git
Current current = weatherLab.getCurrent();
```

## Forecast
```git
ForecastDay[] forecastDays = weatherLab.getForecast(2);
```
