package org.gib.switchcase;

import org.gib.Aylar;

public class CokluIf {

    public enum Day {PAZARTESİ,SALI,ÇARŞAMBA,PERŞEMBE,CUMA,CUMARTESİ,PAZAR};

    public void method1(){
        int degisken = 10;
        Day gun = Day.ÇARŞAMBA;



        switch (degisken){
            case 1:
                System.out.println(degisken);
            case 2:
                System.out.println(degisken);
            case 3:
                System.out.println(degisken);
            default:
                System.out.println("Default");
            case 4:
                System.out.println(degisken);
            case 5:
                System.out.println(degisken);
            case 6:
                System.out.println(degisken);

        }


        switch (gun){
            case PAZARTESİ:
                System.out.println(Day.PAZARTESİ);
            case SALI:
                System.out.println(Day.SALI);
            case ÇARŞAMBA:
                System.out.println(Day.ÇARŞAMBA);
                break;
            case PERŞEMBE:
                System.out.println(Day.PERŞEMBE);
            case CUMA:
                System.out.println(Day.CUMA);
            case CUMARTESİ:
                System.out.println(Day.CUMARTESİ);
            case PAZAR:
                System.out.println(Day.PAZAR);
        }


    }


}
