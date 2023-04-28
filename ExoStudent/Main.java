package ExoStudent;

public class Main {

    public static void main(String[] args) {


        Student student = new Student(15);
        Teatcher teatcher = new Teatcher(40);

        student.goToClasses();
        System.out.println(student);

        teatcher.explain();
        System.out.println(teatcher);

        System.out.println(student.getAge());
        teatcher.displayAge();


    }
}
