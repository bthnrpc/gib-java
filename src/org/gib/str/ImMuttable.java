package org.gib.str;

import org.gib.Araba;

public class ImMuttable {



    public void method1(){

        // Immutable
        String s1 = "First";
        String s2 = s1;
        s2 = "Second";
        System.out.println(" s1 : "+s1);
        System.out.println(" s2 : "+s2);

        // Mutable
        StringBuilder s3 = new StringBuilder("Third");
        StringBuilder s4 = s3;
        s4.append("-Fourth");
        System.out.println(" s3 : "+s3);
        System.out.println(" s4 : "+s4);

        // Ref
        Araba araba = new Araba();
        araba = new Araba();
        araba.setMarka("Ford");
        ImMutable2 imMutable2 = new ImMutable2();
        imMutable2.degistir(araba);
        System.out.println(" araba markası : "+araba.getMarka());
    }
}
