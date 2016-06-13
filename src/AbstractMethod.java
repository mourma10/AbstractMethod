/**
 * @author mamour
 */

import com.franchise.PizzeriaAmericaine;
import com.franchise.PizzeriaItalienne;
import com.pizzeria.Pizzeria;

import java.util.Scanner;

class AbstractMethod {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte choix;
        do {
            System.out.println("\n-----------------------------------------");
            System.out.println("                 BIENVENUE               ");
            System.out.println("\n      Veuillez choisir une Franchise      \n");
            System.out.print("            1 - Pizzeria Italienne           \n" +
                    "            2 - Pizzeria Americaine                  \n" +
                    "            0 - Quitter                              \n");
            System.out.println("\n-----------------------------------------");
            System.out.print("Choix : ");
            choix = sc.nextByte();
            Pizzeria p;
            switch (choix) {
                case 1:
                    p = new PizzeriaItalienne();
                    p.commanderPizza();
                    break;
                case 2:
                    p = new PizzeriaAmericaine();
                    p.commanderPizza();
                    break;
            }
        } while (choix != 0);
    }
}