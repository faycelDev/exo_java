package ExoEmployeAbstrait;

public class Employe {

    protected String matricule;

    protected String nom;
    protected String prenom;
    protected String dateNaissance;


    public Employe(String matricule, String nom, String prenom, String dateNaissance) {
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;

    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }


    @Override
    public String toString() {
        return "Employe " +
                " matricule : " + matricule + '\'' +
                " nom : " + nom + '\'' +
                " prenom : " + prenom + '\'' +
                " dateNaissance : " + dateNaissance;

    }
}
