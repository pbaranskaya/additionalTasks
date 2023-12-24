package Interface1;

public class Container {

    private Printable[] printable;
    private static int current;

    private void grow() {
        Printable[] newPrintable = new Printable[printable.length * 2 + 1];
        System.arraycopy(printable, 0, newPrintable,0, printable.length);
        printable = newPrintable;
    }

    public void add(Printable item) {
        if (printable == null) {
            printable = new Printable[10];
            current = 0;
        }
        if (current >= printable.length) {
            grow();
        }
        printable[current++] = item;
    }

    public void canPrint(){
        for (int i = 0; i < current;i++) {
            System.out.println(printable[i] + " " + printable[i].print());
        }
    }

    public void printMagazines(){
        System.out.print("Журналы: ");
        for (int i = 0; i < current;i++) {
            if (printable[i] instanceof Magazine) {
                System.out.print(((Magazine) printable[i]).getName() + " ");
            }
        }
        System.out.println();
    }

    public void printBooks(){
        System.out.print("Книги: ");
        for (int i = 0; i < current;i++) {
            if (printable[i] instanceof Book) {
                System.out.print(((Book) printable[i]).getName() + " ");
            }
        }
        System.out.println();
    }

}
