package com.supermarket;

public class Customer {
   //Opdracht 3
    public ShoppingCart winkelwagen;
    public Basket mandje;
    //Opdracht 4
    public String name;
    //No arguments constructor
    //applicatie werkt nog, omdat er nu slechts een override van de default constructor plaats vindt
    // en name van het type String is niet gekoppeld aan Customer, omdat het (nog) niet geïnstantieerd is
    //
    public Customer(String name){
        this.name = name;
        this.mandje = new Basket("handvat mandje");
        System.out.println(mandje.handvat);

    }


    //

}
