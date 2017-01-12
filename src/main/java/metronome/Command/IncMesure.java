package src.main.java.metronome.Command;

import src.main.java.metronome.Receiver.Ctrl;

/**
 * Incrementer la valeur de mesure
 */
public class IncMesure implements Command {

    Ctrl controler;

    public IncMesure() {
    }

    /**
     * Constructor
     * @param c
     */
    public IncMesure(Ctrl c) {
        this.controler = c;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void execute() {
        this.controler.IncrMesure();
    }

    /**
     * {@inheritDoc}
     * @param m
     */
    @Override
    public void setMoteur(Ctrl m) {
        this.controler = m;
    }
}
