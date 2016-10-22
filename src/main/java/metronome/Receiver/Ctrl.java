package src.main.java.metronome.Receiver;

import src.main.java.metronome.Invoker.Moteur;

/**
 * 
 */
public interface Ctrl {


    /**
     * @param m
     */
    public void UpdateTempo(Moteur m);

    /**
     * Marquer un temps
     */
    public void marquerTemps();

    /**
     * Marquer une mesure
     */
    public void marquerMesure();

    /**
     * Incrementer la valeur du tempo
     */
    public void IncrTempo();

    /**
     * Decrementer la valeur du tempo
     */
    public void DecrTempo();

}