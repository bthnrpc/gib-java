package org.gib;

import java.util.Objects;

public class Araba extends Tasit {

    private String marka;
    private String model;
    private int maxHiz;
    private int yil;

    public int a;

    public Araba(){

    }

    public Araba(String marka){
        this.marka = marka;
    }


    public void overMethod1(){

        System.out.println("Araba methodu çalıştı");
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaxHiz() {
        return maxHiz;
    }

    public void setMaxHiz(int maxHiz) {
        this.maxHiz = maxHiz;
    }

    public int getYil() {
        return yil;
    }

    public void setYil(int yil) {
        this.yil = yil;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Araba araba = (Araba) o;
        return maxHiz == araba.maxHiz ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(marka, model, maxHiz, yil);
    }
}
