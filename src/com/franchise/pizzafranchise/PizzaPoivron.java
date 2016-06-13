/**
 * @author mamour
 */

package com.franchise.pizzafranchise;

import com.franchise.fabriquefranchise.FabriqueIngredientAmericain;
import com.franchise.fabriquefranchise.FabriqueIngredientItalien;
import com.pizzeria.FabriqueIngredient;
import com.pizzeria.Pizza;

public class PizzaPoivron extends Pizza {
    public PizzaPoivron(FabriqueIngredient f) {
        super();
        fabriqueIngredient = f;
        if (fabriqueIngredient instanceof FabriqueIngredientAmericain)
            System.out.println("Pizza Poivron Americain\n");
        else if (fabriqueIngredient instanceof FabriqueIngredientItalien)
            System.out.println("Pizza Poivron Italien\n");
    }

    public void preparer() {
        if (fabriqueIngredient instanceof FabriqueIngredientItalien)
            System.out.println("Preparation de Pizza Poivron Italien");
        else if (fabriqueIngredient instanceof FabriqueIngredientAmericain)
            System.out.println("Preparation de Pizza Poivron Americain");
        System.out.print("Pate: ");
        patePizza = fabriqueIngredient.creerPate("Poivron");
        System.out.print("Sauce: ");
        saucePizza = fabriqueIngredient.creerSauce("Poivron");
    }

    public void emballer() {
        if (fabriqueIngredient instanceof FabriqueIngredientAmericain)
            System.out.println("Emballage de Pizza Poivron Americain");
        else if (fabriqueIngredient instanceof FabriqueIngredientItalien)
            System.out.println("Emballage de Pizza Poivron Italien");
    }
}


