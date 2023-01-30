package org.gib.statickeyword;

public class StaticOrnek2 {

    public int deger0 = 0;

    public static int deger1 = 1;

    // const
    public static final int deger2 = 2;


    public StaticOrnek2(){

    }

    public void degistir(){
        System.out.println(deger0);
        System.out.println(deger1);
        System.out.println(deger2);
        deger0++;
        deger1++;
        //deger2++;
    }

    public static void degistirstatik(){
        //System.out.println(deger0);
        System.out.println(deger1);
        System.out.println(deger2);
        //deger0++;
        deger1++;
        //deger2++;
    }
}
