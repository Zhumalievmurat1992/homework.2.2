package com.company;

public class Mers extends Car{

    private double obem;

    public Mers(String name,  double obem) {
        super(name);
        this.obem = obem;
    }

    public double getObem() {
        return obem;
    }


    @Override
    public void print() {

            System.out.println(getName()+" obem - "+ getObem());

    }
}
