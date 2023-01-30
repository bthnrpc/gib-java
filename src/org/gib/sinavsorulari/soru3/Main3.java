package org.gib.sinavsorulari.soru3;

public class Main3 {

    public static void main(String[] args) {

        String s1 = "gib";
        String s2 = "gib"+"egitim";
        s1 += "egitim";
        String s3 = "gibegitim";
        char[] s4 = s2.toCharArray();


        if(s1.equals(s2)){
            if(s1 != s3){
                int j = 0;
                for (int i = s4.length-1; i > -1; i--) {
                    if(s2.charAt(j) == s4[i]){
                        System.out.print(s4[i]);
                        //j = i;
                    }else{
                        i--;
                        ++j;
                    }
                    j++;
                }
            }else{
                int k = 0;
                while (true){
                    if(s4[k] == 'm'){
                        break;
                    }
                    System.out.print(s4[k]);
                    ++k;
                }
            }
        }

    }
}
