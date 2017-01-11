package src.main.java.metronome.Command;

import src.main.java.metronome.Receiver.Ctrl;

/**
 *
 * Lancer metronome
 */
public class StartMetronome implements Command {

    private Ctrl controler;

    public StartMetronome(){

    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void execute() {
        this.controler.start();
    }

    /**
     * Setter Moteur
     * {@inheritDoc}
     * @param m
     */
    @Override
    public void setMoteur(Ctrl m) {
        this.controler = m;
    }
}
