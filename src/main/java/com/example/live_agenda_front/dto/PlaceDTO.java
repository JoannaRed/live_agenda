package com.example.live_agenda_front.dto;


public class PlaceDTO {
    //private int id;
    private String name;
    private String address;
    private String description;
    private Integer score;

    public PlaceDTO() {
    }

    public PlaceDTO(String name, String address, String description, Integer score) {
        this.name = name;
        this.address = address;
        this.description = description;
        this.score = score;
    }

    @Override
    public String toString() {
        return "PlaceDTO{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", description='" + description + '\'' +
                ", score='" + score + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getDescription() {
        return description;
    }

    public Integer getScore() {
        return score;
    }
}
