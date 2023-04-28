package ExoEmployeAbstrait;

public class Patron extends Employe {

    protected int pourcentage;
    protected double salaire;
    public Patron(String matricule, String nom, String prenom, String dateNaissance, double salaire, int pourcentage) {
        super(matricule, nom, prenom, dateNaissance);
        this.pourcentage = pourcentage;
        this.salaire = salaire;
    }

    public int getPourcentage() {
        return pourcentage;
    }

    public void setPourcentage(int pourcentage) {
        this.pourcentage = pourcentage;
    }

    public void salairePatron(int pourcentage)
    {
         double chiffreAffaire = 1000000.100;
        this.salaire = (chiffreAffaire * pourcentage) / 100;

    }

    @Override
    public String toString() {
        return "Patron " +
                " pourcentage : " + pourcentage +
                " matricule :" + matricule + '\'' +
                " nom='" + nom + '\'' +
                " prenom : " + prenom + '\'' +
                " dateNaissance : " + dateNaissance + '\'' +
                " salaire :"  + salaire;

    }
}
