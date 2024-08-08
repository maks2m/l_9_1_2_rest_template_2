package org.example.l_9_1_2_rest_template_2.dto.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CurrentWeatherForCityModel {
    private String city;
    private double temperature;
    private double windSpeed;
}
