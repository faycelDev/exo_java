package PersonneExo;

public class Profil extends Utilisateur {

    protected int id;
    protected String code;
    protected String libelle;


    public Profil(String nom, String email, String tel, double salaire, String login, String password, String service, String code, String libelle) {
        super(nom, email, tel, salaire, login, password, service);
        this.code = code;
        this.libelle = libelle;
    }
}
