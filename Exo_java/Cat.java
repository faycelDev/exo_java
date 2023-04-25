package Exo_java;
public class Cat {
    //constructeur
    public Cat(String name, int age){

        this.name = name;
        this.age = age;

        System.out.println("son nom est : " + this.name + " et il a  : " + this.age + " ans ");
    }
    // attribut privé accessible que dans la class
    private String name;
    private int age;
}
