package com.example.live_agenda_front.controller;

import com.example.live_agenda_front.dto.PlaceDTO;
import com.example.live_agenda_front.service.PlaceService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ListPlacesController {

    private PlaceService placeService;

    public ListPlacesController(PlaceService placeService) {
        this.placeService = placeService;
    }

    @GetMapping("/list-places")
    public String showListPlacesPage(){

        List<PlaceDTO> placesList = placeService.getPlaces();

        return "list-places.html";
    }

}
