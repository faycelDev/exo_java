import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class exoDuSoir {
    public static void main(String[] args) {
        int[] tab = {5, 4, 10, 6};
        int result = maxNumber(tab);
        System.out.println(result);
        String result2 = palindrome();
        System.out.println(result2);

        String resultat = multiples(3);
        System.out.println(resultat);
        String resultat2 = multiples(5);
        System.out.println(resultat);

        String result3 = positifOrNegatifPairOrImpair(1000);
        System.out.println(result3);

        String result4 = CarreOrNo(6, 5);
        System.out.println(result4);

        int result5 = calculPerimetreRectangle(10, 20);
        System.out.println("le périmetre est de : " + result5 + " cm ");

        String[] tableau = {"jean", "pierre", "paul"};
        String result6 = toUppercaseCase(tableau);
        System.out.println("Le deuxième prenom qui est : " + result6 + " s'affiche en capital");


        String resultat8 = boucleWhile("fays");
        System.out.println(resultat8);

        convertisseurTemperature();
        System.out.println();

        table();
        System.out.println();


    }

    public static int maxNumber(int[] tab) {

        int maxNum = tab[0];
        for (int j : tab) {
            if (j > maxNum) {
                maxNum = j;
            }
        }
        return maxNum;
    }


    public static String palindrome() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez une chaine de caractère : ");
        String str = scanner.nextLine();
        int start = 0;
        int end = str.length() - 1;
        boolean isPalindrome = true;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return "ce n'est pas un palindrome";

            }
            start++;
            end--;
        }
        if (isPalindrome) {
            return "c'est un palindrome";
        } else {
            return "ce n'est pas un palindrome";

        }

    }

    public static String multiples(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return "fizzbuzz";
        } else if (number % 3 == 0) {
            return "fizz";
        } else if (number % 5 == 0) {
            return "buzz";
        } else {
            return String.valueOf(number);
        }
    }

    public static String positifOrNegatifPairOrImpair(int chiffre) {

        if (chiffre % 2 == 0 && chiffre > 0) {
            return "le chiffre est pair et positif";
        } else if (chiffre % 2 != 0 && chiffre < 0) {
            return "le chiffre est impair et negatif";
        } else if (chiffre % 2 == 0 && chiffre < 0) {
            return "le chiffre est pair et negatif";
        } else {
            return "le chiffre est impair et positif";
        }


    }

    public static String CarreOrNo(int longeur, int largeur) {

        if (longeur == largeur) {
            return "ceci est un carré";
        } else if (longeur != largeur) {
            return "ce n'est pas un carré";
        } else {
            return "merci aurevoir";
        }


    }

    public static int calculPerimetreRectangle(int cote1, int cote2) {
        return (cote1 + cote2) * 2;
    }

    public static String toUppercaseCase(String[] tableau) {
        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = tableau[i].toUpperCase();
        }
        return tableau[1] = tableau[1].toUpperCase();

    }

    public static String boucleWhile(String prenom) {
        Scanner scanner = new Scanner(System.in);
        char reponse = 'O';
        Scanner sc = new Scanner(System.in);
        while (reponse == 'O') {

            System.out.println("donnez votre prenom : ");
            prenom = scanner.nextLine();
            System.out.println("Bonjour " + prenom + " comment vas-tu ?");
            reponse = ' ';
            while (reponse != 'O' && reponse != 'N') {
                System.out.println("Voulez vous réessayer ? (O/N) ");
                reponse = scanner.nextLine().charAt(0);

            }

        }
        return "ok merci au revoir " + prenom;
    }


    public static void convertisseurTemperature() {
        Scanner scanner = new Scanner(System.in);
        String choix;
        char reponse = 'O';
        double temperature = 0;
        Scanner sc = new Scanner(System.in);
        while (reponse == 'O') {

            System.out.println("voulez vous convertir degres Celsius ou Fahreinheit ?  : (C/F)");
            choix = scanner.nextLine().toUpperCase();

            if (choix.equals("C")) {
                System.out.println("Entrez la température a convertir en degre celsius : ");
                temperature = scanner.nextDouble();
                double result = (temperature * 9 / 5) + 32;
                System.out.println(temperature + "degrées Celsius equivalent a : " + result + " degrés Fahrenheit");

            } else if (choix.equals("F")) {
                System.out.println("Entrez la température en degrés Fahrenheit");
                temperature = scanner.nextDouble();
                double result = (temperature - 32) * 5 / 9;
                System.out.println(temperature + "degrées Fahreineit equivalent a : " + result + " degrés Celsius");
            }

            System.out.println("voulez vous reessayer ? (O/N)");
            reponse = sc.nextLine().charAt(0);

        }
    }

    public static void table() {
        char tableau[] = {'a', 'b', 'c', 'd', 'e'};
        int i = 0, emplacement = 0;
        char reponse = ' ', carac = ' ';
        Scanner sc = new Scanner(System.in);
        do {
            i = 0;
            System.out.println("Rentrez une lettre en minuscule svp");

            carac = sc.nextLine().charAt(0);
            while (i < tableau.length && carac != tableau[i])
                i++;
            if (i < tableau.length) {
                System.out.println("la lettre " + carac + " se trouve bien dans ce tableau");
            } else {
                System.out.println("la lettre " + carac + " ne se trouve pas dans ce tableau");
            }
            while (i >= tableau.length) ;
            do {
                System.out.println("Voulez vous essayer a nouveau ? (O/N)");
                reponse = sc.nextLine().charAt(0);
            } while (reponse != 'N' && reponse != 'O');
        } while (reponse == 'O');

        System.out.println("Au revoir");

    }

}








































































