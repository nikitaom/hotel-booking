package main.dao.impl;

import main.dao.repository.BookingRepository;
import main.dao.services.BookingService;
import main.entity.Booking;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;

public class BookingServiceImpl implements BookingService {
    @Autowired
    private BookingRepository bookingRepository;

    @Override
    public Booking findBookingById(Long id) {
        return bookingRepository.findOne(id);
    }

    @Override
    @Transactional
    public void saveBooking(Booking booking) {
        bookingRepository.save(booking);
    }

    @Override
    @Transactional
    public void deleteBookingById(Long id) {
        bookingRepository.delete(id);
    }

    @Override
    @Transactional
    public void updateBooking(Booking booking) {
        bookingRepository.save(booking);
    }
}
