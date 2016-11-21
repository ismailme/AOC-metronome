package src.main.java.metronome.Command;

import src.main.java.metronome.Invoker.Moteur;
import src.main.java.metronome.Receiver.Ctrl;

/**
 * Created by MELLALI on 14/10/2016.
 */
public interface Command {

    /**
     * Execute la commande.
     */
    public void execute();
    public void setMoteur(Ctrl m);
}
