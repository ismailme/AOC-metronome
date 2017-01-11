package src.main.java.metronome.Command;

import src.main.java.metronome.Receiver.Ctrl;

/**
 * Marquer mesure
 */
public class MarquerMesure implements Command {

    Ctrl controler;

    public MarquerMesure(){
    }

    /**
     * constructor
     * @param c
     */
    public MarquerMesure(Ctrl c){
        this.controler = c;
    }

    /**
     * Execute
     */
    public void execute() {
        controler.marquerMesure();
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
