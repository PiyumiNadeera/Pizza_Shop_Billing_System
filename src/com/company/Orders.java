package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Orders {
    public int noOfPizzas,itemNumber=0;
    public double price,total=0,finalTotal=0;

    public void vegType() {

        System.out.println("\n=========Veg pizza types========= \n(Enter the number of your choice) ");
        System.out.println("1.Mushroom-Rs.1200/- \n2.Cheese-Rs.1300/- \n3.Garlic-Rs.1400/-");
        Scanner input3 = new Scanner(System.in);
        int order1 = input3.nextInt();


        if (order1==1) {
            System.out.println("Mushroom pizza ordered.");
            price=1200;

        } else if (order1==2) {
            System.out.println("Cheese pizza ordered.");
            price = 1300;

        } else if (order1==3) {
            System.out.println("Garlic pizza ordered.");
            price = 1400;
        }

        total=total+price;
        itemNumber=itemNumber+1;
        noOfPizzas = noOfPizzas+1;
        System.out.print("Item Number:"+itemNumber+".");
        System.out.println("Your current total is Rs."+total);
    }

    public void nonVegType() {

        System.out.println("\n=========Non veg pizza types========= \n(Enter the number of your choice) ");
        System.out.println("1.Chicken-Rs.1500/- \n2.Beef-Rs.1600/- \n3.Pork-Rs.1700/-");

        Scanner input3 = new Scanner(System.in);
        int order1 = input3.nextInt();

        if (order1==1) {
            System.out.println("Chicken pizza ordered.");
            price = 1500;

        } else if (order1==2) {
            System.out.println("Beef pizza ordered.");
            price = 1600;


        } else if (order1==3) {
            System.out.println("Pork pizza ordered.");
            price = 1700;
        }

        total=total+price;
        itemNumber=itemNumber+1;
        noOfPizzas = noOfPizzas+1;
        System.out.print("Item Number:"+itemNumber+".");
        System.out.println("Your current total is Rs."+total);
    }

    public void beverages() {

        System.out.println("\n=========Beverage types========= \n(Enter the number of your choice) ");
        System.out.println("1.Sprite-Rs.120/- \n2.CocaCola-Rs.130/- \n3.Pepsi-Rs.150/- \n4.Fanta-Rs.160/-");
        Scanner input3 = new Scanner(System.in);
        int order1 = input3.nextInt();

        if (order1==1){
            System.out.println("Sprite ordered.");
            price=120;

        }
        else if (order1==2){
            System.out.println("Coca Cola ordered.");
            price=130;

        }
        else  if (order1==3) {
            System.out.println("Pepsi ordered.");
            price=150;
        }
        else  if (order1==4) {
            System.out.println("Fanta ordered.");
            price=160;
        }

        total=total+price;
        itemNumber=itemNumber+1;
        System.out.print("Item Number:"+itemNumber+".");
        System.out.println("Your current total is Rs."+total);
    }

    public void exit(Customers customers,OrderTypes orderTypes){
        System.out.println("\n\n================================BILL==================================== ");
        System.out.println("\nNumber of items ordered: " + itemNumber);
        System.out.println("Number of pizzas ordered: "+ noOfPizzas);
        System.out.println("Number of beverages ordered: " +(itemNumber-noOfPizzas));
        if(customers.getValidity()==0){
            if (total>=5000) {
                finalTotal = total - (total * 0.05);
                System.out.println("\n***Your final total is Rs." + finalTotal+"***");
                System.out.println("You have gained 5% discount for your bill.Thank you.......!");
                System.out.println("========================================================================");
            }else {
                System.out.println("\n***Your final total is Rs." + total+"***");
                System.out.println("Thank you......!");
                System.out.println("========================================================================");
            }
        }else {
            finalTotal = total-(total*0.1);
            System.out.println("\n***Your final total is Rs."+finalTotal+"***");
            System.out.println("You have gained 10% discount for your bill.Thank you.......!");
            System.out.println("========================================================================");
        }
    }


}
