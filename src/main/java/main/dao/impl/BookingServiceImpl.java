package main.dao.impl;

import main.dao.repository.BookingRepository;
import main.dao.services.BookingService;
import main.entity.Booking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service
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

    @Override
    public List<Booking> findAll() {
        return bookingRepository.findAll();
    }

    @Override
    public List<Booking> findBookingByUserId(Long id) {
        return bookingRepository.findBookingByUserId(id);
    }
}
