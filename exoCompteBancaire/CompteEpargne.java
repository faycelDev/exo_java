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

    public static double deposer()
    {
        double depot = 2000;
        solde += depot;
        return solde;

    }

    public static double retirer()
    {
        double retirer = 50.50;
        solde -= retirer;
        return solde;
    }

    public static double CalculInteret() {
        int tauxInteret = 6;

       double newSolde =  solde -= (solde * tauxInteret / 100);
        return newSolde;

    }



    public String toString() {
        return " le solde du Compte epargne est de :  " + solde;
    }
}
