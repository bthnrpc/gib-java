package org.gib.sinavsorulari.soru5;

public class SinavExcpOrnek {

    public void method1(){

        int a = 3;
        try{
            if(a == 0){
                throw new NullPointerException();
            }else if(a == 1){
                throw new IndexOutOfBoundsException();
            }else if(a == 2){
                throw new ClassCastException();
            }else if(a == 3){
                throw new ArithmeticException();
            }
            System.out.println("Rest of the try block");
        }catch (NullPointerException e){
            System.out.println("Null Pointer");
        }catch (IndexOutOfBoundsException e){
            System.out.println("Out of Bound");
        }catch (ClassCastException e){
            System.out.println("Class cast");
        }
        System.out.println("Rest of the program");


    }
}
