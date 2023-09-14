package com.teachmeskills.Lesson_14.task1.runnableModel.model;

public class Coffee implements Runnable{
    Thread thread;
    Coffee(){
        thread = new Thread(this,"Кофе");
        System.out.println(thread.getName());
        thread.start();
        thread.setPriority(5);
    }

    @Override
    public void run() {
        for (int i =1;i<10;i++){
            System.out.println("Я пью кофе " + i);
        }
    }
}
