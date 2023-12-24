package InterfaceInstrument;

public class Drums implements Instrument{

    private double size;
    @Override
    public void play() {
        System.out.println("Играют барабаны размером " + getSize());
    }

    public Drums(double size) {
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }
}
