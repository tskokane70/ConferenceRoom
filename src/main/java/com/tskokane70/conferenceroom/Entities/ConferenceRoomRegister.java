package com.tskokane70.conferenceroom.Entities;

public class ConferenceRoomRegister extends BaseEntity {
    private ConferenceRoom conferenceRoom;
    private Employee employee;
    private Integer startTime;
    private Integer endTime;    



    public ConferenceRoomRegister(String id, ConferenceRoom conferenceRoom, Employee employee,
            Integer startTime, Integer endTime) {
        this.id = id;
        this.conferenceRoom = conferenceRoom;
        this.employee = employee;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public ConferenceRoom getConferenceRoom() {
        return conferenceRoom;
    }

    public Employee getEmployee() {
        return employee;
    }

    public Integer getStartTime() {
        return startTime;
    }

    public Integer getEndTime() {
        return endTime;
    }

}
