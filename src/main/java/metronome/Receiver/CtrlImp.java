package src.main.java.metronome.Receiver;

import src.main.java.metronome.Invoker.Moteur;

/**
 * 
 */

public class CtrlImp implements Ctrl {

    Moteur moteur;

    /**
     * Default constructor
     */
    public CtrlImp() {
    }

    public CtrlImp(Moteur m){
        this.moteur = m;
    }

    @Override
    public void UpdateTempo(Moteur m) {

    }

    public void marquerTemps() {
        System.out.println("marquer temps");
    }

    public void marquerMesure() {
        System.out.println("marquer mesure");
    }

    @Override
    public void IncrMesure() {

    }

    @Override
    public void DecMesure() {

    }

    @Override
    public void IncrTempo() {

    }

    @Override
    public void DecTempo() {

    }


}