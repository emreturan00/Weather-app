package com.dorileon.weather.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown = true)

public record Location(
        String name,
        String country,
        @JsonProperty("localtime")
        String localTime
) {
}
