package org.gib.sinavsorulari.soru1;

import org.gib.Araba;

public class ScopeRefChange {

    public void scopeRefDegistir(){
        Araba araba = new Araba();
        araba.setMaxHiz(200);
        RefChange refChange = new RefChange();
        refChange.refdegistir(araba);
        System.out.println(araba.getMaxHiz());
    }


}
