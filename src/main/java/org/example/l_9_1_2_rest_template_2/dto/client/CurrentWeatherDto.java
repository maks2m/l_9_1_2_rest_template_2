package org.example.l_9_1_2_rest_template_2.dto.client;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CurrentWeatherDto {
    private double latitude;
    private double longitude;
    private double temperature;
    private double windSpeed;
}
