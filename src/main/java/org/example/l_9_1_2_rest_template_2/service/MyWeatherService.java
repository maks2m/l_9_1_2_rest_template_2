package org.example.l_9_1_2_rest_template_2.service;

import org.example.l_9_1_2_rest_template_2.dto.model.CurrentWeatherForCityModel;

public interface MyWeatherService {

    CurrentWeatherForCityModel getCurrentWeatherForCity(String city);

}
