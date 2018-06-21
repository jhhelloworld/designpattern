package com.jh.pattern.factory;

import com.jh.pattern.factory.inter.AbstractHumanFactory;
import com.jh.pattern.factory.inter.Human;

public class HumanFactory extends AbstractHumanFactory {
    @Override
    public <T extends Human> T createHuman(Class<T> c) {
        Human human = null;
        try {
            human = (T)Class.forName(c.getName()).newInstance();
        }catch (Exception e){
            System.out.println("error generate human...");
        }
        return (T)human;
    }
}
