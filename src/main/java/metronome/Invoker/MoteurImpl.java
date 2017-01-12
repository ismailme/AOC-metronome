package src.main.java.metronome.Invoker;

import src.main.java.metronome.Command.Command;
import src.main.java.metronome.Command.IncrTempo;
import src.main.java.metronome.Command.UpdateTempo;
import src.main.java.metronome.Observer.Observer;
import src.main.java.metronome.Subject.Subject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Moteur
 */
public class MoteurImpl implements Moteur,Subject
{

    /**
     * Commande  de marquer temps
     */
    private Command cmdt;

    /**
     *  Commande marquer mesure
     */
    private Command cmdm;


    /**
     * L'etat du Moteur
     */
    private boolean etat;


    /**
     * La valeur du nombre de temps par mesure
     */
    private int mesure;

    /**
     * minimum Mesure
     */
    public static final int Min_NbMesure = 2;

    /**
     * maximum  Mesure
     */
    public  static final int Max_NbMesure = 7;

    /**
     * Minimum Tempo
     */
    public static final int mintempo = 30;
    /**
     * Maximum Tempo
     */
    public static final int maxtempo = 300;

    /**
     * Valeur du Tempo
     */
    private int tempo;

    /**
     *
     */
    private List<Observer> observers;


    /**
     * Default constructor
     */
    private Command updateMesure;
    private Command updateTempo;

    public MoteurImpl() {

        this.observers = new ArrayList<>();
        this.init();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void init() {

        etat = false;
        mesure = 5;
        tempo = 120;

    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setCmdUpdateMesure(Command cmd){
        this.updateMesure = cmd;

    }

    /**
     * Set Commande
     * {@inheritDoc}
     * @param cmd
     */
    @Override
    public void setCmdUpdateTempo(Command cmd){
        this.updateTempo = cmd;

    }

    /**
     *
     * start metronome
     */
    public void start() {
            new Thread(new Runnable() {
                public void run() {
                    int count = 1;
                        while (MoteurImpl.this.etat) {
                            if (count % MoteurImpl.this.mesure != 0) {

                                cmdm.execute();
                                System.out.println("2");
                                count++;
                            } else {

                                cmdt.execute();
                                count = 1;
                            }
                            try {
                                Thread.sleep((60000/MoteurImpl.this.tempo));
                                //Thread.sleep(500);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                }
            }).start();
    }

    /**
     * play metronome
     * @param play
     */
    public void play(boolean play){
        if(etat == play)
            return;
        this.etat=play;
        if(etat){
            this.start();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void incTempo() {
        this.tempo+=1;
        setTempo(this.tempo);
        System.out.println("tempooo "+this.getTempo());

    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void decTempo() {
        this.tempo-=1;
        setTempo(this.tempo);
        System.out.println("tempooo "+this.getTempo());

    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void incMesure() {
        if(this.mesure+1 <= this.Max_NbMesure) {
            this.mesure += 1;
            setMesure(this.mesure);
        }
        System.out.println("mesure "+this.getMesure());
        //this.updateMesure.execute();

    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void decMesure() {

        if(this.mesure-1 >= this.Min_NbMesure) {
            this.mesure -= 1;
            setMesure(this.mesure);
        }
        System.out.println("mesure "+this.getMesure());

    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setCmdMarquerTemps(Command c) {
        this.cmdt = c;

    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setCmdMarquerMesure(Command c) {
        this.cmdm = c;

    }

    /**
     *
     * @return valeur tempo
     */
    public int getTempo() {
        return this.tempo;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getMesure() {
        return this.mesure;
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public void setEnMarche(boolean m) {
        etat = m;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean getEnMarche() {
        return etat;
    }


    /**
     * @param o
     */
    public void attach(Observer o) {

        // TODO implement here
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void notifyObservers() {

        // TODO implement here
    }

    /**
     * @param o
     */
    public void detach(Observer o) {

        // TODO implement here
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setMesure(int mesure) {
        if(mesure >= Min_NbMesure && mesure <= Max_NbMesure){
        if(updateMesure != null)
           this.updateMesure.execute();}

    }


    /**
     * {@inheritDoc}
     */
    @Override
    public void setTempo(int tempo) {

        if(tempo >= mintempo && tempo <= maxtempo){
        this.tempo = tempo;
        if(this.updateTempo != null){
        this.updateTempo.execute();}}
        System.out.println("Tempo updated to "+this.tempo);

   }
}