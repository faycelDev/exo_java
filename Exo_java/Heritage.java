package Exo_java;

public class Heritage {

    public static void main(String[] args)
    { /*instance du cheval et du poney*/
        HeritageCheval c = new HeritageCheval("Tikito");
        c.move(167, 487);

        HeritagePoney p = new HeritagePoney("pueblo");
        p.move(33, 66);
        p.fly(455);
    }
}
