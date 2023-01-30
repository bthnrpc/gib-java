package org.gib.str;

import org.gib.Araba;
import org.gib.Tasit;

public class Convertion {

    public void method1(){
        short a = 1;
        short b = a;
        int c =  b;

        Araba araba = new Araba();
        araba.setMarka("Togg");

        // Downcasting
        Tasit tasit = araba;


        // Upcasting
//        Tasit tasit2 = new Tasit();
//        System.out.println(tasit2 instanceof Araba);
//        System.out.println(tasit2 instanceof Tasit);
        //araba = (Araba) tasit2;


//        Tasit tasit3 = new Araba();
//        System.out.println(tasit3 instanceof Araba);
//        araba = (Araba) tasit3;


//        Tasit tasit5 = new Tasit();
//        method2(tasit5);


        Tasit tasit6 = new Araba();
        tasit6.overMethod1();




    }


    public void method2(Tasit tasit){
        if(tasit instanceof Araba){
            Araba araba = (Araba) tasit;
            System.out.println(araba.getMarka());
        }
    }
}
