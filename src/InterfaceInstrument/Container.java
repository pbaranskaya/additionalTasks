package InterfaceInstrument;

import Interface1.Printable;

public class Container {

    private Instrument[] instruments;
    private int current;

    private void grow() {
        Instrument[] newInstruments = new Instrument[instruments.length * 2 + 1];
        System.arraycopy(instruments, 0, newInstruments,0, instruments.length);
        instruments = newInstruments;
    }

    public void add(Instrument instrument) {
        if (instruments == null) {
            instruments = new Instrument[10];
            current = 0;
        }
        if (current >= instruments.length) {
            grow();
        }
        instruments[current++] = instrument;
    }

    public void instrumentsToPlay() {
        for (int i = 0; i < current;i++) {
            instruments[i].play();
        }
    }
}
