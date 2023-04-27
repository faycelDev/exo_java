package ExoPersonne;

public class PersonneTest {

    public static void main(String[] args) {

        Employe employe = new Employe(1, "jean","jacques", 1598.63);
        Etudiant etudiant = new Etudiant(2, "paul", "piere", "254");
        Professeur professeur = new Professeur(3, "Azouz", "cherbi", 3000.25, "science");

        System.out.println(etudiant);
        System.out.println(employe);
        System.out.println(professeur);

    }
}
