package org.example.l_9_1_2_rest_template_2.controller;

import lombok.RequiredArgsConstructor;
import org.example.l_9_1_2_rest_template_2.dto.model.CurrentWeatherForCityModel;
import org.example.l_9_1_2_rest_template_2.service.MyWeatherService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/weather")
public class MyWeatherController {

    private final MyWeatherService myWeatherService;

    @GetMapping("/current")
    public ResponseEntity<CurrentWeatherForCityModel> getCurrentWeather(@RequestParam String city) {
        return ResponseEntity.ok(myWeatherService.getCurrentWeatherForCity(city));
    }


}