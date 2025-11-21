package com.cc.java;

public class App {
    
    public static void main(String[] args) {

        // System.out.println(new Cat());

        // Instanziierung
        // cat = Referenzvariable
        // Cat = Referenztyp

        Cat cat = new Cat();
        output("Blick von aussen: " + cat);
        output("Blick von Innen: " + cat.getInstanceVariable());
        // cat.tellYourAdress();

        cat.firstName = "Grizabella";
        cat.furColor = "white";
        cat.age = 29;



        output(cat.firstName);
        output(cat.furColor);
        output(Integer.toString(cat.age));  // Explizite Typumwandlung





        output("------------------");

        Cat cat2 = new Cat();
        output("Blick von aussen: " + cat2);
        output("Blick von Innen: " + cat2.getInstanceVariable());
        output("------------------");

        cat2.firstName = "Alonzo";
        cat2.furColor = "grey";
        cat2.age = 35;

        output(cat2.firstName);
        output(cat2.furColor);
        output(Integer.toString(cat2.age));

    }


    // statische Methode
    public static void output(String outputStr){
        System.out.println(outputStr);
    }



}

