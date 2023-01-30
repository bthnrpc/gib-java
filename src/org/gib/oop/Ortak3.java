package org.gib.oop;

// RULE 1 -> Class interface e göre önceliklidir
// RULE 2 -> implement olan interfaceler de birbirinini implement ediyorsa sub-interface önceliklidir
// RULE 3 -> Eğer yukarıdaki 2 kural da sağlanmazsa methode concreate class tarafından override edilmelidir

public interface Ortak3  {

    default void ortakMethod(){

        System.out.println("Ortak3");
    }


}
