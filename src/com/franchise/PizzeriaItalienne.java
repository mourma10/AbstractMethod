/**
 * @author mamour
 */

package com.franchise;

import com.franchise.fabriquefranchise.FabriqueIngredientItalien;
import com.franchise.pizzafranchise.PizzaFromage;
import com.franchise.pizzafranchise.PizzaPoivron;
import com.pizzeria.FabriqueIngredient;
import com.pizzeria.Pizza;
import com.pizzeria.Pizzeria;

public class PizzeriaItalienne extends Pizzeria {
    public PizzeriaItalienne() {
        super();
        System.out.println("Pizzeria Italienne : " + this.hashCode());
    }

    protected Pizza creerPizza(String type) {
        Pizza pizza = null;
        FabriqueIngredient fabriqueIngredientItalien = new FabriqueIngredientItalien();
        switch (type) {
            case "Fromage":
                pizza = new PizzaFromage(fabriqueIngredientItalien);
                break;
            case "Poivron":
                pizza = new PizzaPoivron(fabriqueIngredientItalien);
                break;
            default:
                System.out.println("Choix non disponible");
        }
        return pizza;
    }

    protected String[] setListPizza() {
        listPizza[0] = "Fromage";
        listPizza[1] = "Poivron";
        nbPizza = 2;
        return listPizza;
    }
}
