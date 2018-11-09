package main.dao.services;

import main.entity.Order;

public interface OrderService {
    Order findOrderById(Long id);

    void saveOrder(Order order);

    void deleteOrderById(Long id);

    void updateOrder(Order order);
}
