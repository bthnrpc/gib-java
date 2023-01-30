package org.gib;

public abstract class Root1 extends Root2 {

    public String a="a",b,c;

    public String d;


    {
        b = "b";
        d = "d";
        System.out.println(d+"Root1");
    }

    public static String f;

    static {
        f = "froot1";
        System.out.println(f);
    }

    public Root1(String a){

    }





}
