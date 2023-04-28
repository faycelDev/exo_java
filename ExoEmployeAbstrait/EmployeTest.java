package ExoEmployeAbstrait;

import java.util.ArrayList;

public class EmployeTest {

    public static void main(String[] args) {

        Ouvrier ouvrier = new Ouvrier("12358", "Sylvain","Andre", "20.12.1989", 2000.57,2012);
        Cadre cadre = new Cadre("1414", "louis","dupont","10.10.1974", 2487.8, 2 );
        Patron patron = new Patron("0000", "loulou","doudou","21.07.1970", 6587.31, 10);

        System.out.println(ouvrier);
        ouvrier.salaireOuvrier(2014, 2500);

        System.out.println(cadre);
        cadre.salaireCadre(4);

        System.out.println(patron);
        patron.salairePatron(20);

        ArrayList<Employe> employes = new ArrayList();

        employes.add(ouvrier);
        employes.add(cadre);
        employes.add(patron);

        for(Employe employe : employes)
        {
            System.out.println(employe);
        }





    }
}
