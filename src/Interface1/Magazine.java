package Interface1;

public class Magazine extends Publication implements Printable{

    private String language;


    public Magazine() {
        super();
    }

    public Magazine(String name, String language) {
        super(name);
        this.language = language;
    }

    @Override
    public String print() {
        return "Печатаем журнал";
    }


    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "language='" + language + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
