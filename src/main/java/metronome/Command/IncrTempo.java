package src.main.java.metronome.Command;

import src.main.java.metronome.Receiver.Ctrl;

/**
 * Created by h-raf on 11/11/16.
 */
public class IncrTempo implements Command {

    Ctrl controler;

    public IncrTempo() {
    }

    public IncrTempo(Ctrl c) {
        this.controler = c;
    }

    @Override
    public void execute() {

    }
}
