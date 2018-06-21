package com.jh.pattern.factory;

import com.jh.pattern.factory.inter.Human;


public class BlackHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("Black humans skins are black");
    }

    @Override
    public void talk() {
        System.out.println("Black human likes rap!");
    }
}
