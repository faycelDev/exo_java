package ExoStudent;

public class Teatcher extends Person {

    private String subject;
    public Teatcher(int age) {
        super(age);
        this.subject = subject;
    }

    public void explain()
    {
        System.out.println("Explanation begins");
    }

    public void displayAge()
    {
        System.out.println("son age est : " + age);
    }

    @Override
    public String toString() {
        return "Teatcher " +
                "age : " + age + " years";

    }
}
