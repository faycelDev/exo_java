package exoCompteBancaire;

public class CompteEpargne extends Compte {
    protected static double solde;
    protected static int code = 0;
    protected int tauxInteret = 6;

    public CompteEpargne(double solde, int tauxInteret) {
        super(solde);
        this.tauxInteret = tauxInteret;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public static int getCode() {
        return code;
    }

    public static void setCode(int code) {
        CompteEpargne.code = code;
    }

    public static double deposer(double depot)
    {

        solde += depot;
        return solde;

    }

    public static double retirer(double retirer)
    {

        solde -= retirer;
        return solde;
    }

    public static double CalculInteret() {
        int tauxInteret = 6;

        solde -= (solde * tauxInteret / 100);
        return solde;

    }



    public String toString() {
        return " le solde du Compte epargne est de :  " + solde;
    }
}
