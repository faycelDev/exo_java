package ExoBatiment;

public class Maison extends Batiment{
    protected int nbPieces;
    public Maison(String adresse, int nbPieces) {
        super(adresse);
       this.nbPieces =  nbPieces ;
    }

    public Maison() {
    }

    public int getNbPieces() {
        return nbPieces;
    }

    public void setNbPieces(int nbPieces) {
        this.nbPieces = nbPieces;
    }

    @Override
    public String toString() {
        return "Maison " +
                " nbPieces : " + nbPieces +
                " adresse : " + adresse;

    }
}
