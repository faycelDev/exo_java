public class NewExo {

    public static void main(String[] args) {
        int[] tableau = {10, 20, 12, 14, 9};
        int min = minimum(tableau);
        System.out.println("le minimum  est : " + min);

        int max = maximum(tableau);
        System.out.println("le maximum est : " + max);

        int somme = somme(tableau);
        System.out.println("la somme est :" + somme);

        double moyenne = moyenne(tableau);
        System.out.println("la moyenne est : " + moyenne);
    }

    private static double moyenne(int[] tableau) {
        double moyenne = 0;
        for(int i = 0; i <tableau.length; i++) {
            moyenne = moyenne + tableau[i];
        }
        moyenne = moyenne / tableau.length;
        return moyenne;
    }

    private static int somme(int[] tableau) {
        int somme = 0;
        for(int i = 0; i < tableau.length; i++){
            somme += tableau.length;
        }
        return somme;
    }

    private static int maximum(int[] tableau) {
        int max = tableau[0];
        for(int i = 0; i < tableau.length; i++){
            if(max < tableau[i]) {
                max = tableau[i];
            }
        }
        return max;
    }

    private static int minimum(int[] tableau) {
        int min = tableau[0];
        for(int i = 0; i < tableau.length; i++) {
            if(min < tableau[i]) {
                min = tableau[i];
            }
        }
        return min;
    }
}
