package org.gib.str;

public class Boxing {

    public void method1(){

//        int a = 1;
//        int b = 1;
//        a++;
//        b++;
//        System.out.println(a == b);

        // unboxing
//        Integer a = Integer.valueOf(1);
//        Integer b = 1;
//        a++;
//        b++;
//        System.out.println(a == b);


        Integer a = Integer.valueOf(128);
        Integer b = Integer.valueOf(128);
        System.out.println(a == b);

        // autoboxing
        int s7 = 1;
        Integer s8 = s7;

    }
}
