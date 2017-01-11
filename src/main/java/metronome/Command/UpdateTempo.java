package src.main.java.metronome.Command;

import src.main.java.metronome.Receiver.Ctrl;

/**
 *
 * Mise à jour de la valeur de tempo
 */
public class UpdateTempo implements Command {

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

    Ctrl controler;


    public UpdateTempo(int valTempo) {
        this.valTempo = valTempo;
    }

    /**
     * Update Tempo
     * @param controler
     */
    public UpdateTempo(Ctrl controler) {
        this.controler = controler;
    }

    public static int getMintempo() {
        return mintempo;
    }

    public static int getMaxtempo() {
        return maxtempo;
    }

    public int getValTempo() {
        return valTempo;
    }

    public void setValTempo(int valTempo) {
        this.valTempo = valTempo;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void execute() {
            this.controler.UpdateTempo();
    }


    /**
     * {@inheritDoc}
     * @param m
     */
    @Override
    public void setMoteur(Ctrl m) {
        this.controler = m;
    }
}
