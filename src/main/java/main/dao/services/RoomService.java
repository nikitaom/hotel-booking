package main.dao.services;

import main.entity.Room;

import java.util.List;

public interface RoomService {

    Room findRoomById(Long id);

    Room findById(Long id);

    List<Room> findAll();

    List<Long> findAllId();

    List <Room> findRoomsByCategory(String category);

    List <Room> findRoomsByUserId(Long id);

    List<Room> findBookedRoomsForDate(String date);

    List<Room> findFreeRoomsForDate(String date);

    List<Long> findBookedRoomsId();

    void saveRoom(Room room);

    void deleteRoomById(Long id);

    void updateRoom(Room room);


}
