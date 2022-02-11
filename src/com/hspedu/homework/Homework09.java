package com.hspedu.homework;

public class Homework09 {
    public static void main(String[] args) {
        LabeledPoint black = new LabeledPoint("Black", 1980, 256.32);
    }
}

class Point {
    private double x;
    private double y;

    public Point() {
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
}

class LabeledPoint extends Point {
//    属性
    private String label;

    public LabeledPoint(String label, double x, double y) {
        super(x, y);
        this.label = label;
    }
    //    方法
}
