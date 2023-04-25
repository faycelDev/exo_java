package Exo_java;

public class HeritageCheval
{
    public HeritageCheval(String name)
    {
        this.name = name;
        this.posX = 50;
        this.posY = 50;
    }
    public void move(int x, int y)
    {
        this.posX = x;
        this.posY = y;
        System.out.println("le cheval se déplace (X = " + this.posX + ", Y = " + this.posY + ")");
    }



    protected String name;
    protected int posX;
    protected int posY;
    }
