package com.teachmeskills.Lesson_14.task1.runnableModel.model;

public class Breakfast implements Runnable{
    Thread thread;
     Breakfast(){
        thread = new Thread(this,"Завтрак");
        System.out.println(thread.getName());
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


    @Override
    public void run() {
        for (int i =1;i<5;i++){
            System.out.println("Я завтрaкаю " + i);
        }
    }
}
