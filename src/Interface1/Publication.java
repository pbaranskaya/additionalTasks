package Interface1;

public abstract class Publication implements Printable{

    protected String name;


    public abstract String print();


    public Publication () {
        super();
    }

    public Publication (String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Publication{" +
                "name='" + name + '\'' +
                '}';
    }
}

