package main.dao.services;

import main.entity.Order;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface OrderService {
    Order findOrderById(Long id);

    List<Order> findAll();

     Order findOrdersByBookingId(Long id);

    void saveOrder(Order order);

    void deleteOrderById(Long id);

    void updateOrder(Order order);
}
