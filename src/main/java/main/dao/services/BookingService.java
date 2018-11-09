package main.dao.services;

import main.entity.Booking;

public interface BookingService {
    Booking findBookingById(Long id);

    void saveBooking(Booking booking);

    void deleteBookingById(Long id);

    void updateBooking(Booking booking);
}