package OOP_Phone;

public class WindowsPhone extends Phone {

    public WindowsPhone() {
        super();
    }

    public WindowsPhone (String number, String model, double weight) {
        super(number, model);
        this.weight = weight;
    }
}
