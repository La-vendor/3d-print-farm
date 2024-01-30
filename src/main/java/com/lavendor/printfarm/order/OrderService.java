package com.lavendor.printfarm.order;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;

    public void saveOrder(Order order){
        orderRepository.save(order);
    }

    public List<Order> findAllOrders(){
        return orderRepository.findAll();
    }

}
