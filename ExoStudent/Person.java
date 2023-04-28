package ExoStudent;

public class Person {

    protected int age;

    public Person(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void sayHello() {
        System.out.println("hello");
    }

    @Override
    public String toString() {
        return "Person " +
                "age : " + age;

    }
}
