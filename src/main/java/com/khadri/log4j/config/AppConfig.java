package com.khadri.log4j.config;


import com.khadri.log4j.message.OrderRequest;
import com.khadri.log4j.message.OrderResponse;
import com.khadri.log4j.service.OrderService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;

@Configuration
public class AppConfig {
    @Bean
    public OrderService orderService() {
        return new OrderService();
    }
    @Bean
    public OrderRequest orderRequest() {
        return new OrderRequest();
    }
    @Bean
    public OrderResponse orderResponse() {
        return new OrderResponse(HttpStatus.OK);
    }
}
