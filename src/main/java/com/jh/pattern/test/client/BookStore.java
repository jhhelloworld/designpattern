package com.jh.pattern.test.client;

import com.jh.pattern.test.complete.NovelBook;
import com.jh.pattern.test.complete.OffNovelBook;
import com.jh.pattern.test.inter.Ibook;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

public class BookStore {
    public final static ArrayList<Ibook> bookList= new ArrayList<Ibook>();
    static {
        bookList.add(new OffNovelBook("a",1200,"@"));
        bookList.add(new OffNovelBook("b",1300,"#"));
        bookList.add(new OffNovelBook("c",1400,"$"));
        bookList.add(new OffNovelBook("d",1500,"%"));
    }

    public static void main(String[] args) {
        NumberFormat format =  NumberFormat.getCurrencyInstance();
        format.setMaximumFractionDigits(2);
        System.out.println("-----------------卖出书籍如下----------------");
        for (Ibook ibook:bookList){
            System.out.println("书籍名称："+ibook.getName()+"\t书籍作者："+ibook.getAuther()+"\t书籍价格："+format.format(ibook.getPrice()/100.0)+"元");
        }

    }


}
