/**
 * @author mamour
 */

package com.franchise.pizzafranchise;

import com.franchise.fabriquefranchise.FabriqueIngredientAmericain;
import com.franchise.fabriquefranchise.FabriqueIngredientItalien;
import com.pizzeria.FabriqueIngredient;
import com.pizzeria.Pizza;

public class PizzaFromage extends Pizza {
    public PizzaFromage(FabriqueIngredient f) {
        super(f);
        if (fabriqueIngredient instanceof FabriqueIngredientAmericain)
            System.out.println("Pizza Fromage Americain\n");
        else if (fabriqueIngredient instanceof FabriqueIngredientItalien)
            System.out.println("Pizza Fromage Italien\n");
    }

    public void preparer() {
        if (fabriqueIngredient instanceof FabriqueIngredientItalien)
            System.out.println("Preparation de Pizza Fromage Italien");
        else if (fabriqueIngredient instanceof FabriqueIngredientAmericain)
            System.out.println("Preparation de Pizza Fromage Americain");
        System.out.print("Pate: ");
        patePizza = fabriqueIngredient.creerPate("Fromage");
        System.out.print("Sauce: ");
        saucePizza = fabriqueIngredient.creerSauce("Fromage");
    }

    public void emballer() {
        if (fabriqueIngredient instanceof FabriqueIngredientAmericain)
            System.out.println("Emballage de Pizza Fromage Americain");
        else if (fabriqueIngredient instanceof FabriqueIngredientItalien)
            System.out.println("Emballage de Pizza Fromage Italien");
    }
}

