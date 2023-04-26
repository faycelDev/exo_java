package ExoPersonne;

public class Employe extends Personne{

  protected double salaire;

    public Employe(int id, String nom, String prenom, double salaire) {
        super(id, nom, prenom);
        this.salaire = salaire;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }


    public String toString() {
        return "Employe " +
                " salaire = " + salaire
                +super.toString();
    }
}
