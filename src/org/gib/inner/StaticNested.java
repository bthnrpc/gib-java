package org.gib.inner;

public class StaticNested {

    private static String degisken = "a";

    public StaticNested(){

    }

    // static bir üyeden hiçbir farkı yok
    public static class Inner{

        public static void yazdir(){
            System.out.println(degisken);
        }
    }
}
