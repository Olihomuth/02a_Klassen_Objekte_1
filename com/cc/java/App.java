package com.cc.java;

public class App {
    
    public static void main(String[] args) {

        // System.out.println(new Cat());

        // Instanziierung
        // cat = Referenzvariable
        // Cat = Referenztyp

        // Instanziierung + Wertzuweisung
        Cat cat = new Cat("Grizabella", "white", 29);
        // output("Blick von aussen: " + cat);
        // output("Blick von Innen: " + cat.getInstanceVariable());
        // cat.tellYourAdress();

        output(cat.getFirstName());
        output(cat.getFurColor());
        output(Integer.toString(cat.getAge()));  // Explizite Typumwandlung


        output("------------------");

        Cat cat2 = new Cat("Alonzo", "grey", 35);
        // output("Blick von aussen: " + cat2);
        // output("Blick von Innen: " + cat2.getInstanceVariable());
        // output("------------------");


        output(cat2.getFirstName());
        output(cat2.getFurColor());
        output(Integer.toString(cat2.getAge()));

        output("------------------");

        cat2.setAge(36);
        output(Integer.toString(cat2.getAge()));

    }


    // statische Methode
    public static void output(String outputStr){
        System.out.println(outputStr);
    }



}

