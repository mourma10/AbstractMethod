package com.franchise.pizzafranchise;

import com.franchise.fabriquefranchise.FabriqueIngredientAmericain;
import com.franchise.fabriquefranchise.FabriqueIngredientItalien;
import com.pizzeria.FabriqueIngredient;
import com.pizzeria.Pizza;

/**
 * Created by mamour on 10/06/16
 * 12:56.
 */
public class PizzaFruitDeMer extends Pizza {
    public PizzaFruitDeMer(FabriqueIngredient f) {
        super(f);
        if (fabriqueIngredient instanceof FabriqueIngredientAmericain)
            System.out.println("Pizza Fruit De Mer Americain\n");
        else if (fabriqueIngredient instanceof FabriqueIngredientItalien)
            System.out.println("Pizza Fruit De Mer Italien\n");
    }

    public void preparer() {
        if (fabriqueIngredient instanceof FabriqueIngredientItalien)
            System.out.println("Preparation de Pizza Fruit De Mer Italien");
        else if (fabriqueIngredient instanceof FabriqueIngredientAmericain)
            System.out.println("Preparation de Pizza Fruit De Mer Americain");
        System.out.print("Pate: ");
        patePizza = fabriqueIngredient.creerPate("Fruit De Mer");
        System.out.print("Sauce: ");
        saucePizza = fabriqueIngredient.creerSauce("Fruit De Mer");
    }

    public void emballer() {
        if (fabriqueIngredient instanceof FabriqueIngredientAmericain)
            System.out.println("Emballage de Pizza Fruit De Mer Americain");
        else if (fabriqueIngredient instanceof FabriqueIngredientItalien)
            System.out.println("Emballage de Pizza Fruit De Mer Italien");
    }
}
