package main.dao.services;

import main.entity.Room;

public interface RoomService {
    Room findRoomById(Long id);

    void saveRoom(Room room);

    void deleteRoomById(Long id);

    void updateRoom(Room room);
}
