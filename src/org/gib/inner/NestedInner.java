package org.gib.inner;

public class NestedInner {

    private String degisken = "a";

    public NestedInner(){
        Inner inner = new Inner();
        System.out.println(degisken);
        inner.yazdir();
    }

    // Nested interface de tanımlayabilirsin
    // Access modifier dilediğin gibi kullanabilirsin
    private class Inner{
        public String a;

        public Inner(){
            degisken = "b";

        }

        // static desteği java16 ile geldi
        public void yazdir(){
            System.out.println(degisken);
        }
    }
}
