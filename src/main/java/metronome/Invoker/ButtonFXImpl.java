package src.main.java.metronome.Invoker;

import src.main.java.metronome.Command.Command;

/**
 * Button
 */
public class ButtonFXImpl implements ButtonFX {

    Command cmd;
    public ButtonFXImpl(){

    }

    /**
     *
     * Set Commande
     * {@inheritDoc}
     * @param c
     */
    @Override
    public void setCmd(Command c) {
        this.cmd = c;
        c.execute();
    }
}
