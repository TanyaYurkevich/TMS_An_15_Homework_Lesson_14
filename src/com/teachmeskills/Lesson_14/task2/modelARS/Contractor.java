package com.teachmeskills.Lesson_14.task2.modelARS;

import com.teachmeskills.Lesson_14.task2.Utils.UtilsArs;

public class Contractor implements Runnable{
    private AutoRepairShop autoRepairShop;

    public Contractor(AutoRepairShop autoRepairShop) {
        this.autoRepairShop = autoRepairShop;
    }

    @Override
    public void run() {
        for (int i = 0; i< UtilsArs.MAX_NUMBER; i++){
            autoRepairShop.take();
        }
    }
}
