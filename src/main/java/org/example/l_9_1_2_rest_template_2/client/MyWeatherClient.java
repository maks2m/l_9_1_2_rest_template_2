package org.example.l_9_1_2_rest_template_2.client;

import org.example.l_9_1_2_rest_template_2.dto.client.CurrentWeatherDto;

public interface MyWeatherClient {
    CurrentWeatherDto getCurrentWeather(double latitude, double longitude);
}
