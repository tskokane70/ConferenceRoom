package com.tskokane70.conferenceroom.Entities;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConferenceRoomRegister {
    private ConferenceRoom conferenceRoom;
    private Map<TimeSlot, Employee> timeslotEmployeeMap;

    public ConferenceRoomRegister(ConferenceRoom conferenceRoom, Map<TimeSlot, Employee> timeslotEmployeeMap){
        this(conferenceRoom);
        this.timeslotEmployeeMap = timeslotEmployeeMap;
    }

    public ConferenceRoomRegister(ConferenceRoom conferenceRoom) {
        this.conferenceRoom = conferenceRoom;
        this.timeslotEmployeeMap = new HashMap<>();
    }

    public ConferenceRoom getConferenceRoom() {
        return conferenceRoom;
    }

    public List<TimeSlot> getOccupiedTimeSlots() {
        return this.timeslotEmployeeMap.keySet().stream().collect(Collectors.toList());
    }
    
    public List<TimeSlot> getEmployeeBookedTimeSlots(Employee employee){
        return this.timeslotEmployeeMap.keySet()
                .stream()
                .filter(timeSlot -> timeslotEmployeeMap.get(timeSlot).equals(employee))
                .collect(Collectors.toList());
    }

    public void bookTimeSlot(TimeSlot timeSlot, Employee employee) {
        this.timeslotEmployeeMap.put(timeSlot, employee);
    }
}
