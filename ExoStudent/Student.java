package ExoStudent;

public class Student extends Person {


    public Student(int age) {
        super(age);
    }

    public void goToClasses()
    {
        System.out.println(" hello i'm going to class");
    }

    public void displayAge(int age)
    {
        System.out.println("son age est : " + age);
    }

    @Override
    public String toString() {
        return "Student " +
                "age : " + age + " years";

    }
}
