public class Main {

    public static void main(String[]args){

        prog();
        loadWindow();
        loadSprite();
        animateSprite();
int result = calcul(10, 20);
System.out.println(result);
    }

    public static void prog(){


        System.out.println("hello");

    }

    public static void loadWindow() {
        System.out.println("salut");
    }
    public static void loadSprite() {
        System.out.println("bjr");
    }
    public static void animateSprite() {


    }


    public static int calcul(int nb1, int nb2){
   int result = nb1 + nb2;
   return result;
    }
}
