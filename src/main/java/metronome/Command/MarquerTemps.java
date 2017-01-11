package src.main.java.metronome.Command;

import src.main.java.metronome.Receiver.Ctrl;

/**
 * Marquer Tempo
 */
public class MarquerTemps implements Command {

    private Ctrl controler;

    public MarquerTemps(){

    }

    /**
     * Constructor
     * @param c
     */
    public MarquerTemps(Ctrl c){
        this.controler = c;
    }

    /**
     * Execute
     */
    public void execute() {
        controler.marquerTemps();
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
