package com.jh.pattern.test;

import com.jh.pattern.test.inter.ICar;
import com.jh.pattern.test.inter.IDriver;

public class Driver implements IDriver {
    @Override
    public void drive(ICar car){
        car.run();
    }
}
