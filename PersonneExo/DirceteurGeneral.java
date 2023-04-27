package PersonneExo;



public class DirceteurGeneral extends Personne {

    public DirceteurGeneral(String nom, String email, String tel, double salaire) {
        super(nom, email, tel, salaire);

    }


    public void calculerSalaireDirecteurGeneral() {

         salaire *= 1.4;
    }


}
