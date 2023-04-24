package exo_boucles;

import java.util.Scanner;

public class Exo1 {
    public static void main(String[] args) {
        int chiffr = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez un chiffre : ");
        chiffr = scanner.nextInt();

      /*  for(int i = 1; i <= chiffr; i++) {
            System.out.println(i);
        }*/
        int i = 0;
        while(i < chiffr)
        {
            i++;

            System.out.println(i);
        }
        
    }
    
}
