package ExoEmployeAbstrait;

public class Cadre extends Employe {

    protected double salaire;
    protected int indice;

    public Cadre(String matricule, String nom, String prenom, String dateNaissance, double salaire, int indice) {
        super(matricule, nom, prenom, dateNaissance);
        this.salaire = salaire;
        this.indice = indice;

    }


    public void salaireCadre(int indice) {

        if (indice == 1) {

            double salaire = 13000;
            this.salaire = salaire;

        } else if (indice == 2) {
            double salaire = 15000;
            this.salaire = salaire;

        } else if (indice == 3) {
            double salaire = 17000;
            this.salaire = salaire;

        } else if (indice == 4) {
            double salaire = 20000;
            this.salaire = salaire;

        } else {
            System.out.println("erreur");
        }


    }




    @Override
    public String toString() {
        return "  Cadre " +
                " indice : " + indice +
                " matricule : " + matricule + '\'' +
                " nom : " + nom + '\'' +
                " prenom : " + prenom + '\'' +
                " dateNaissance : " + dateNaissance + '\'' +
                " salaire : " + this.salaire;

    }
}