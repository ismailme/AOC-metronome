package src.main.java.metronome.Command;

import src.main.java.metronome.Receiver.Ctrl;

/**
 * Created by H-raf on 21/11/2016.
 */
public class StartMetronome implements Command {

    private Ctrl controler;

    public StartMetronome(){

    }

    @Override
    public void execute() {
        this.controler.start();
    }

    @Override
    public void setMoteur(Ctrl m) {
        this.controler = m;
    }
}
