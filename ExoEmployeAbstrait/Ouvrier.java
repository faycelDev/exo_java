package ExoEmployeAbstrait;

public class Ouvrier extends Employe {

    protected double dateEntree;
    protected double salaire;

    public Ouvrier(String matricule, String nom, String prenom, String dateNaissance, double salaire, double dateEntree) {
        super(matricule, nom, prenom, dateNaissance);
        this.dateEntree = dateEntree;
        this.salaire = salaire;
    }

    public double getDateEntree() {
        return dateEntree;
    }

    public void setDateEntree(double dateEntree) {
        this.dateEntree = dateEntree;
    }

    public void salaireOuvrier(double DateEntree, double salaire) {

        double anciennetee = 2023 - DateEntree;

        if (anciennetee > 0) {
            double augmentation = salaire * 5 * anciennetee / 100;
            double salaireFinal = salaire + augmentation;
            if (augmentation > 5000) {
               this.salaire = 5000;
            } else {
                this.salaire = salaireFinal;
            }
        }
        this.salaire = salaire;
    }

    @Override
    public String toString() {
        return "Ouvrier " +
                "dateEntree : " + dateEntree +
                " matricule : " + matricule + '\'' +
                " nom : " + nom + '\'' +
                " prenom : " + prenom + '\'' +
                " dateNaissance : " + dateNaissance + '\'' +
                " salaire : " + this.salaire;

    }
}








