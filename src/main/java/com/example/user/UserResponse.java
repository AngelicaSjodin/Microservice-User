package com.example.user;
//DTO typ
public class UserResponse {
    private User user;
    private Payments payments;

    //const

    public UserResponse(User user, Payments payments) {
        this.user = user;
        this.payments = payments;
    }
    //tom
    public UserResponse(){
    }
    //get set


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Payments getPayments() {
        return payments;
    }

    public void setPayments(Payments payments) {
        this.payments = payments;
    }
}



