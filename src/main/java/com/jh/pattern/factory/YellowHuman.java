package com.jh.pattern.factory;

import com.jh.pattern.factory.inter.Human;

public class YellowHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("Yellow humans skins are yellow");
    }

    @Override
    public void talk() {
        System.out.println("Yellow humans speak chinese!");
    }
}
