package metronome.Command;

/**
 * Created by MELLALI on 14/10/2016.
 */
public class UpdatTempo implements Command {

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


    public UpdatTempo(int valTempo) {
        this.valTempo = valTempo;
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

    @Override
    public void execute() {

    }
}
