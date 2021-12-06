package com.company;



public class Main {

    public static void main(String[] args) {
       /* creatObject("mers").print();
        creatObject("bmv").print();
        creatObject("audi").print();*/
        Printable[] printables ={ creatObject("MERS"),creatObject("BMV"),creatObject("AUDI") };
        for (int i = 0; i < printables.length; i++) {
            printables[i].print();
            
        }


        }



    public static Printable creatObject(String Car) {
        Printable printable = null;

        switch (Car) {
            case "MERS":
                printable  = new Mers("MERS", 2.4);
                break;
            case "BMV":
                printable= new Bmv("BMV"," red ", 2019);
                break;
            case "AUDI":

                printable = new Audi("AUDI"," cupe", " x5");
                break;

        }
        return printable;


    }
}
