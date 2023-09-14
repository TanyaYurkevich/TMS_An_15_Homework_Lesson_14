package com.teachmeskills.Lesson_14.task1.runnableModel.model;

public class ReadingNews implements Runnable{
    Thread thread;
    ReadingNews(){
        thread = new Thread(this,"Новости");
        System.out.println(thread.getName());
        thread.start();
        thread.setPriority(5);
    }

    @Override
    public void run() {
        for (int i =1;i<10;i++){
            System.out.println("Я читаю новости " + i);
        }
    }
}
