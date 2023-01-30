package org.gib.exception;

public class ExcpOrnek {

    public void method1(){
        int a = 8;
        int b = 0;
        try{
            int c = a/b;
        }catch (ArithmeticException e){
            System.out.println("Yakaldık");
        }

        System.out.println("Rest of the program");

    }
}
