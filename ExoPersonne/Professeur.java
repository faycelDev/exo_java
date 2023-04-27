package ExoPersonne;

public class Professeur extends Employe {

    protected String specialite;

    public Professeur(int id, String nom, String prenom, double salaire, String specialite) {
        super(id, nom, prenom, salaire);
        this.specialite = specialite;

    }

    public String getSpecialite() {
        return specialite;
    }




    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    public String toString() {
        return " Professeur " +
                " specialite : " + specialite + '\n'
                + super.toString();
    }

}
