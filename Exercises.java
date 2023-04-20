public class Exercises {
    public static void main(String[] args) {

      int resultat = produit(20, 2);
        System.out.println(resultat);
        tableMultiplication(2);
      double result = moyenne(10, 3, 6) ;
        System.out.println(result);
        permutation();
      int result2 =  factoriel(3);
        System.out.println(result2);

    }
    public static int produit(int a, int b) {

       return a * b;
    }

    public static void tableMultiplication(int a){
        for(int i = 1; i < 10; i++) {
            System.out.println(i + " * " + a + " = " + (i * a));
        }
    }
    public static double moyenne(double e, double f ,double j) {
        return (e + f + j) / 3;
    }

    public static void permutation(){
        int a = 5;
        int b = 6;

        System.out.println("a = " + a + " b = " + b );
        int c = a;
        a = b;
        b = c;
        System.out.println("a = " + a + " b = " + b );
    }
    public static int factoriel(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {

         result = i * result;
        }
        return result;
    }
}
