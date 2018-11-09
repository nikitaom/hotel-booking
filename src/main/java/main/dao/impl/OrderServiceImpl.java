package main.dao.impl;

import main.dao.repository.OrderRepository;
import main.dao.services.OrderService;
import main.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;

public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderRepository orderRepository;

    @Override
    public Order findOrderById(Long id) {
        return orderRepository.findOne(id);
    }

    @Override
    @Transactional
    public void saveOrder(Order order) {
        orderRepository.save(order);
    }

    @Override
    @Transactional
    public void deleteOrderById(Long id) {
        orderRepository.delete(id);
    }

    @Override
    @Transactional
    public void updateOrder(Order order) {
        orderRepository.save(order);
    }
}
