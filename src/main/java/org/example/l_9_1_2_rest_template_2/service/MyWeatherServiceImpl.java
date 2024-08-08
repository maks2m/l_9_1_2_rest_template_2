package org.example.l_9_1_2_rest_template_2.service;

import lombok.RequiredArgsConstructor;
import org.example.l_9_1_2_rest_template_2.client.MyCityClient;
import org.example.l_9_1_2_rest_template_2.client.MyWeatherClient;
import org.example.l_9_1_2_rest_template_2.dto.client.CoordinatesOfCityDto;
import org.example.l_9_1_2_rest_template_2.dto.client.CurrentWeatherDto;
import org.example.l_9_1_2_rest_template_2.dto.model.CurrentWeatherForCityModel;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MyWeatherServiceImpl implements MyWeatherService {

    private final MyWeatherClient myWeatherClient;
    private final MyCityClient myCityClient;

    @Override
    public CurrentWeatherForCityModel getCurrentWeatherForCity(String city) {

        CoordinatesOfCityDto coordinatesOfCity = myCityClient.getCoordinatesOfCity(city);
        CurrentWeatherDto currentWeather =
                myWeatherClient.getCurrentWeather(coordinatesOfCity.getLatitude(), coordinatesOfCity.getLongitude());
        return CurrentWeatherForCityModel.builder()
                .city(coordinatesOfCity.getName())
                .temperature(currentWeather.getTemperature())
                .windSpeed(currentWeather.getWindSpeed())
                .build();

    }
}
