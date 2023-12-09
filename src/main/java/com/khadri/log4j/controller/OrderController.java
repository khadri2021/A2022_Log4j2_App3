package com.khadri.log4j.controller;


import com.khadri.log4j.logger.AppLogger;
import com.khadri.log4j.message.OrderRequest;
import com.khadri.log4j.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/v1/order/create")
    public void createOrder(OrderRequest orderRequest){
        AppLogger.info("Enter into the create Order");

        try {
            orderService.invokeOrder(orderRequest);
        }catch (Exception exception){
            AppLogger.error("Unknown Exception ",exception);
        }
    }
}
