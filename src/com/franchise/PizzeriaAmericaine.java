/**
 * @author mamour
 */

package com.franchise;

import com.franchise.fabriquefranchise.FabriqueIngredientAmericain;
import com.franchise.pizzafranchise.PizzaFromage;
import com.franchise.pizzafranchise.PizzaFruitDeMer;
import com.franchise.pizzafranchise.PizzaPoivron;
import com.pizzeria.FabriqueIngredient;
import com.pizzeria.Pizza;
import com.pizzeria.Pizzeria;

public class PizzeriaAmericaine extends Pizzeria {
    public PizzeriaAmericaine() {
        super();
        System.out.println("Pizzeria Americaine : " + this.hashCode());
    }

    protected Pizza creerPizza(String type) {
        Pizza pizza = null;
        FabriqueIngredient fabriqueIngredientAmericain = new FabriqueIngredientAmericain();
        switch (type) {
            case "Fromage":
                pizza = new PizzaFromage(fabriqueIngredientAmericain);
                break;
            case "Poivron":
                pizza = new PizzaPoivron(fabriqueIngredientAmericain);
                break;
            case "Fruit De Mer":
                pizza = new PizzaFruitDeMer(fabriqueIngredientAmericain);
                break;
        }
        return pizza;
    }

    protected String[] setListPizza() {
        listPizza[0] = "Fromage";
        listPizza[1] = "Poivron";
        listPizza[2] = "Fruit De Mer";
        nbPizza = 3;
        return listPizza;
    }
}
