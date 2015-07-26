package com.trofimenkod.lesson3.task1;

/**
 * Created by USR on 26.07.2015.
 */
public class Rectangle extends Shape {
    private  Point a,b,c;

    public Rectangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Point getA() {
        return a;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public Point getB() {
        return b;
    }

    public void setB(Point b) {
        this.b = b;
    }

    public Point getC() {
        return c;
    }

    public void setC(Point c) {
        this.c = c;
    }

    @Override
    public double perimeter() {
        return (this.a.calcDistance(this.b)+this.b.calcDistance(this.c))*2;
    }

    @Override
    public double area() {
        return this.a.calcDistance(this.b)*this.b.calcDistance(this.c);
    }

    @Override
    public void printResult() {
        System.out.println(this.getClass().getName());
        System.out.println("Perimeter:"+perimeter());
        System.out.println("Area:"+area());

    }
}
