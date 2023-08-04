package com.example.live_agenda_front.service;

import com.example.live_agenda_front.dto.PlaceDTO;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class PlaceService {

    // restTepmlate sluzy do polaczenia z backendem
    private RestTemplate restTemplate;

    public PlaceService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public PlaceDTO [] getPlaces() {

        PlaceDTO [] places = restTemplate.getForObject("http://localhost:8080/api/places", PlaceDTO[].class);
        return places;

    }
    public void addPlace(PlaceDTO newPlace) {
        restTemplate.postForObject("http://localhost:8080/api/places", newPlace, PlaceDTO.class);
    }
}
