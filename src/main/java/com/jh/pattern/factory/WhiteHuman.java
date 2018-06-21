package com.jh.pattern.factory;

import com.jh.pattern.factory.inter.Human;

public class WhiteHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("white humans skins are white");
    }

    @Override
    public void talk() {
        System.out.println("white human speaks english!");
    }
}
