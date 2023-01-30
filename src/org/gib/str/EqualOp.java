package org.gib.str;

public class EqualOp {

    public void method1(){

        // Fark varmi
//          String s1 = "str";
//          String s2 = "str";
//          //System.out.println(s1 == s2);
//        System.out.println(s1.equals(s2));

//        String s1 = "str";
//        String s2 = s1;
//        System.out.println(s1 == s2);



//        String s1 = "str";
//        String s2 = s1;
        String s0 = "str";
        String s1 = "str"+"str";
        String s2 = s0+"str";
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1 == s2.intern());
        System.out.println(s1.equals(s2));

        String s3 = new String("str");
        String s4 = s3;
        System.out.println(s3 == s4);
    }
}
