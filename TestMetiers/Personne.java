package TestMetiers;

public abstract class Personne {

    String nom;

    public Personne(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }


    public String toString() {
        return(this +  "nom : " + nom);


    }
   abstract public void affiche();

}
