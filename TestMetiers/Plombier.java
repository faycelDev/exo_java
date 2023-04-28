package TestMetiers;

public class Plombier extends Personne {
    public Plombier(String nom) {
        super(nom);
    }



    public void affiche() {
        System.out.println("plombier nom " + nom);
    }
}
