package com.example.live_agenda_front.controller;

import com.example.live_agenda_front.dto.PlaceDTO;
import com.example.live_agenda_front.service.PlaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AddPlaceController {

    private final PlaceService placeService;

    @Autowired
    public AddPlaceController(PlaceService placeService) {
        this.placeService = placeService;
    }


    @GetMapping("/add-place")
    public String addPlacePage() {
        return "add-place.html"; // Nazwa pliku HTML z formularzem
    }

    @PostMapping("/add-place")
    public String addPlace(
            String name,
            String address,
            String description,
            Integer score)
    {
        PlaceDTO newPlace = new PlaceDTO(name, address, description, score);
        System.out.println(newPlace);
        placeService.addPlace(newPlace);

        return "index.html"; // Nazwa pliku HTML wyświetlającego wynik
    }
}
