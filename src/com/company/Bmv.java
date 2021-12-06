package com.company;

public class Bmv extends Car{
    private String color;
    private int yers;

    public Bmv(String name, String color, int yers) {
        super(name);
        this.color = color;
        this.yers = yers;
    }

    public String getColor() {
        return color;
    }

    public int getYers() {
        return yers;
    }

    @Override
    public void print() {
        System.out.println(getName()+getColor()+getYers());
    }
}
