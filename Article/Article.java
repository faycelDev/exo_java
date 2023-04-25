package Article;

public class Article {

    private int reference;
    private String designation;
    private int prixHt;
    private int tauxTva;

    public Article(int reference, String designation, int prixHt, int tauxTva)
    {
        this.reference = reference;
        this.designation = designation;
        this.prixHt = prixHt;
        this.tauxTva = tauxTva;

    }
    public Article()
    {

    }
    public Article(int reference, String designation)
    {
        this.reference = reference;
        this.designation = designation;
    }

    public int getReference() {
        return reference;
    }

    public void setReference(int reference) {
        this.reference = reference;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getPrixHt() {
        return prixHt;
    }

    public void setPrixHt(int prixHt) {
        this.prixHt = prixHt;
    }

    public int getTauxTva() {
        return tauxTva;
    }

    public void setTauxTva(int tauxTva) {
        this.tauxTva = tauxTva;
    }

    public double prixTtc() {
        double prixTtc = prixHt + prixHt * tauxTva / 100;

       return prixTtc;
    }

    public void afficher() {
        System.out.println(" la reference est : " + reference);
        System.out.println("designation " + designation);
        System.out.println("le prix ht est : " + prixHt);
        System.out.println("le taux de tva est : " + tauxTva);
        System.out.println("le prix ttc est : " + prixTtc());
    }
}
