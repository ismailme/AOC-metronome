package src.main.java.metronome.Invoker;

import src.main.java.metronome.Command.Command;
import src.main.java.metronome.Command.UpdatTempo;



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
    private int Mesure;

    /**
     * minimum Mesure
     */
    public static final int Min_NbMesure = 2;

    /**
     * maximum  Mesure
     */
    public  static final int Max_NbMesure = 7;


    /**
     * Default constructor
     */
    public MoteurImpl() {
        etat = false;
        Mesure = 4;
    }

    @Override
    public void setCmdMarquerTemps(Command c) {
        this.cmdt = c;
        cmdt.execute();
    }

    @Override
    public void setCmdMarquerMesure(Command c) {
        this.cmdm = c;
        cmdt.execute();
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
    public Integer getNbrTempo() {
        return null;
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