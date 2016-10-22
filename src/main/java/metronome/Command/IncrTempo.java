package src.main.java.metronome.Command;

import src.main.java.metronome.Receiver.Ctrl;

/**
 * Created by H-raf on 17/10/2016.
 */
public class IncrTempo implements Command  {

    Ctrl controller;

    public IncrTempo(){

    }

    public IncrTempo(Ctrl c){
        this.controller = c;
    }

    public void execute() {
        controller.IncrTempo();
    }
}
