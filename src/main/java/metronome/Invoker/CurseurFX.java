package src.main.java.metronome.Invoker;

import src.main.java.metronome.Command.Command;
import src.main.java.metronome.Receiver.Ctrl;

/**
 * Curseur
 */
public interface CurseurFX {
    /**
     *
     * @param c
     */
    public void setCmd(Command c);

    /**
     *
     * @param c
     */
    public void setCtl(Ctrl c);
}
