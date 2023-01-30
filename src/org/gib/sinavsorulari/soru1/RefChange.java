package org.gib.sinavsorulari.soru1;

import org.gib.Araba;

public class RefChange {

    public void refdegistir(Araba araba){
        araba.setMaxHiz(230);
        araba = new Araba();
        araba.setMaxHiz(250);
    }
}
