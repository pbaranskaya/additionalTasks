package Interface1;

public class Book extends Publication implements Printable {

    private String front;

    public Book() {
        super();
    }

    public Book(String name, String front) {
        super(name);
        this.front = front;
    }

    @Override
    public String print() {
        return "Печатаем книгу";
    }

    public String getFront() {
        return front;
    }

    public void setFront(String front) {
        this.front = front;
    }

    @Override
    public String toString() {
        return "Book{" +
                "front='" + front + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
