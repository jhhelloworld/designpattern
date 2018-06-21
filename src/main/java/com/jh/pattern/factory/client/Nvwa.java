package com.jh.pattern.factory.client;

import com.jh.pattern.factory.BlackHuman;
import com.jh.pattern.factory.HumanFactory;
import com.jh.pattern.factory.YellowHuman;
import com.jh.pattern.factory.inter.AbstractHumanFactory;
import com.jh.pattern.factory.inter.Human;

public class Nvwa {
    public static void main(String[] args) {
        AbstractHumanFactory nvma = new HumanFactory();
        Human yellowHuman = nvma.createHuman(YellowHuman.class);
        yellowHuman.getColor();
        yellowHuman.talk();
        System.out.println("-----------------------------------");
        Human blackHuman = nvma.createHuman(BlackHuman.class);
        blackHuman.getColor();
        blackHuman.talk();
    }
}
