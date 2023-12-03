package OOP_Person;

public class Person {

    String fullName;
    int age;

    public Person() {
        super();
    }

    public Person(String fullName, int age) {
        super();
        this.fullName = fullName;
        this.age = age;
    }

    public void move() {
        System.out.println(fullName + " идет");
    }

    public void talk () {
        System.out.println(fullName + " говорит");
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                '}';
    }

}
