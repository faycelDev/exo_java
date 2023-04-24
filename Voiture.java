import org.w3c.dom.ls.LSOutput;

//declaration de la classe voiture avec ses propriétés
public class Voiture {

    private String marque;
    private String model;
    private int annee;

    //constructeur de la classe voiture
    public Voiture(String marque, String model, int annee) {
        this.marque = marque;
        this.model = model;
        this.annee = annee;
    }
        //méthode pour afficher les propriétés de la voiture
        public void afficherDetails() {
            System.out.println("Marque" + marque);
            System.out.println("Model " + model);
            System.out.println("Annee " + annee);

            //instanciation de la classe voiture
            Voiture maVoiture = new Voiture("peugeot", "308", 2015);


}
}

