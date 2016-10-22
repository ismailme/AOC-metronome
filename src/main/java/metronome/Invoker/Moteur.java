package src.main.java.metronome.Invoker;

import src.main.java.metronome.Command.Command;
import src.main.java.metronome.Command.UpdatTempo;

import java.util.*;

/**
 * 
 */
public interface Moteur {


    /**
     * @param o
     */
    public void attach(Observer o);

    /**
     * @param o
     */
    public void detach(Observer o);



    public UpdatTempo getTempo();

    /**
     * Met a jour le tempo
     * @param t
     */
    public void setTempo(UpdatTempo t);

    /**
     * Retourne le temps par mesure
     * @return le temps par mesure
     */
    public int getNbrTempo();

    /**
     * Met a jour le temps par mesur
     * @param n : le  temps par mesure
     */
    public void setNbrTempo(int n);

    /**
     * On ou Off le MoteurMetronom
     * @param m : etat du MoteurMetronome
     */
    public void setEnMarche(boolean m);

    /**
     * Retourne l'etat du MoteurMetronome
     * @return l'etat du MoteurMetronome
     */
    public boolean getEnMarche();

    /**
     * Met a jour la commande permettant de marquer le temps
     * @param cmdt
     */
    public void setCmdMarquerTemps(Command cmdt);

    /**
     * Met a jour la commande permettant de marquer la mesure
     * @param cmdm
     */
    public void setCmdMarquerMesure(Command cmdm);



}