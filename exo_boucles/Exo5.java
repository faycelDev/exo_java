package exo_boucles;

import java.util.Scanner;

public class Exo5 {
    public static void main(String[] args) {
        int nombre;
        int somme = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("siasir nombre d'utilisateur : ");
        nombre = scanner.nextInt();

      /*  for(int i = 0; i <= nombre; i++){
            if(i %2 == 0){
               somme += i;
            }

        }
        System.out.println(somme);*/

        int i = 0;
        while(i <= nombre) {

            if(i %2 == 0){
                somme += i;
            }
            i++;
        }
        System.out.println(somme);

    }
}
