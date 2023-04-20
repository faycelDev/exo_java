public class Joueur{

    public Joueur(){
        this.Name  = "inconnu";
        this.level = 10;
        System.out.println("il s'appel " + this.Name +" "+ "et il a " +  this.level + " de level");

    }
    public Joueur(String name){
        this.Name  = name;
        this.level = 5;
        System.out.println("il s'appel " + this.Name +" "+ "et il a " +  this.level + " de level");
    }
    public Joueur(String name, int level){
        this.Name = name;
        this.level = level;
        System.out.println("il s'appel " + this.Name +" "+ "et il a " +  this.level + " de level");
    }

    public void attack(){
        System.out.println(this.Name + "attack sa cible fays" + "!");
    }
    private String Name;
    private int level;
}
