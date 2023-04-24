package Exo_java;

import java.util.Scanner;

public class Exo1Tableau {
    public static void main(String[] args) {
        int number = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("saisir le nombre d'éléments : ");
        number = scanner.nextInt();

        int[] tableau = new int[number];
        System.out.println("entrez les chiffre par element : ");
        for(int i = 0; i < number; i++){
            tableau[i]= scanner.nextInt();
        }
        System.out.println("les elements saisi dans le tableau sont :");
        for(int i = 0; i < number; i++) {

            if(tableau[i] < 0) {
                System.out.println(tableau[i]);
            }else{

            }
        }

    }


    }
























