package com.tskokane70.conferenceroom.Entities;

import java.util.List;
import java.util.stream.Collectors;

public class Floor extends BaseEntity {
    private List<ConferenceRoom> conferenceRoomsList;

    public Floor(Floor floor) {
        this(floor.getId(), floor.getConferenceRoomsList());
    }

    public Floor(String id, List<ConferenceRoom> conferenceRoomsList) {
        this(conferenceRoomsList);
    }

    public Floor(List<ConferenceRoom> conferenceRoomsList) {
        this.conferenceRoomsList = conferenceRoomsList;
    }

    public List<ConferenceRoom> getConferenceRoomsList() {
        return this.conferenceRoomsList.stream().collect(Collectors.toList());
    }

    public List<ConferenceRoom> addConferenceRoom(ConferenceRoom conferenceRoom){
        this.conferenceRoomsList.add(conferenceRoom);
        return this.conferenceRoomsList.stream().collect(Collectors.toList());
    }

    public List<ConferenceRoom> deleteConferenceRoom(ConferenceRoom conferenceRoom){
        this.conferenceRoomsList.remove(conferenceRoom);
        return this.conferenceRoomsList.stream().collect(Collectors.toList());
    }
    
}
