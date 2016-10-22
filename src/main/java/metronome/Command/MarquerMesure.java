package src.main.java.metronome.Command;

import src.main.java.metronome.Receiver.Ctrl;

/**
 * Created by H-raf on 17/10/2016.
 */
public class MarquerMesure implements Command {

    Ctrl controler;

    public MarquerMesure(){
    }

    public MarquerMesure(Ctrl c){
        this.controler = c;
    }

    public void execute() {
        controler.marquerMesure();
    }
}
