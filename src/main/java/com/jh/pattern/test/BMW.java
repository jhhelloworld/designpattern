package com.jh.pattern.test;

import com.jh.pattern.test.inter.ICar;

public class BMW implements ICar {
    @Override
    public void run() {
        System.out.println("宝马汽车开始运行");
    }
}
