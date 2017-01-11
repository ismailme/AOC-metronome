package src.main.java.metronome.Command;

import src.main.java.metronome.Invoker.Moteur;
import src.main.java.metronome.Receiver.Ctrl;

/**
 * PC Command
 */
public interface Command {

    /**
     * Execute la commande.
     */
    public void execute();

    /**
     *
     * @param m
     */
    public void setMoteur(Ctrl m);
}
