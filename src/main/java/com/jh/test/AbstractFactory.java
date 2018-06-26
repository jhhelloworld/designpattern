package com.jh.test;

/**
 * @author id001
 * 2018年06月25日  19：39
 */
public abstract class AbstractFactory {
    public abstract <T extends AbstractProduct> T createProduct (Class<T> c);
}