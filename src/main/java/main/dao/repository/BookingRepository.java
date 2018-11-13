package main.dao.repository;

import main.entity.Booking;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BookingRepository extends CrudRepository<Booking, Long> {
    List<Booking> findAll();

    @Query(value = "select booking.id,booking.date,booking.final_price,booking.date from rooms  inner join orders on rooms.id = orders.room_id\n" +
            "           inner join booking on booking.id = orders.booking_id  where booking.user_id = :userId", nativeQuery = true)
    List <Booking> findBookingByUserId(@Param("userId")Long id);
}
