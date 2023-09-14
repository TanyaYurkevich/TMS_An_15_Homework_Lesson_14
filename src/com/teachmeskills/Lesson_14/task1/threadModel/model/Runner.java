package com.teachmeskills.Lesson_14.task1.threadModel.model;

public class Runner {
    public static void main(String[] args) {

    MyMorningThread morningThread = new MyMorningThread("завтрак");
        morningThread.setPriority(10);

    MyMorningThread morningThread1 = new MyMorningThread("кофепитие");
        morningThread1.setPriority(6);

    MyMorningThread morningThread2 = new MyMorningThread("чтение новостей");
        morningThread2.setPriority(6);

        morningThread.start();
        try {
        morningThread.join(200);
    } catch (InterruptedException e) {
        throw new RuntimeException(e);
    }

        morningThread1.start();

        morningThread2.start();
    }
}
