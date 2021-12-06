package com.company;

public class Audi extends Car{
    private String type;
    private String model;

    public Audi(String name, String type, String model) {
        super(name);
        this.type = type;
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public String getModel() {
        return model;
    }

    @Override
    public void print() {
        System.out.println(getName()+getModel()+getType());
    }
}
