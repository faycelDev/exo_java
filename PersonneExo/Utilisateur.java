package PersonneExo;

public class Utilisateur extends Personne {

    protected String login;
    protected String password;
    protected String service;


    public Utilisateur(String nom, String email, String tel, double salaire, String login, String password, String service) {
        super(nom, email, tel, salaire);
        this.login = login;
        this.password = password;
        this.service = service;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }



}
