package org.gib.inner;

public class MethodLocalInner {




    public MethodLocalInner(){

        method(1);
    }



    // local variable ya da parameter final olmalı
    public void method(int num1){

        int num2 = 1;

        // num2++;




        // Sadece default tanımlanabilir (access modifier anlamsız)
        class Inner{

            public int num3 = 0;

            void innermethod(){

                //num1++;
                num3 = num1+num2;
                System.out.println(num1);
                System.out.println(num2);
                System.out.println(num3);

            }

        }

        Inner inner = new Inner();
        inner.innermethod();

    }
}
