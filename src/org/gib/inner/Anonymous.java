package org.gib.inner;

// Class implementi
// Interface implementi

// Immediately create class

import org.gib.Araba;
import org.gib.Spec1;
import org.gib.Spec2;

public class Anonymous {

    public Araba araba = new Araba(){

        public void overMethod1(){
            System.out.println("Anonymous methodu çalıştı");
        }

    };

    public Spec1 spec1 = new Spec1() {

    };

    public Spec2 spec2 = new Spec2() {
        @Override
        public void deneme() {

        }
    };

    public Spec2 spec22 = () -> {};

    public void yazdir(){
        araba.overMethod1();;
    }

}
