package src.main.java.metronome.Command;

import src.main.java.metronome.Receiver.Ctrl;

/**
 * Arreter metronome
 */
public class StopMetronome implements Command{

    private Ctrl controler;

    public StopMetronome(){

    }

    /**
     * executer stop
     * {@inheritDoc}
     */
    @Override
    public void execute() {
        this.controler.stop();
    }

    /**
     *{@inheritDoc}
     * @param m
     */
    @Override
    public void setMoteur(Ctrl m) {
        this.controler = m;
    }
}

