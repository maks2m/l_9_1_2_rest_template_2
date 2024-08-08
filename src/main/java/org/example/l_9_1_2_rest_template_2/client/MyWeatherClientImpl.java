package org.example.l_9_1_2_rest_template_2.client;

import lombok.RequiredArgsConstructor;
import org.example.l_9_1_2_rest_template_2.dto.client.CurrentWeatherDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Component
@RequiredArgsConstructor
public class MyWeatherClientImpl implements MyWeatherClient {

    private final RestTemplate restTemplate;

    @Override
    public CurrentWeatherDto getCurrentWeather(double latitude, double longitude) {
        String url = "http://localhost:8080/api/weather/current?latitude={latitude}&longitude={longitude}";
        Map<String, String> params = new HashMap<>();
        params.put("latitude", String.valueOf(latitude));
        params.put("longitude", String.valueOf(longitude));
        ResponseEntity<CurrentWeatherDto> response = restTemplate.getForEntity(url, CurrentWeatherDto.class, params);
        return response.getBody();
    }
}
