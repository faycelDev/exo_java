package exo_boucles;

import java.util.Scanner;

public class Exo2 {
    public static void main(String[] args) {
        int chiffr = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez un nombre : ");
        chiffr = scanner.nextInt();


       /* for(int i = chiffr; i >= 1; i--) {
            System.out.println(i);*/
        int i = chiffr; //initialisation
        while(i >= 1){  //condition
            System.out.println(i);

            i--; //décrémentation


        }
    }
}
