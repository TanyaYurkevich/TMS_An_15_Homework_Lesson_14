package com.teachmeskills.Lesson_14.task2.modelARS;

public class Runner {
    public static void main(String[] args) {

        AutoRepairShop autoRepairShop = new AutoRepairShop();

        Customer customer= new Customer(autoRepairShop);
        Contractor contractor = new Contractor(autoRepairShop);

        new Thread(contractor).start();
        new Thread(customer).start();
    }
}
