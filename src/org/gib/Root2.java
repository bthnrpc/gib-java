package org.gib;

public abstract class Root2 {

    public String a="a",b,c;

    public String d;



    {
        b = "b";
        d = "d";
        System.out.println(d+"Root2");
    }

    public static String f;

    static {
        f = "froot2";
        System.out.println(f);
    }

    public Root2(){
        System.out.println("Ben Root2");
    }


}
