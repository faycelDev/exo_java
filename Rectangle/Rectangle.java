package Rectangle;

public class Rectangle {
    private double longueur;
    private double largeur;

    public Rectangle(double longueur, double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;

    }

    public double getLongueur() {
        return longueur;
    }

    public void setLongueur(double longueur) {
        this.longueur = longueur;
    }

    public double getLargeur() {
        return largeur;
    }

    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }

    public double perimetre() {
        return (longueur + largeur) * 2;
    }

    public double surface() {
        return longueur * largeur;
    }

    public void carreOupas() {
        if (longueur == largeur) {
            System.out.println("c'est un carré");
        } else {
            System.out.println("c'est un rectangle");
        }

    }


    public void afficher() {
        System.out.println("la longueur est : " + longueur);
        System.out.println("la largeur est de : " + largeur);
        System.out.println("le perimètre est de : " + perimetre());
        System.out.println("la surface est de : " + surface());
        System.out.println();
    }
}

