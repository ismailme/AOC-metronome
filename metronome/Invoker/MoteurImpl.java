package metronome.Invoker;

import metronome.Command.Command;
import metronome.Command.UpdatTempo;

import java.util.*;

/**
 * 
 */
public class MoteurImpl implements Moteur {

    /**
     * Default constructor
     */
    public MoteurImpl() {
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
        return null;
    }

    @Override
    public void setTempo(UpdatTempo t) {

    }

    @Override
    public Integer getNbrTempo() {
        return null;
    }

    @Override
    public void setNbrTempo(Integer n) {

    }

    @Override
    public void setEnMarche(Boolean m) {

    }

    @Override
    public Boolean getEnMarche() {
        return null;
    }

    @Override
    public void setCmdMarquerTemps(Command cmdt) {

    }

    @Override
    public void setCmdMarquerMesure(Command cmdm) {

    }


}