package src.main.java.metronome.Command;

import src.main.java.metronome.Receiver.Ctrl;

/**
 * Created by h-raf on 11/11/16.
 */
public class IncMesure implements Command {

    Ctrl controler;

    public IncMesure() {
    }

    public IncMesure(Ctrl c) {
        this.controler = c;
    }

    @Override
    public void execute() {

    }

    @Override
    public void setMoteur(Ctrl m) {
        this.controler = m;
    }
}
