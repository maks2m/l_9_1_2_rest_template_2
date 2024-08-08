package org.example.l_9_1_2_rest_template_2.client;

import lombok.RequiredArgsConstructor;
import org.example.l_9_1_2_rest_template_2.dto.client.CoordinatesOfCityDto;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class MyCityClientImpl implements MyCityClient {

    private final RestTemplate restTemplate;

    @Override
    public CoordinatesOfCityDto getCoordinatesOfCity(String cityName) {
        String url = "https://api.api-ninjas.com/v1/geocoding?city={city}&country={country}";

        HttpHeaders headers = new HttpHeaders();
        headers.add("X-Api-Key", "JNxvkbZBqzqQV3+7wDn1nw==ikJEQokXBpg4LyW9");
        HttpEntity<String> entity = new HttpEntity<>(headers);

        Map<String, String> params = new HashMap<>();
        params.put("city", cityName);
        params.put("country", "RU");
        ResponseEntity<CoordinatesOfCityDto[]> response = restTemplate.exchange(url, HttpMethod.GET, entity, CoordinatesOfCityDto[].class, params);
        CoordinatesOfCityDto[] array = Optional.ofNullable(response.getBody()).orElseThrow();
        return Arrays.stream(array).findFirst().orElseThrow();
    }
}
