package org.gib.str;

public class PosfixInfix {

    public void method1(){
        int x = 2,y = 0,z = 1;

        //y = x+1;
        //y = x++;


        y = x++ * x++ * ++x;

        //x = ++x * x++ * x++;

        //x = x++;



        System.out.println(" y : "+y );
        System.out.println(" x : "+x );
    }
}
