public class training {
    public static void main(String[] args) {
        int[] tableau = {10,10,20,20,5,5,5,5, 98, 100, 100, 100, 100, 100};
        int nombreDeFois = count(tableau,5);
        System.out.println(nombreDeFois);

        int nombreDeFois2 = count(tableau,100);
        System.out.println(nombreDeFois2);
    }

    private static int count(int[] tableau, int x) {
        int nombreDeFois = 0;
        for(int i = 0; i < tableau.length; i++){
            if(tableau[i] == x) {
                nombreDeFois++;
            }
        }
        return nombreDeFois;
    }


}
