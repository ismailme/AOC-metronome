package src.main.java.metronome.Receiver;

import src.main.java.metronome.Command.Command;
import src.main.java.metronome.Command.MarquerMesure;
import src.main.java.metronome.Command.MarquerTemps;
import src.main.java.metronome.IHM.Ihm;
import src.main.java.metronome.Invoker.Moteur;
import src.main.java.metronome.Invoker.MoteurImpl;

/**
 * 
 */

public class CtrlImp implements Ctrl {

    Moteur moteur;
    Ihm ihm;

    /**
     * Default constructor
     */
    public CtrlImp(){

    }

    public CtrlImp(Ihm ihm) {
        this.ihm = ihm;
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
        this.ihm.marquerTemps();
        System.out.println("marquer temps");
    }

    public void marquerMesure() {
        this.ihm.marquerMesure();
        System.out.println("marquer mesure");
    }

    @Override
    public void IncrMesure() {
        this.moteur.incMesure();
    }

    @Override
    public void DecMesure() {
        this.moteur.decMesure();
    }

    @Override
    public void IncrTempo() {

        this.moteur.incTempo();
    }

    @Override
    public void DecTempo() {
        this.moteur.decTempo();
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
    public void updateCurseur(int v) {
        System.out.println("without if check v= "+v);
        if( v <= 300 && v >= 30){
            System.out.println("controler check");
            this.moteur.setTempo(v);
        }
    }

    @Override
    public void setMoteur(Moteur m) {
        this.moteur = m;
    }


}