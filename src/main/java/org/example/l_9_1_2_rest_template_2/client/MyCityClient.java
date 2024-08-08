package org.example.l_9_1_2_rest_template_2.client;

import org.example.l_9_1_2_rest_template_2.dto.client.CoordinatesOfCityDto;

public interface MyCityClient {

    CoordinatesOfCityDto getCoordinatesOfCity(String cityName);

}
