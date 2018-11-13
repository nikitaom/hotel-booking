package main.dao.impl;

import main.dao.repository.RoomRepository;
import main.dao.repository.UserRepository;
import main.dao.services.BookingService;
import main.dao.services.OrderService;
import main.dao.services.RoomService;
import main.dao.services.UserService;
import main.entity.Booking;
import main.entity.Order;
import main.entity.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
public class RoomServiceImpl implements RoomService {
    @Autowired
    private RoomRepository roomRepository;
    @Autowired
    private OrderService orderService;
    @Autowired
    private BookingService bookingService;

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

    @Override
    public List<Room> findAll() {
        return roomRepository.findAll();
    }

    @Override
    public List<Long> findBookedRoomsId() {
        return roomRepository.findBookedRoomsId();
    }

    @Override
    public List<Long> findAllId() {
        return roomRepository.findAllId();
    }

    @Override
    public List<Room> findBookedRoomsForDate(String date) {
        return roomRepository.findBookedRoomsForDate(date);
    }


    public List<Room> findFreeRoomsForDate(String date) {
        List<Room> bookedRooms;
        List<Room> allRooms;
        allRooms = this.findAll();
        List<Room> freeRooms = new ArrayList<>();
        freeRooms = allRooms;
        bookedRooms = this.findBookedRoomsForDate(date);
        for (int a = 0; a < bookedRooms.size(); a++) {
            if (allRooms.contains(bookedRooms.get(a))) {
                allRooms.remove(a);
            }
        }
        for (Room room : allRooms
                ) {
            System.out.println(room.getId());
        }
        return allRooms;
    }

    @Override
    public Room findById(Long id) {
        return roomRepository.findById(id);
    }

    @Override
    public List<Room> findRoomsByCategory(String category) {
        return roomRepository.findRoomsByCategory(category);
    }

    @Override
    public List<Room> findRoomsByUserId(Long id) {
        return roomRepository.findRoomsByUserId(id);
    }

    public Double findRoomPrice(Long userId, Long roomId) {
        Double price = null;
        List<Booking> bookingList = bookingService.findBookingByUserId(userId);
        List<Order> orderList = new ArrayList<>();

        for (int a = 0; a < bookingList.size(); a++) {
            orderList.add(orderService.findOrdersByBookingId(bookingList.get(a).getBookingId()));
            if (orderList.get(a).getBreakfast() == true) {
                bookingList.get(a).setFinalPrice(bookingList.get(a).getFinalPrice() + 50);
            }
            if (orderList.get(a).getCleaning() == true) {
                bookingList.get(a).setFinalPrice(bookingList.get(a).getFinalPrice() + 50);
            }
            bookingList.get(a).setFinalPrice(bookingList.get(a).getFinalPrice() +
                    this.findById(roomId).getRoomPrice());
            bookingService.updateBooking(bookingList.get(a));
            price = bookingList.get(a).getFinalPrice();
        }
        return price;
    }
}
