package src.main.java.metronome.Receiver;

import src.main.java.metronome.Command.Command;
import src.main.java.metronome.Command.MarquerMesure;
import src.main.java.metronome.Command.MarquerTemps;
import src.main.java.metronome.Invoker.Moteur;
import src.main.java.metronome.Invoker.MoteurImpl;

/**
 * 
 */

public class CtrlImp implements Ctrl {

    Moteur moteur;

    /**
     * Default constructor
     */
    public CtrlImp() {
        this.moteur = new MoteurImpl();
        this.init();
    }


    @Override
    public void init() {
        Command marquerMesure = new MarquerMesure(this);
        Command marquerTemps = new MarquerTemps(this);

        this.moteur.setCmdMarquerMesure(marquerMesure);
        this.moteur.setCmdMarquerTemps(marquerTemps);

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

        this.moteur.incTempo();
    }

    @Override
    public void DecTempo() {

    }

    @Override
    public void start() {
        this.moteur.play(true);
    }

    @Override
    public void stop() {
        this.moteur.play(false);
    }

    @Override
    public void setMoteur(Moteur m) {
        this.moteur = m;
    }


}