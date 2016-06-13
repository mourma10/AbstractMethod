/**
 * @author mamour
 */

package com.pizzeria;

public abstract class Pizza {

    protected FabriqueIngredient fabriqueIngredient;
    protected Pate patePizza;
    protected Sauce saucePizza;

    protected Pizza() {
        System.out.print("\nConstructeur de : ");
    }

    public abstract void preparer();

    public abstract void emballer();

}
