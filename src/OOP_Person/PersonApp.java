package OOP_Person;

public class PersonApp {
    public static void main(String[] args) {

        Person anatoliy = new Person();
        anatoliy.setFullName("Анатолий");
        String anatoliyFullName = anatoliy.getFullName();
        anatoliy.setAge(37);
        int pAge = anatoliy.getAge();
        System.out.println(anatoliy);
        anatoliy.move();
        anatoliy.talk();

        Person vitaliy = new Person("Виталий", 45);
        System.out.println(vitaliy);
        vitaliy.move();
        vitaliy.talk();

    }
}
