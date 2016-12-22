package src.main.java.metronome.Command;

import src.main.java.metronome.Invoker.Moteur;
import src.main.java.metronome.Receiver.Ctrl;

/**
 * Created by h-raf on 11/11/16.
 */
public class DecMesure implements Command {

    Ctrl controler;

    public DecMesure() {
    }

    public DecMesure(Ctrl c) {
        this.controler = c;
    }

    @Override
    public void execute() {
        this.controler.DecMesure();
    }

    @Override
    public void setMoteur(Ctrl m) {
        this.controler = m;
    }
}
