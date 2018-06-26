package com.jh.test;


/**
 * @author id001
 * 2018年06月25日  19：33
 */
public class ConcreteProduct extends AbstractProduct {
    @Override
    public void doElse() {
        System.out.println("doelse1");
    }
}