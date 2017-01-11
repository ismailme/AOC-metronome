package src.main.java.metronome.Invoker;

import src.main.java.metronome.Command.Command;
import src.main.java.metronome.Receiver.Ctrl;

/**
 *
 * Curseur
 */
public class CurseurFXImpl implements CurseurFX {

    Command command;


    /**
     *
     * Set Commande
     * {@inheritDoc}
     * @param c
     */
    @Override
    public void setCmd(Command c) {
        System.out.println("curseur FX check");
        this.command = c;
        this.command.execute();
    }

    /**
     * Set Controlleur
     * {@inheritDoc}
     * @param c
     */
    @Override
    public void setCtl(Ctrl c) {

    }
}
