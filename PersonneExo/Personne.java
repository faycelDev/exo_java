package PersonneExo;



public class Personne {
    private static int compteur = 0;
    protected int id;
    protected String nom;
    protected String email;
    protected String tel;
    protected double salaire;

    public Personne( String nom, String email, String tel, double salaire) {
        this.id = ++compteur;
        this.nom = nom;
        this.email = email;
        this.tel = tel;
        this.salaire = salaire;
    }

    public int getCompteur()
    {
        return compteur;
    }

    public int setCompteur(int compteur)
    {
        Personne.compteur = compteur;
        return compteur;
    }


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    @Override /* ici nous avons le override dans la methode mere qui est  la classe (Personne)
    car en realité la methode mere elle même est fille de la classe (Object) seulement c'est implicite*/
    public String toString() {
        return  "manager " +
                "id : " + id +
                " nom : " + nom + ' ' +
                " email : " + email + ' ' +
                " tel : " + tel + ' ' +
                " salaire : " + salaire ;

    }
}
