package ExoSalariePolymorphisme;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

       Directeur fays = new Directeur("fays");  //le premier mot (Directeur) c'est le type de la variable(Pierre) ensuite le new Directeur ("Pierre") ceci est le constructeur
       Salarie Pierre = new Chef("Pierre");
       Ouvrier toto = new Ouvrier("toto");


       /* System.out.println(Pierre);*/ // si  je n'avais pas utilisé la m"thode toString il y aurait eu le H code qui se serais affiché !


        //je déclare un tableau polymorphique qui s'appel (Salaries) et qui est vide pour le moment en utilisant le constructeur avec la syntaxe qui est la sienne
        ArrayList<Salarie> tableauSalaries = new ArrayList<>();


        //je rempli mon tableau avec 3 salariés.
        tableauSalaries.add(fays);
        tableauSalaries.add(Pierre);
        tableauSalaries.add(toto);



        /*La variable salarie du type Salarie parcour le tableau qui s'appel tableauSalaries en suite on va appeler la méthode afficherSalaire()
          de chaque salarié (directeur, chef, et ouvrier) !!! (les deux points (:) veulent dire dans le )
         */
        for(Salarie salarie : tableauSalaries)
        {
            salarie.afficherSalaire();
        }

//*******************************************************************RESUME POLYMORPHISME******************************************************************
        /*   Le polymorphisme comme sont nom l'indique peut prendre plusieurs forme c'est a dire :
        -1/  Un objet peut prendre plusieurs types soit la classe de l'objet ou la classe mère exemple :
             l'objet Pierre peut prendre deux formes (Chef ou Salarie) car Chef(class) hérite de
             Salarie qui est la classe mère.

             Dans notre exemple on a appliqué la méthode afficherSalaire() a tous les objet qu'on a mis dans le tableau qui on pas  le même type
             c'est a dire par exemple : fays a le type Directeur, Pierre a la type Chef mais dans la boucle on a aplliquer la méthode afficherSalaire() a des éléménts
             du tableau.
             Si on avaient pas utiliser le polymorphisme on aurait du créer un tableau pour le chef un pour le directeur et un pour l'ouvrier
             et ont auraient du parcourir les trois avec 3 boucles alors que la une boucle suffit pour parcourir l'ensemble des
             Salaries qui prennent la forme de directeur, chef, ou ouvrier

         */

    }
}
