package com.tskokane70.conferenceroom.Entities;

public class ConferenceRoom extends BaseEntity {

    public ConferenceRoom(ConferenceRoom conferenceRoom) {
        this(conferenceRoom.getId());
    }

    public ConferenceRoom(String id) {
        this.id = id;
    }

}
