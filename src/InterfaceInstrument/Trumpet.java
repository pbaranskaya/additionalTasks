package InterfaceInstrument;

public class Trumpet implements Instrument{
    private double diameter;
    @Override
    public void play() {
        System.out.println("Играет труба диаметром " + getDiameter());
    }

    public Trumpet(double diameter) {
        this.diameter = diameter;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }
}
