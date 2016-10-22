package src.main.java.metronome.Command;

import src.main.java.metronome.Receiver.Ctrl;

/**
 * Created by H-raf on 17/10/2016.
 */
public class DecrTempo implements Command {

    Ctrl controller;

    public DecrTempo(){

    }

    public DecrTempo(Ctrl c){
        this.controller = c;
    }

    public void execute() {
        controller.DecrTempo();
    }
}
