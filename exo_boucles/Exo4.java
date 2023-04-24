package exo_boucles;

import java.util.Scanner;

public class Exo4 {
    public static void main(String[] args) {
        int nombre;
        int somme = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("saisir un nombre : ");
        nombre = scanner.nextInt();
/*
        for(int i = 0; i <= nombre; i++){
            somme += i;

        }
        System.out.println(somme);*/

        int i = 0;
        while(i <= nombre) {
            somme += i;

            i++;
        }
        System.out.println(somme);
    }
}
