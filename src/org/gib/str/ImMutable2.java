package org.gib.str;

import org.gib.Araba;

public class ImMutable2 {

    public void degistir(Araba araba2){
        araba2.setMarka("Tesla");
        araba2 = new Araba();

        araba2.setMarka("Togg");
    }
}
