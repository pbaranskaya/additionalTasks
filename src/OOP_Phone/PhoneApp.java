package OOP_Phone;

import static OOP_Phone.Phone.sendMessages;

public class PhoneApp {
    public static void main(String[] args) {

        Android a1 = new Android("+375(29)345-67-89", "Sumsung", 500);
        System.out.println(a1);
        a1.recieveCall("Иван");


        WindowsPhone wp1 = new WindowsPhone("+375(33)456-56-78", "Nokia", 600);
        System.out.println(wp1);
        wp1.recieveCall("Мария");

        Iphone ip1 = new Iphone("+375(25)785-34-67", "Max", 700);
        System.out.println(ip1);
        ip1.recieveCall("Ольга");

        sendMessages(a1.getNumber(), wp1.getNumber(), ip1.getNumber());

    }
}

