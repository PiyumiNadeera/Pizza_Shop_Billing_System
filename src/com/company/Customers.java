package com.company;

public class Customers  {
    private int validity;
    double total,price;

    public Customers(int validity) {
        this.validity = validity;
    }

    public int getValidity() {
            return validity;
        }

        public void setValidity(int validity) {
            this.validity = validity;
        }

        public void offers(){
            if (validity != 0) {
                System.out.println("Congratulations. You can have 10% discount for your bill.");
            } else {
                System.out.println("You can have a 5% discount for a bill of more than Rs.5000/-");
            }
        }



}
