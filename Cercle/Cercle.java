package Cercle;


public class Cercle {

    private Point centre;
    private int rayon;

    public Cercle(Point centre, int rayon) {
        this.centre = centre;
        this.rayon = rayon;
    }

    public Point getCentre() {
        return centre;
    }

    public void setCentre(Point centre) {
        this.centre = centre;
    }

    public int getRayon() {
        return rayon;
    }

    public void setRayon(int rayon) {
        this.rayon = rayon;
    }

    public double perimetre() {
         return this.rayon * 2 * 3.14;

    }

    public double surface() {
       return rayon * rayon * 3.14;
    }

    public void afficher() {
        System.out.println("le rayon est : " + this.rayon);
        centre.show();
    }
}
