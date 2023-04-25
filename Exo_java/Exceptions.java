package Exo_java;
import java.util.*;

import java.util.Scanner;

public class Exceptions {

    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

      try
      {
          System.out.println("Année de naissance : ");
          int yearOfBirth = sc.nextInt();
          System.out.println(yearOfBirth);
      }
      catch(InputMismatchException exception)
      {
          System.out.println("La date de naissance est invalide. ");
          /*exception.printStackTrace();     pemet d'afficher la liste des problemes et permet de cibler plus précisement d'ou vient le problème afin de pouvoir le résoudre*/
      }

      finally
      {
          System.out.println("ok");
      }
    }
}
