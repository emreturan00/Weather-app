package com.dorileon.weather.dto;

import com.dorileon.weather.model.WeatherEntity;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


public record WeatherDto (
        String cityName,
        String country,
        Integer temperature
){
    public static WeatherDto convert(WeatherEntity from){
        return new WeatherDto(from.getCityName(), from.getCountry(), from.getTemperature());
    }
}
