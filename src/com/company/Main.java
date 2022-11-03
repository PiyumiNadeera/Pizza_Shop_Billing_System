package com.company;

import java.util.Scanner;

public class Main extends Orders {

    public static void main(String[] args) {
        int orderType,validity;

        Scanner input1 = new Scanner(System.in);
        System.out.println("Are you a golden customer? If yes, please enter your validity card number. Else please enter 0.");
        validity = input1.nextInt();

        Customers customer1= new Customers(validity);
        customer1.offers();

        Scanner input2 = new Scanner(System.in);
        System.out.println("Please enter the order type ");
        System.out.println("1.Delivery \n2.Pick-up");
        orderType = input2.nextInt();

        OrderTypes orderType1 = new OrderTypes(orderType);
        orderType1.ordering();

        Orders order1 = new Orders();
        order1.vegType();
        order1.nonVegType();
        order1.nonVegType();
        order1.nonVegType();
        order1.beverages();
        order1.beverages();

        order1.exit(customer1,orderType1);



    }
}
