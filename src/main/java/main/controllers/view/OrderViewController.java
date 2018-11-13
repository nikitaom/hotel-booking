package main.controllers.view;

import main.dao.services.BookingService;
import main.dao.services.OrderService;
import main.dao.services.RoomService;
import main.entity.Booking;
import main.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class OrderViewController {
    @Autowired
    private OrderService orderService;
    @Autowired
    private BookingService bookingService;
    @Autowired
    private RoomService roomService;

    @GetMapping("/new-order/{id}")
    public String newOrder(ModelMap modelMap,@PathVariable Long id) {
        Order order = new Order();
        order.setBooking(bookingService.findBookingById(id));
        modelMap.addAttribute("order",new Order());
        modelMap.addAttribute("rooms", roomService.findAll());
        return "create_order";
    }

       @PostMapping("/new-order")
    public String newOrder(Order order){
        orderService.saveOrder(order);
        return "redirect:/all-users";
    }

    @GetMapping("/delete-order/{id}")
    public String deleteOrder(@PathVariable long id) {
        orderService.deleteOrderById(id);
        return "redirect:/all-users";
    }

    @GetMapping("/all-orders")
    public String showAllOrders(ModelMap model){
        model.addAttribute("orders",orderService.findAll());
        return "index";
    }
}
