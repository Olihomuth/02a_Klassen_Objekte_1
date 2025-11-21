package com.cc.java;

public class Cat {

    public void sayHello(){
        System.out.println("Hello!");
    }


    // this --> Instanzvariable
    public void tellYourAdress(){
        App.output("Blick von Innen " + this);
    }

    public Cat getInstanceVariable(){
        return this;
    }

}
