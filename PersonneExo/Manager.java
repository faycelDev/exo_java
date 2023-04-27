package PersonneExo;

public class Manager extends Personne{

    public Manager(String nom, String email, String tel, double salaire) {
        super(nom, email, tel, salaire);
    }

    @Override /*Override est utilisé pour une redéfinition d'une méthode (déja défini
    dans une classe mère exemple : Personne) dans une classe fille comme c'est le cas ici même(Manager)*/
    public int getCompteur() {
        return super.getCompteur();
    }
    /* la signature d'une méthode c'est : les modificateurs d'acces(private, public, protected, void),
        les types(int, float, double etc...), le nom de cette méthode et si il y a le mot static il fait aussi parti de la signature  */
    @Override
    public int setCompteur(int compteur) {
        return super.setCompteur(compteur);
    }



    public void calculerSalaireManager() {
         salaire *= 1.1;
    }


}
