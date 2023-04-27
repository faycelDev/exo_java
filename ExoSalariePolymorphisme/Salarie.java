package ExoSalariePolymorphisme;

public class Salarie {

    protected String nom;
    protected double salaire;


    public Salarie(String nom)
    {
        this.nom = nom;
    }

    public void afficherSalaire()
    {
        System.out.println("le salaire de " + this + " est : " + salaire + " $"); /* Tres important le fait d'utiliser this a cette endroit permet de rendre le code générique
        c'est a dire qu'il va pouvoir utiliser donc donner le salaire du chef comme du directeur ou de l'ouvrier */
    }

    @Override
    public String toString() {
        return
               nom;

    }


}
