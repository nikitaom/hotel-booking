package main.dao.repository;

import main.entity.Booking;
import main.entity.Order;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.awt.print.Book;
import java.util.List;

public interface OrderRepository extends CrudRepository<Order, Long> {
    List<Order> findAll();

    @Query(value = "select orders.id, orders.booking_id, orders.breakfast,orders.cleaning,orders.room_id from rooms  inner join orders on rooms.id = orders.room_id\n" +
            "           inner join booking on booking.id = orders.booking_id  where orders.booking_id = :bookingId", nativeQuery = true)
     Order findOrdersByBookingId(@Param("bookingId")Long id);
}
