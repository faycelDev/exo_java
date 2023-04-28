package ExoBatiment;

public class BatimentTest {

    public static void main(String[] args) {

            Batiment batiment = new Batiment("1 rue du palier doré");
            Maison maison = new Maison("5 rue de la colline enneigée", 5);

        System.out.println(batiment);
        System.out.println(maison);
    }
}
