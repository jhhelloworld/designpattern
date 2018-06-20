package com.jh.pattern.singleton;

public class Singleton {
    public static final Singleton singleton = new Singleton();

    private Singleton(){}

    public static Singleton getSingleton(){
        return singleton;
    }

    public static void doSomething(){

    }
}
