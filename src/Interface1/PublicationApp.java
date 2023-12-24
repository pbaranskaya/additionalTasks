package Interface1;

// а) Определить интерфейс Printable, содержащий метод void print().
// б) Определить класс Book, реализующий интерфейс Printable.
// в) Определить класс Magazine, реализующий интерфейс Printable.
// г) Создать массив типа Printable, который будет содержать книги и журналы.
// д) В цикле пройти по массиву и вызвать метод print() для каждого объекта.
// е) Создать статический метод printMagazines(Printable[] printable) в классе Magazine,
//    который выводит на консоль названия только журналов.
//    Создать статический метод printBooks(Printable[] printable) в классе Book, который выводит
//    на консоль названия только книг. Используем оператор instanceof.

public class PublicationApp {
    public static void main(String[] args) {

        Container container = new Container();

        Publication p1 = new Book("Война и мир", "твердая");
        Publication p2 = new Magazine("Юный натуралист", "русский");
        Publication p3 = new Book("Гарри Поттер", "мягкая");

        container.add(p1);
        container.add(p2);
        container.add(p3);

        container.canPrint();

        container.printMagazines();
        container.printBooks();

    }
}
