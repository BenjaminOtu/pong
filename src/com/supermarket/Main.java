package com.supermarket;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Opdracht 2

        Customer benjamin = new Customer("Benjamin");
       // Object mijnObject = new Object();
        //waarom kan in opdracht 2 de toegang tot de lokale Customer variabele, deze variabele niet public zijn?

        //Opdracht 3
        //System.out.println(mijnObject);
        System.out.println(benjamin);
        ShoppingCart benjaminsWinkelwagen = benjamin.winkelwagen;
        //benjamin.toString();
        Basket benjaminsMandje = benjamin.mandje;

        System.out.println(benjaminsWinkelwagen);
        System.out.println(benjaminsMandje);
        System.out.println(benjamin.name);

        System.out.println("dit is mijn mandje " + benjamin.mandje.handvat);






    }
}
