package exoCompteBancaire;

public class CompteTest {

    public static void main(String[] args) {

        Compte compte = new Compte(0);
        ComptePayant comptePayant = new ComptePayant(0);
        CompteEpargne compteEpargne = new CompteEpargne(0, 6);



         Compte.deposer();
            compte.toString();
        System.out.println(compte);

        compte.retirer();
        compte.toString();
        System.out.println(compte);





        CompteEpargne.deposer();
        compteEpargne.toString();
        System.out.println(compteEpargne);

        CompteEpargne.retirer();
        compte.toString();
        System.out.println(compteEpargne);

        CompteEpargne.CalculInteret();
        compteEpargne.toString();
        System.out.println(compteEpargne);



        comptePayant.deposer();
        comptePayant.toString();
        System.out.println(comptePayant);


        comptePayant.retirer();
        comptePayant.toString();
        System.out.println(comptePayant);



    }
}
