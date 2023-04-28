package exoCompteBancaire;

public class CompteTest {

    public static void main(String[] args) {

        Compte compte = new Compte(0);
        ComptePayant comptePayant = new ComptePayant(0);
        CompteEpargne compteEpargne = new CompteEpargne(0, 6);



         Compte.deposer(50);
            compte.toString();
        System.out.println(compte);

        compte.retirer(80);
        compte.toString();
        System.out.println(compte);





        CompteEpargne.deposer(1000);
        compteEpargne.toString();
        System.out.println(compteEpargne);

        CompteEpargne.retirer(200);
        compte.toString();
        System.out.println(compteEpargne);

        CompteEpargne.CalculInteret();
        compteEpargne.toString();
        System.out.println(compteEpargne);



        comptePayant.deposer(40);
        comptePayant.toString();
        System.out.println(comptePayant);


        comptePayant.retirer(75);
        comptePayant.toString();
        System.out.println(comptePayant);



    }
}
