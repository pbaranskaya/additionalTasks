package OOP_Phone;

public class Phone {

    static String number;
    String model;
    double weight;

    public Phone() {
        super();
    }

    public Phone(String number, String model) {
        super();
        this.number = number;
        this.model = model;
    }

    public Phone(String number, String model, double weight) {
        super();
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    void recieveCall(String name) {
        System.out.println("Звонит " + name + " " + Phone.getNumber());
    }

    public static void sendMessages(String...vars) {
        System.out.println("Сообщение отправлено: ");
        for (String i : vars) {
            System.out.println(i);
        }
    }

    public static String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number='" + number + '\'' +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }
}
