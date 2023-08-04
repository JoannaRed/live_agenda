package com.example.live_agenda_front.dto;


public class PlaceDTO {
    //private int id;
    private String name;
    private String address;
    private String description;

    public PlaceDTO() {
    }

    public PlaceDTO(String name, String address, String description) {
        this.name = name;
        this.address = address;
        this.description = description;
    }

    @Override
    public String toString() {
        return "PlaceDTO{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", description='" + description + '\'' +
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
}
