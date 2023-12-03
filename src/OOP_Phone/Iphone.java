package OOP_Phone;

public class Iphone extends Phone {

    public Iphone() {
        super();
    }

    public Iphone (String number, String model, double weight) {
        super(number, model);
        this.weight = weight;
    }

}
