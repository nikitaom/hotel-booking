package main.dao.repository;

import main.entity.Booking;
import main.entity.Order;
import main.entity.Room;
import main.entity.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.ArrayList;
import java.util.List;

public interface RoomRepository extends CrudRepository<Room, Long> {
    List<Room> findAll();

    Room findById(Long id);

    @Query(value = "select rooms.id from rooms;", nativeQuery = true)
    List<Long> findAllId();

    @Query(value = "select rooms.id,rooms.category,rooms.room_number,rooms.description,rooms.room_price from rooms inner join orders on rooms.id = orders.room_id" +
            " inner join booking on booking.id = orders.booking_id" +
            " where rooms.id >0 AND booking.date = :date ", nativeQuery = true)
   List<Room> findBookedRoomsForDate(@Param("date") String date);

    @Query(value = "select rooms.id from rooms inner join orders on rooms.id = orders.room_id " +
            "inner join booking on booking.id = orders.booking_id where rooms.id >0 AND booking.date != ''; ",
            nativeQuery = true)
    List<Long> findBookedRoomsId();

    @Query(value = "select * from rooms where category = ?1 ;", nativeQuery = true)
    List <Room> findRoomsByCategory(String category);

    @Query(value = "select rooms.id,rooms.category,rooms.room_number,rooms.description,rooms.room_price from rooms  inner join orders on rooms.id = orders.room_id\n" +
            "           inner join booking on booking.id = orders.booking_id  where booking.user_id = :userId", nativeQuery = true)
    List <Room> findRoomsByUserId(@Param("userId")Long id);


}