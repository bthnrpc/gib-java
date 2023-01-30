package org.gib.oop;

import org.gib.Root1;

public class LifeCycle extends Root1 {

    public String a="a",b,c;

    public String d;


    {
        b = "b";
        d = "d";
        System.out.println(d);
    }

    public static String f;

    static {
        f = "f";
        System.out.println(f);
    }

    public LifeCycle(){
        super("");
        String a = "asd";

    }









}
