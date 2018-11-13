package main.dao.services;

import main.entity.Booking;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BookingService {
    Booking findBookingById(Long id);

    List<Booking> findAll();

    List<Booking> findBookingByUserId(Long id);

    void saveBooking(Booking booking);

    void deleteBookingById(Long id);

    void updateBooking(Booking booking);
}