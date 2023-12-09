package com.khadri.log4j.message;


import java.util.UUID;

public class OrderRequest {
    private UUID orderId;
    private String orderName;

    public void setOrderId(UUID orderId) {
        this.orderId = orderId;
    }

    public UUID getOrderId() {
        return orderId;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public String getOrderName() {
        return orderName;
    }
}
