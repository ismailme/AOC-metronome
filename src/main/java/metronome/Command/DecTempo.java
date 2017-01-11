package src.main.java.metronome.Command;

import src.main.java.metronome.Receiver.Ctrl;

/**
 * Decrementer la valeur de Tempo
 */
public class DecTempo implements Command {

    Ctrl controler;

    public DecTempo() {
    }

    /**
     * constructor
     * @param c
     */
    public DecTempo(Ctrl c) {
        this.controler = c;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void execute() {
        this.controler.DecTempo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setMoteur(Ctrl m) {
        this.controler = m;
    }
}
