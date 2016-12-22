package src.main.java.metronome.Invoker;

import src.main.java.metronome.Command.Command;
import src.main.java.metronome.Receiver.Ctrl;

/**
 * Created by H-raf on 22/12/2016.
 */
public interface CurseurFX {

    public void setCmd(Command c);
    public void setCtl(Ctrl c);
}
