package com.tskokane70.conferenceroom.Repositories;

import java.util.List;

import com.tskokane70.conferenceroom.Entities.ConferenceRoom;
import com.tskokane70.conferenceroom.Entities.ConferenceRoomRegister;
import com.tskokane70.conferenceroom.Entities.Employee;

public interface IConferenceRoomRegister extends CRUDRepository<ConferenceRoomRegister, String> {
    public List<ConferenceRoomRegister> findByConferenceRoom(ConferenceRoom conferenceRoom);
    public List<ConferenceRoomRegister> findByEmployee(Employee employee);
}
