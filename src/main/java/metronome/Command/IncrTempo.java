package src.main.java.metronome.Command;

import src.main.java.metronome.Receiver.Ctrl;

/**
 * Incrementer la valeur de Temmpo
 */
public class IncrTempo implements Command {

    Ctrl controler;

    public IncrTempo() {
    }

    /**
     * Constructor
     * @param c
     */
    public IncrTempo(Ctrl c) {
        this.controler = c;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void execute() {
        controler.IncrTempo();

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
