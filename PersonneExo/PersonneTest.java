package PersonneExo;



public class PersonneTest {

    public static void main(String[] args) {

        Utilisateur utilisateur = new Utilisateur("eric", "eric@outlook.fr", "06.10.54.21.88", 1839.54, "myLogin", "myPass", "agent");
        Profil profil = new Profil("paul", "paul@outlook.fr", "07.10.44.81.88", 1939.54, "myLogin2", "myPass2", "agent2", "12.5498", "blabla");
        Manager manager = new Manager("alain", "alain00@gmail.com", "06.50.48.75.84", 5429.23);
        DirceteurGeneral directeurGeneral = new DirceteurGeneral("Louis", "dupont", "06.24.42.82.28", 5423.28);



        directeurGeneral.calculerSalaireDirecteurGeneral();
        System.out.println(directeurGeneral);



        manager.calculerSalaireManager();
        System.out.println(manager);


        System.out.println(profil);
        System.out.println(utilisateur);

    }
}
