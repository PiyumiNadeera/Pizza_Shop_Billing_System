package com.company;

public class OrderTypes {
    private int orderType;

    public OrderTypes(int orderType) {
        this.orderType = orderType;
    }

    public int getOrderType() {
        return orderType;
    }

    public void setOrderType(int orderType) {
        this.orderType = orderType;
    }

    public void ordering(){
        if (orderType == 1) {
            System.out.println("You can buy upto 5 items.Place your order now");
        } else if (orderType == 2) {
            System.out.println("Place your order now");
        }
    }

}
