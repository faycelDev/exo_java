package Exo_java;

import java.util.Scanner;

public class Exo_tableau_min_max {
    public static void main(String[] args) {
        int nombre = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Combien y at-il d'élément dans le tableau ? : ");
        nombre = scanner.nextInt();
        int[] tableau = new int[nombre];

        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = scanner.nextInt();
        }
        int max = tableau[0];
        int min = tableau[0];


        for (int i = 0; i < tableau.length; i++) {
            if (max < tableau[i]) {
                max = tableau[i];
            }
            if (min > tableau[i]) {
                min = tableau[i];
            }

        }
        System.out.println("le min est : " + min);
        System.out.println("le max est : " + max);

        pairImpairTab();
        valeurdansTableauOuPas();

    }

    public static void pairImpairTab() {
        int nombre = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("saisissez le nombre d'élément dans le tableau : ");
        nombre = scanner.nextInt();
        int[] tableau = new int[nombre];

        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = scanner.nextInt();
        }


        int pair = 0;
        int impair = 0;

        for (int i = 0; i < tableau.length; i++) {
            if (tableau[i] % 2 == 0) {
                pair = pair + 1;
            } else {
                impair = impair + 1;
            }
        }
        System.out.println("les nombres pairs sont : " + pair);
        System.out.println("les nombres impairs sont : " + impair);

    }

    public static void valeurdansTableauOuPas() {

        while (true) {
            int valeur = 0;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Entrez une valeur : ");
            valeur = scanner.nextInt();
            int[] tableau = {10, 20, 14, 8, 7, 6};

            boolean chiffrePresent = false;

            for (int i = 0; i < tableau.length; i++) {
                if (valeur == tableau[i]) {

                    chiffrePresent = true;

                }

            }
            if (chiffrePresent) {
                System.out.println("la valeur " + valeur + " se trouve bien dans le tableau");
            } else {
                System.out.println("la valeur " + valeur + " ne se trouve pas dans le tableau");
            }

            System.out.println("voulez vous faire un autre essai : (O/n)");
            String reponse = scanner.nextLine();

            if(reponse.equals("O")){

            }else {
                break;
            }


        }

    }
}
