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



}