package com.teachmeskills.Lesson_14.task1.runnableModel.model;

import com.teachmeskills.Lesson_14.task1.runnableModel.model.Breakfast;
import com.teachmeskills.Lesson_14.task1.runnableModel.model.Coffee;
import com.teachmeskills.Lesson_14.task1.runnableModel.model.ReadingNews;

public class Runner {
    public static void main(String[] args) {

        Breakfast breakfast = new Breakfast();
        Thread thread = new Thread(breakfast);

        Coffee coffee = new Coffee();
        Thread thread1 = new Thread(coffee);

        ReadingNews readingNews = new ReadingNews();
        Thread thread2 = new Thread(readingNews);
    }
}
