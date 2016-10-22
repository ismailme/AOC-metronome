package src.main.java.metronome.Command;

import src.main.java.metronome.Receiver.Ctrl;

/**
 * Created by H-raf on 17/10/2016.
 */
public class MarquerTemps implements Command {

    private Ctrl controler;

    public MarquerTemps(){

    }

    public MarquerTemps(Ctrl c){
        this.controler = c;
    }

    public void execute() {
        controler.marquerTemps();
    }
}
