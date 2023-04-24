package exo_boucles;

import java.util.Scanner;

public class exo3 {

    public static void main(String[] args) {
        int nombre;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez un nombre");
        nombre = scanner.nextInt();

     /*   for(int i = 0; i <= nombre; i++) {
            if(i %2 == 0) {
                System.out.println(i);
            }

        }*/

        int i = 0;
        while(i <= nombre) {
            if (i % 2 == 0) {
                System.out.println(i);

            }
            i++;
        }
    }
}
