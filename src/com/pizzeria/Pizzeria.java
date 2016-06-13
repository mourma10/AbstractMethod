/**
 * @author mamour
 */

package com.pizzeria;

import java.util.Scanner;

public abstract class Pizzeria {

    protected String[] listPizza = new String[5];
    protected int nbPizza;

    protected Pizzeria() {
        System.out.print("\nConstructeur de : ");
    }


    protected abstract String[] setListPizza();

    public void commanderPizza() {
        setListPizza();
        String choix_;
        do {
            Pizza pizza;
            byte choix;
            System.out.println("   \n Nos Pizzas : \n");
            for (int i = 0; i < nbPizza; i++) {
                System.out.println("              " + (i + 1) + " - " + listPizza[i]);
            }
            Scanner sc = new Scanner(System.in);
            System.out.print("Choix : ");
            choix = sc.nextByte();
            for (int i = 0; i < nbPizza; i++) {
                if (choix == i + 1) {
                    pizza = creerPizza(listPizza[i]);
                    pizza.preparer();
                    pizza.emballer();
                    System.out.println();
                    i = nbPizza;
                }
            }
            Scanner sc1 = new Scanner(System.in);
            System.out.print("Voulez-vous passer une autre commande? O/N : ");
            choix_ = sc1.nextLine();
        } while (choix_.equals("O"));
    }

    protected abstract Pizza creerPizza(String type);
}

