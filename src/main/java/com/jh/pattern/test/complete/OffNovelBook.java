package com.jh.pattern.test.complete;

public class OffNovelBook extends NovelBook {
    public OffNovelBook(String name, int price, String auther) {
        super(name, price, auther);
    }

    @Override
    public int getPrice() {
        int selfPrice =  super.getPrice();
        int offPrice = 0;
        if(selfPrice>4000){
            offPrice = selfPrice*90/100;   //*0.9报错
        }else {
            offPrice = selfPrice*80/100;
        }
        return offPrice;
    }
}
