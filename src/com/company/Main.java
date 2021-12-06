package com.company;



public class Main {

    public static void main(String[] args) {
        creatObject("mers").print();
        creatObject("bmv").print();
        creatObject("audi").print();
        Printable [] name=new Printable[2];

    }

    public static Printable creatObject(String Car) {
        Printable printable = null;

        switch (Car) {
            case "mers":
                printable = new Mers("MERS", 2.4);
                break;
            case "bmv":
                printable = new Bmv("BMV"," red ", 2019);
                break;
            case "audi":

                printable = new Audi("AUDI"," cupe", " x5");
                break;

        }
        return printable;


    }
}
