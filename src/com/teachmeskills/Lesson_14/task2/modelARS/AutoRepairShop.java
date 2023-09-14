package com.teachmeskills.Lesson_14.task2.modelARS;

public class AutoRepairShop {
    private int freeBox = 0;

    public synchronized void freeing() {
        while (freeBox<1) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        freeBox--;
        System.out.println("1 бокс свободен");
        System.out.println("Занято боксов: " + freeBox);
        notify();
    }

    public synchronized void take(){
        while (freeBox>=5){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        freeBox++;
        System.out.println("Автомобиль занял бокс ");
        System.out.println("Занято боксов: " + freeBox);
        notify();
    }
}
