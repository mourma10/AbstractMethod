/**
 * @author mamour
 */

package com.franchise.fabriquefranchise;

import com.franchise.patefranchise.PateFine;
import com.franchise.patefranchise.PateSoufflee;
import com.franchise.saucefranchise.SauceEpinard;
import com.franchise.saucefranchise.SauceMarina;
import com.pizzeria.FabriqueIngredient;
import com.pizzeria.Pate;
import com.pizzeria.Sauce;


public class FabriqueIngredientAmericain implements FabriqueIngredient {
    public Pate creerPate(String type) {
        Pate pate;
        switch (type) {
            case "Fromage":
                pate = new PateFine();
                break;
            case "Poivron":
                pate = new PateSoufflee();
                break;
            case "Fruit De Mer":
                pate = new PateSoufflee();
                break;
            default:
                throw new RuntimeException("Pate non disponible");
        }
        return pate;
    }

    public Sauce creerSauce(String type) {
        Sauce sauce;
        switch (type) {
            case "Fromage":
                sauce = new SauceMarina();
                break;
            case "Poivron":
                sauce = new SauceEpinard();
                break;
            case "Fruit De Mer":
                sauce = new SauceMarina();
                break;
            default:
                throw new RuntimeException("Pate non disponible");
        }
        return sauce;
    }
}

