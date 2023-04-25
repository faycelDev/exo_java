package Cercle;

public class CercleTest {

    public static void main(String[] args) {

        Point point = new Point(10, 12);
        System.out.println(point.getX());
        point.setx(23);
        System.out.println(point.getX());

        Cercle cercle = new Cercle(point, 20);
        System.out.println(cercle.getRayon());
        System.out.println(cercle.getCentre().getY());
        System.out.println("le périmètre est : " + cercle.perimetre());
        System.out.println("la surface est : " + cercle.surface()) ;
        cercle.afficher();


    }
}
