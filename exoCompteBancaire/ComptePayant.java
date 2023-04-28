package exoCompteBancaire;

public class ComptePayant extends Compte {

    protected static double solde;
    protected static int code = 0;

    public ComptePayant(double solde) {
        super(solde);
        this.solde = solde;
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
        ComptePayant.code = code;
    }

    public static double deposer(double depot)
    {

        solde += depot - 5;
        return solde;

    }

    public static double retirer(double retrait)
    {

       solde = solde - (retrait + 5);
       return solde;




    }

    public String toString() {
        return " le solde du Compte payant est de :  " + solde;
    }

}
