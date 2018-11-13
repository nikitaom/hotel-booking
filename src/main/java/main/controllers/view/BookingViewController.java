package main.controllers.view;

import main.dao.repository.UserRepository;
import main.dao.services.BookingService;
import main.dao.services.RoomService;
import main.dao.services.UserService;
import main.entity.Booking;
import main.entity.Order;
import main.entity.Room;
import main.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;
import java.util.List;

@Controller
public class BookingViewController {

    @Autowired
    private BookingService bookingService;
    @Autowired
    private UserService userService;
    @Autowired
    private RoomService roomService;

    @GetMapping("/new-booking/{id}")
    public String newBooking(ModelMap modelMap, @PathVariable Long id) {
        Booking booking = new Booking();
        booking.setUser(userService.findUserById(id));
        booking.setFinalPrice(0.0);
        modelMap.addAttribute("booking", booking);
        modelMap.addAttribute("user_id",id);
        return "booking";
    }

    @GetMapping("/show-free-rooms")
    public String newBooking(ModelMap modelMap,@RequestParam("user.id") Long userId,
                             @RequestParam("date") String date) {
        if(date.equals("")) {
            return "redirect:/new-booking/"+ userId;
        }
        else {
            Booking booking = new Booking();
            booking.setUser(userService.findUserById(userId));
            booking.setFinalPrice(0.0);
            booking.setDate(date);
            bookingService.saveBooking(booking);
            modelMap.addAttribute("order", new Order());
            modelMap.addAttribute("booking", booking);
            modelMap.addAttribute("rooms", roomService.findFreeRoomsForDate(date));
            return "create_order";
        }
    }

    @GetMapping("/delete-booking/{id}")
    public String deleteBooking(@PathVariable long id) {
        bookingService.deleteBookingById(id);
        return "redirect:/all-users";
    }

    @GetMapping("/booking")
    public String showAllBooking(ModelMap model,@PathVariable Long id) {
        model.addAttribute("booking", bookingService.findBookingById(id));
        return "booking-list";
    }
}
