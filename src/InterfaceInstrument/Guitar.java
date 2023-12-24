package InterfaceInstrument;

public class Guitar implements Instrument {

    private int string;

    @Override
    public void play() {
        System.out.println("Играет гитара с количеством струн " + getString());
    }

    public Guitar(int string){
        this.string = string;
    }

    public int getString() {
        return string;
    }

    public void setString(int string) {
        this.string = string;
    }
}
