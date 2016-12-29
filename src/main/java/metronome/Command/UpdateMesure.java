package src.main.java.metronome.Command;

import src.main.java.metronome.Receiver.Ctrl;

/**
 * Created by MELLALI on 29/12/2016.
 */
public class UpdateMesure implements Command {
    /**
     * Minimum Mesure
     */
    public static final int minmesure = 2;
    /**
     * Maximum Tempo
     */
    public static final int maxmesure = 7;

    /**
     * Valeur du Tempo
     */
    private int valMesure;

    Ctrl controler;

    public UpdateMesure(int valMesure) {
        this.valMesure = valMesure;
    }

    public UpdateMesure(Ctrl controler) {
        this.controler = controler;
    }

    public void setValMesure(int valMesure) {
        this.valMesure = valMesure;
    }

    public void setControler(Ctrl controler) {
        this.controler = controler;
    }

    public static int getMinmesure() {
        return minmesure;
    }

    public static int getMaxmesure() {
        return maxmesure;
    }

    @Override
    public void execute() {
        this.controler.UpdateMesure();


    }

    @Override
    public void setMoteur(Ctrl m) {
        this.controler = m;

    }
}
