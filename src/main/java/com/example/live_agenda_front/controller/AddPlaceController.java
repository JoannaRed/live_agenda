package com.example.live_agenda_front.controller;

import com.example.live_agenda_front.dto.PlaceDTO;
import com.example.live_agenda_front.service.PlaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.HttpClientErrorException;

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
            Integer score,
            Model model)
    {
        PlaceDTO newPlace = new PlaceDTO(name, address, description, score);
        System.out.println(newPlace);
        try {
            placeService.addPlace(newPlace);
            model.addAttribute("message", "miejsce dodane prawidlowo");


        }catch (HttpClientErrorException e){
            model.addAttribute("message", "nieprawidlowo uzupelnione dane");
        }

        return "add-place.html"; // Nazwa pliku HTML wyświetlającego wynik
    }
}
