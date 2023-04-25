package Exo_java;

public class ExoMethode {
    public static void main(String[] args) {
       int number =  getNumber();
        System.out.println(number);

       String message = say("voici mon msg");
        System.out.println(message);

    }


    public static int getNumber() {
        boolean info = true;

        if(info) {
            return 1;
        }else{
            return 2;
        }

    }

    public static String say(String msg) {
        msg = "voici mon autre message";
      return msg;
    }
}
