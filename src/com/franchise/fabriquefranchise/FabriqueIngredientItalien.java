/**
 * @author mamour
 */

package com.franchise.fabriquefranchise;

import com.franchise.patefranchise.PateSouffleeFine;
import com.franchise.patefranchise.PateTresFine;
import com.franchise.saucefranchise.SauceTomate;
import com.franchise.saucefranchise.SauceTomateCerise;
import com.pizzeria.FabriqueIngredient;
import com.pizzeria.Pate;
import com.pizzeria.Sauce;


public class FabriqueIngredientItalien implements FabriqueIngredient {
    public Pate creerPate(String type) {
        Pate pate = null;
        switch (type) {
            case "Fromage":
                pate = new PateTresFine();
                break;
            case "Poivron":
                pate = new PateSouffleeFine();
                break;
        }
        return pate;
    }

    public Sauce creerSauce(String type) {
        Sauce sauce = null;
        switch (type) {
            case "Fromage":
                sauce = new SauceTomate();
                break;
            case "Poivron":
                sauce = new SauceTomateCerise();
                break;
        }
        return sauce;
    }
}


