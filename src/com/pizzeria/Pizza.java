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


    /**
     * autre methode pour implementer la methode preparer
     * public void preparer(string type){
     * pate = faabriqueIngrdient.creerPate(type);
     * sauce = fabriqueIngredient.creerSauce(type);
     * }
     */
    public abstract void preparer();

    public abstract void emballer();

}
