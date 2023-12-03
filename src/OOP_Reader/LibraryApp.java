package OOP_Reader;



public class LibraryApp extends Book{
    public static void main(String[] args) {

        Student petrov = new Student("Петр", "Петров", "01",
                "Исторический", "24.09.1999", "+375(29)890-56-34");
        System.out.println(petrov);

        petrov.takeBook(3);
        petrov.takeBook("Приключения", "Словарь", "Энциклопедия");
        System.out.println();
        petrov.takeBook(); // как помещать объекты


    }
}
