package src.main.java.metronome.Invoker;

import src.main.java.metronome.Command.Command;
import src.main.java.metronome.Command.UpdatTempo;

import java.util.*;

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
    private Boolean etat;

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
    public void setNbrTempo(Integer n) {
            tmp.setValTempo(n);
    }

    @Override
    public void setEnMarche(Boolean m) {
        etat = m;
    }

    @Override
    public Boolean getEnMarche() {
        return etat;
    }

    @Override
    public void setCmdMarquerTemps(Command cmdt) {

    }

    @Override
    public void setCmdMarquerMesure(Command cmdm) {

    }


}