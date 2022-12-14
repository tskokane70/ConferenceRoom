package com.tskokane70.conferenceroom.Entities;

import java.util.List;

public class Building extends BaseEntity {
    private List<Floor> floorsList;

    public Building(Building building) {
        this(building.getId(), building.getFloorsList());
    }

    public Building(String id, List<Floor> floorsList) {
        this(floorsList);
        this.id = id;
    }

    public Building(List<Floor> floorsList) {
        this.floorsList = floorsList;
    }

    public List<Floor> getFloorsList() {
        return this.floorsList;
    }

    public List<Floor> addFloor(Floor floor){
        this.floorsList.add(floor);
        return this.floorsList;
    }

    public List<Floor> deleteFloor(Floor floor){
        this.floorsList.remove(floor);
        return this.floorsList;
    }
}
