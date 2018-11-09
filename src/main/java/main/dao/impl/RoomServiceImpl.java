package main.dao.impl;

import main.dao.repository.RoomRepository;
import main.dao.repository.UserRepository;
import main.dao.services.RoomService;
import main.dao.services.UserService;
import main.entity.Room;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;

public class RoomServiceImpl implements RoomService {
    @Autowired
    private RoomRepository roomRepository;

    @Override
    public Room findRoomById(Long id) {
        return roomRepository.findOne(id);
    }

    @Override
    @Transactional
    public void saveRoom(Room room) {
        roomRepository.save(room);
    }

    @Override
    @Transactional
    public void deleteRoomById(Long id) {
        roomRepository.delete(id);
    }

    @Override
    @Transactional
    public void updateRoom(Room room) {
        roomRepository.save(room);
    }
}
