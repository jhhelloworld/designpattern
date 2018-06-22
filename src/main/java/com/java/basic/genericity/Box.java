package com.java.basic.genericity;

/**
 * id001
 * 2018年06月22日  16：56
 */
public class Box<T> {
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}