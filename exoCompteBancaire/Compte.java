package exoCompteBancaire;

public class Compte {

    protected static double solde;
    protected static int code = 0;

    public Compte(double solde) {
        Compte.solde = solde;
        code = ++code;
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
        Compte.code = code;
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

    public String toString() {
        return " le solde du Compte est de :  " + solde;
    }
}
