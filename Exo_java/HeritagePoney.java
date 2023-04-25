package Exo_java;

public class HeritagePoney extends HeritageCheval {

    public HeritagePoney(String name)
    {
        super(name);
        this.posZ = 100;
    }
 /*   public void move(int x, int y)
    {
        this.posX = x;
        this.posY = y;
        System.out.println("le cheval se déplace (X = " + this.posX + ", Y = " + this.posY + ")");
    }*/

    public void fly(int z)
    {
        this.posZ = z;
        System.out.println("ils disent ce poney s'élève dans les airs (Z = " + this.posZ + ")");
    }




    private int posZ;
}

