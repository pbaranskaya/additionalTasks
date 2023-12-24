package InterfaceInstrument;

// Создать интерфейс Инструмент и реализующие его классы Гитара, Барабан и Труба.
// Интерфейс Инструмент содержит метод play() и переменную String KEY ="До мажор".
// Гитара содержит переменные класса количествоСтрун,  Барабан - размер, Труба - диаметр.
// Создать массив типа Инструмент, содержащий инструменты разного типа. В цикле вызвать метод play()
// для каждого инструмента, который должен выводить строку "Играет такой-то инструмент c такими то характеристиками".

public class InstrumentsApp {
    public static void main(String[] args) {

        Container container = new Container();

        Drums d1 = new Drums(4.5);
        Trumpet t1 = new Trumpet(5.5);

        container.add(d1);
        container.add(t1);

        container.instrumentsToPlay();

    }
}
