package com.java.basic.genericity;

import java.util.ArrayList;
import java.util.List;

/**
 * id001
 * 2018年06月22日  16：58
 */
public class Test {

    public static void main(String[] args) {
        Box<Integer> interBox = new Box<Integer>();
        Box<String> stringBox = new Box<String>();

        Box1<String,String ,Integer> box1 = new Box1<>("a","b",4);
        Box1<String,String ,Integer> box2 = new Box1<>("a","b",4);

    }

    public static <K,V,M> boolean compare(Box1<K,V,M> box1,Box1<K,V,M> box2){
        return box1.getK().equals(box2.getK()) && box1.getV().equals(box2.getV()) && box1.getM().equals(box2.getM());
    }



}