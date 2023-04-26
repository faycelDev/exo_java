package ExoLivre;

public class Livre {
    private static int compteur = 0;
    private int id;
    private String titre;
    private String auteur;
    private double prix;

    public Livre(String titre, String auteur, double prix) {

        this.id = ++compteur;
        this.titre = titre;
        this.auteur = auteur;
        this.prix = prix;
    }

      public int getCompteur()
      {
          return compteur;
      }

    public int setCompteur(int compteur)
    {
          Livre.compteur = compteur;
        return compteur;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public String toString()
    {
       return "l'id du livre est : " + this.id + "\n" +
        "le titre du livre est : " + this.titre +   "\n" +
        "L'auteur du livre est : " + this.auteur +    "\n" +
        "le prix du livre est : " + this.prix + " £";
    }
}

