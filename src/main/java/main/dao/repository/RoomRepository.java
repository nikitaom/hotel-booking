package main.dao.repository;

import main.entity.Room;
import main.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface RoomRepository extends CrudRepository<Room, Long> {
}
