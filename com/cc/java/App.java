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
        output("------------------");

        Cat cat2 = new Cat();
        output("Blick von aussen: " + cat2);
        output("Blick von Innen: " + cat2.getInstanceVariable());
        output("------------------");
        
    }


    // statische Methode
    public static void output(String outputStr){
        System.out.println(outputStr);
    }



}

