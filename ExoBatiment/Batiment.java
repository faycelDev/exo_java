package ExoBatiment;

public class Batiment {

    protected String adresse;

    public Batiment(String adresse) {
        this.adresse = adresse;
    }

    public Batiment() {

    }

    @Override
    public String toString() {
        return "Batiment " + " adresse : " + adresse;

    }
}
