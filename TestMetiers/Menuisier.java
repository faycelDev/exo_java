package TestMetiers;

public class Menuisier extends Personne{

    public Menuisier(String nom) {
        super(nom);
    }

    public void affiche() {
        System.out.println("menuisier nom " + nom);
    }
}
