package src.main.java.metronome.Invoker;

import src.main.java.metronome.Command.Command;
import src.main.java.metronome.Observer.Observer;
import src.main.java.metronome.Subject.Subject;

import java.util.ArrayList;
import java.util.List;


/**
 * 
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
     * La valeur du Tempo
     */
   // private UpdatTempo tmp;

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
    private int valTempo;

    /**
     *
     */
    private List<Observer> observers;


    /**
     * Default constructor
     */


    public MoteurImpl() {
        etat = false;
        mesure = 5;
        valTempo = 150;
        this.observers = new ArrayList<>();
    }

    public void start() {
            new Thread(new Runnable() {
                public void run() {
                    MoteurImpl.this.cmdm.execute();
                    int count = 2;
                        while (MoteurImpl.this.etat) {
                            if (count % MoteurImpl.this.mesure != 0) {
                                MoteurImpl.this.cmdm.execute();
                                count++;
                            } else {
                                MoteurImpl.this.cmdt.execute();
                                count = 1;
                            }
                            try {
                               // Thread.sleep((60/MoteurImpl.this.valTempo));
                                Thread.sleep(500);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                }
            }).start();
    }

    public void play(boolean play){
        if(this.etat == play)
            return;
        this.etat=play;
        if(etat){
            this.start();
        }
    }

    @Override
    public void setCmdMarquerTemps(Command c) {
        this.cmdt = c;
        //cmdt.execute();
    }

    @Override
    public void setCmdMarquerMesure(Command c) {
        this.cmdm = c;
        //cmdt.execute();
    }


   /* @Override
    public UpdatTempo getTempo() {
        return tmp;
    }

    @Override
    public void setTempo(UpdatTempo t) {
        tmp = t;
    }
*/
    @Override
    public int getNbrTempo() {
        return this.valTempo;
    }

  /*  @Override
    public void setNbrTempo(int n) {
        tmp.setValTempo(n);
    }*/

    @Override
    public void setEnMarche(boolean m) {
        etat = m;
    }

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



}