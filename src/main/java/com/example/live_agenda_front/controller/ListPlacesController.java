package com.example.live_agenda_front.controller;

import com.example.live_agenda_front.dto.PlaceDTO;
import com.example.live_agenda_front.service.PlaceService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class ListPlacesController {

    private PlaceService placeService;

    public ListPlacesController(PlaceService placeService) {
        this.placeService = placeService;
    }

    @GetMapping("/list-places")
    public String showListPlacesPage(Model model){
        // Model jest kontenerem w ktorym  wstawiamy obiekty/dane aby miec do nich dostep w widoku (html) MVC!

        PlaceDTO [] places = placeService.getPlaces();
        model.addAttribute("places", places);
        return "list-places.html";
    }

}
