package com.jh.pattern.test.complete;

import com.jh.pattern.test.inter.Ibook;

public class NovelBook implements Ibook {
    private String name;
    private String auther;
    private int price;


    public NovelBook(String name,int price,String auther) {
        this.name = name;
        this.price = price;
        this.auther = auther;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public String getAuther() {
        return this.auther;
    }


}
