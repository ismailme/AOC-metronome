package src.main.java.metronome.Command;

import src.main.java.metronome.Invoker.Moteur;
import src.main.java.metronome.Receiver.Ctrl;

/**
 * Decrementer la valeur de mesure
 */
public class DecMesure implements Command {

    Ctrl controler;

    /**
     *
     */
    public DecMesure() {
    }

    /**
     *
     * @param c
     */
    public DecMesure(Ctrl c) {
        this.controler = c;
    }

    /**
     *
     */
    @Override
    public void execute() {
        this.controler.DecMesure();
    }

    /**
     *
     * @param m
     */
    @Override
    public void setMoteur(Ctrl m) {
        this.controler = m;
    }
}
