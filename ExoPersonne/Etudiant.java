package ExoPersonne;

public class Etudiant extends Personne{

   protected String cne;

    public Etudiant(int id, String nom, String prenom, String cne) {
        super(id, nom, prenom);
        this.cne = cne;
    }

    public String getCne() {
        return cne;
    }

    public void setCne(String cne) {
        this.cne = cne;
    }


    public String toString() {
        return " Etudiant " +
                " cne : " + cne + '\n'
                + super.toString();
    }
}
