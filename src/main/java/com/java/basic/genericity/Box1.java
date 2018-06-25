package com.java.basic.genericity;

/**
 * 泛型类
 * 2018年06月22日  17：40
 */
public class Box1 <K,V,M> {
    private K k;
    private V v;
    private M m;

    public Box1(K k, V v, M m) {
        this.k = k;
        this.v = v;
        this.m = m;
    }

    //泛型方法
    public static <K,V,M> boolean compare(Box1<K,V,M> box1,Box1<K,V,M> box2){
        return box1.getK().equals(box2.getK()) && box1.getV().equals(box2.getV()) && box1.getM().equals(box2.getM());
    }



    public K getK() {return k; }

    public void setK(K k) {this.k = k; }

    public V getV() { return v; }

    public void setV(V v) { this.v = v; }

    public M getM() { return m; }

    public void setM(M m) { this.m = m; }
}