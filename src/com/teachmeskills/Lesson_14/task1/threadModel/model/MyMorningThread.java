package com.teachmeskills.Lesson_14.task1.threadModel.model;

public class MyMorningThread extends Thread {
    private String nameAction;

    public MyMorningThread(String nameAction) {
        this.nameAction = nameAction;
    }
    public void run(){
        for (int i = 0;i<5;i++){
            System.out.println(i + " У меня " + setName());
        }
    }

    private String setName() {
        return nameAction;
    }
}


