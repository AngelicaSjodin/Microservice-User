package com.example.user;

public class Payments {

    private Long id;
    private Long userId;
    private Long orderId;
    private String paymentStatus;
    private double amount;
    private String paymentDate;

    public Payments(){
    }

    public Payments(Long id, Long userId,Long orderId,String paymentStatus,double amount,String paymentDate){
        this.id =id;
        this.userId = userId;
        this.orderId =orderId;
        this.paymentStatus=paymentStatus;
        this.amount =amount;
        this.paymentDate=paymentDate;
    }

    //set adn get hehe

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }
}


