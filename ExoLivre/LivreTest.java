package ExoLivre;

public class LivreTest {

    public static void main(String[] args) {

        Livre livre = new Livre("le livre d'or", "fays", 20.50);
        Livre livre1 = new Livre("livre d'argent", "loulou", 14.58);
        Livre livre2 = new Livre( "livre de bronze", "tartampion", 11.10);

        System.out.println(livre.toString());
        System.out.println(livre1.toString());
        System.out.println(livre2.toString());




    }
}
