package src.main.java.metronome.Invoker;

import src.main.java.metronome.Command.Command;

/**
 * Created by H-raf on 21/11/2016.
 */
public class ButtonFXImpl implements ButtonFX {

    Command cmd;
    public ButtonFXImpl(){

    }

    @Override
    public void setCmd(Command c) {
        this.cmd = c;
        c.execute();
    }

    @Override
    public void setMoteur(Moteur m) {

    }
}
