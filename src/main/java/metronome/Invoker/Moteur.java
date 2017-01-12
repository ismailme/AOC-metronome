package src.main.java.metronome.Invoker;

import src.main.java.metronome.Command.Command;



/**
 * Moteur
 */
public interface Moteur {

    /**
     * initialise le moteur
     */
    public void init();


    /**
     * Retourne le temps par mesure
     * @return le temps par mesure
     */
    public int getTempo();

    /**
     * Retourne la mesure
     * @return mesure
     */
    public int getMesure();

    /**
     * Met a jour le temps par mesur
     * @param n : le  temps par mesure
     */
   // public void setNbrTempo(int n);

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

    /**
     * Lance ou arrête le métronome
     * @param play
     */
    public void play(boolean play);

    /**
     * Incrementer le tempo de 1
     */
    public void incTempo();

    /**
     * decremente le tempo de 1
     */
    public void decTempo();

    /**
     * incremente la mesure de 1

     */
    public void incMesure();

    /**
     * decremente la mesure de 1
     */
    public void decMesure();

    /**
     * Setter Mesure
     * @param mesure
     */
    public void setMesure(int mesure);

    /**
     * Setter Tempo
     * @param tempo
     */
    public void setTempo(int tempo);

    /**
     * Setter Commande Update Mesure
     * @param cmd
     */
    void setCmdUpdateMesure(Command cmd);

    /**
     * Setter Commande Update Tempo
     * @param cmd
     */
    void setCmdUpdateTempo(Command cmd);





}