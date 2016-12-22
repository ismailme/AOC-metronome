package src.main.java.metronome.Invoker;

import src.main.java.metronome.Command.Command;
import src.main.java.metronome.Receiver.Ctrl;

/**
 * Created by H-raf on 22/12/2016.
 */
public class CurseurFXImpl implements CurseurFX {

    Command command;



    @Override
    public void setCmd(Command c) {
        System.out.println("curseur FX check");
        this.command = c;
        this.command.execute();
    }

    @Override
    public void setCtl(Ctrl c) {

    }
}
