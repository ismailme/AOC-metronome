package src.main.java.metronome.Invoker;

import com.thoughtworks.xstream.mapper.Mapper;
import src.main.java.metronome.Command.Command;
import src.main.java.metronome.Command.UpdatTempo;
import src.main.java.metronome.Observer.Observer;
import src.main.java.metronome.Receiver.Ctrl;


/**
 * 
 */
public class MoteurImpl implements Moteur {

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
    private UpdatTempo tmp;

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
     * Default constructor
     */


    public MoteurImpl() {
        etat = false;
        mesure = 4;
        valTempo = 150;
    }

    public void start() {
        if (this.getEnMarche()) {
            new Thread(new Runnable() {
                public void run() {
                    MoteurImpl.this.cmdm.execute();
                    int count = 1;
                    while (MoteurImpl.this.etat) {
                        if (count%MoteurImpl.this.mesure != 0 ){
                            MoteurImpl.this.cmdm.execute();
                            count = 0;
                            continue;
                        }
                        else{
                            MoteurImpl.this.cmdt.execute();
                        }
                        count++;
                    }

                }
            }).start();
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



    /**
     * @param o
     */
    public void attach(Observer o) {

        // TODO implement here
    }

    /**
     * @param o
     */
    public void detach(Observer o) {
        // TODO implement here
    }


    @Override
    public UpdatTempo getTempo() {
        return tmp;
    }

    @Override
    public void setTempo(UpdatTempo t) {
        tmp = t;
    }

    @Override
    public int getNbrTempo() {
        return this.valTempo;
    }

    @Override
    public void setNbrTempo(int n) {
        tmp.setValTempo(n);
    }

    @Override
    public void setEnMarche(boolean m) {
        etat = m;
    }

    @Override
    public boolean getEnMarche() {
        return etat;
    }




}