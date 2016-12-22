package src.main.java.metronome.Receiver;

import src.main.java.metronome.Invoker.Moteur;


/**
 * 
 */
public interface Ctrl {

    /**
     * initialise le controlleur et configure le moteur
     */
    public void init();

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
     * Incrementer la mesure
     */
    public void IncrMesure();

    /**
     * Decrementer al mesure
     */
    public void DecMesure();

    /**
     * Incrementer le tempo
     */
    public void IncrTempo();

    /**
     * Decrementer le tempo
     */
    public void DecTempo();

    /**
     * démarre le métronome
     */
    public void start();

    /**
     * arrête le métronome
     */
    public void stop();

    /**
     * update tempo
     */
    public void updateCurseur(int v);

    /**
     *
     * @param m
     */
    public void setMoteur(Moteur m);


}