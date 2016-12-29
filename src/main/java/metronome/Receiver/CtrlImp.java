package src.main.java.metronome.Receiver;

import src.main.java.metronome.Command.*;
import src.main.java.metronome.IHM.Ihm;
import src.main.java.metronome.IHM.IhmImpl;
import src.main.java.metronome.Invoker.Moteur;
import src.main.java.metronome.Invoker.MoteurImpl;

/**
 * 
 */

public class CtrlImp implements Ctrl {

    private Moteur moteur;
    //private Ihm ihm;
    private IhmImpl ihm;
    private int tempo;
    private int mesure;
    /**
     * Default constructor
     */
    public CtrlImp(){

    }

    public CtrlImp(/*Ihm*/IhmImpl ihm) {
        this.ihm = ihm;
        this.moteur = new MoteurImpl();
        this.init();

    }


    @Override
    public void init() {
        Command marquerMesure = new MarquerMesure(this);
        Command marquerTemps = new MarquerTemps(this);
        Command updateMesure= new UpdateMesure(this);
        Command updateTempo= new UpdateTempo(this);

        this.moteur.setCmdMarquerMesure(marquerMesure);
        this.moteur.setCmdMarquerTemps(marquerTemps);
        this.moteur.setCmdUpdateMesure(updateMesure);
        this.moteur.setCmdUpdateTempo(updateTempo);

    }

    @Override
    public void UpdateTempo(/*Moteur m*/) {
        this.tempo = this.moteur.getTempo();
        this.ihm.texttempo.setText(Integer.toString(this.tempo));
    }

    @Override
    public void UpdateMesure() {
        this.mesure = this.moteur.getMesure();
        System.out.println("-> "+this.mesure);
        this.ihm.textmesure.setText(Integer.toString(this.mesure));
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
        System.out.println(">>>>>>>");this.moteur.incMesure();
    }

    @Override
    public void DecMesure() {
        this.moteur.decMesure();
    }

    @Override
    public void IncrTempo() {
        System.out.println("---->");
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