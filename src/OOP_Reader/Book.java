package OOP_Reader;

public class Book {

    String title;
    String author;

    public Book(){
        super();
    }

    public Book(String title, String author){
        super();
        this.title = title;
        this.author = author;
    }

    public static void main(String[] args) {

        Book book1 = new Book("Словарь русского языка", "Ожегов");
        Book book2 = new Book("Война и мир", "Толстой");
    }
}
