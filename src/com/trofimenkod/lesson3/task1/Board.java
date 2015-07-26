package com.trofimenkod.lesson3.task1;

/**
 * Created by USR on 26.07.2015.
 */
public class Board {

    ZeroShape zeroShape=new ZeroShape();
    private Shape[] parts=new Shape[4];

    public Board() {
        for (int i = 0; i <parts.length; i++) {
            this.insertShape(zeroShape,i+1);

        }
    }

    public void insertShape(Shape shape,int partNumber){
        parts[partNumber-1]=shape;
        System.out.println("Part " +partNumber+" filled by " + shape.getClass().getName() );

    }

    public void deleteShape(int partNumber){

        insertShape(zeroShape,partNumber-1);


    }

    public void printInformation(){
        double p=0,s=0;
        for (Shape i: parts){
            i.printResult();
            p=p+i.perimeter();
            s=s+i.area();
        }

        System.out.println("Total perimeter:"+ p);
        System.out.println("Total area:" + s);

    }
}
