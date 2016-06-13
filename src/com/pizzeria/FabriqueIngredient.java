/**
 * @author mamour
 */

package com.pizzeria;

public interface FabriqueIngredient {
    Pate creerPate(String type);

    Sauce creerSauce(String type);
}
