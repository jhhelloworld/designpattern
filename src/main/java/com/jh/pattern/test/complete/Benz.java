package com.jh.pattern.test.complete;

import com.jh.pattern.test.inter.ICar;

import javax.swing.*;

public class Benz implements ICar {
    @Override
    public void run() {
        System.out.println("奔驰汽车开始运行");
    }
}
