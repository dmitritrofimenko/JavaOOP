package com.trofimenkod.lesson3.task1;

/**
 * Created by USR on 26.07.2015.
 */
public class Triangle extends Shape {
    private Point a,b,c;

    public Triangle(Point a, Point b, Point c) {
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
        return this.a.calcDistance(this.b)+this.b.calcDistance(this.c)+this.c.calcDistance(this.a) ;
    }

    @Override
    public double area() {
        double p=perimeter()/2;
        return Math.sqrt(p*(p-this.a.calcDistance(this.b))*(p-this.b.calcDistance(this.c))-(p-this.c.calcDistance(this.a)));
    }

    @Override
    public void printResult() {
        System.out.println(this.getClass().getName());
        System.out.println("Perimeter:"+perimeter());
        System.out.println("Area"+area());

    }
}
