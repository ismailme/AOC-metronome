package src.main.java.metronome.Command;

import src.main.java.metronome.Receiver.Ctrl;

/**
 * Mise à jour de la valeur de curseur
 */
public class UpdateCurseur implements Command {

    int val;
    Ctrl c;

    public UpdateCurseur(){


    }

    /**
     * Modifier valeur curseur
     * @param val
     * @param c
     */
    public UpdateCurseur(int val,Ctrl c){
        this.val = val;
        this.c = c;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void execute() {
        System.out.println("Update Curszur  check");
        this.c.updateCurseur(this.getVal());

    }

    /**
     * {@inheritDoc}
     * @param m
     */
    @Override
    public void setMoteur(Ctrl m) {
        this.c=m;
    }

    /**
     *
     * @return valeur curseur
     */
    public int getVal() {
        return val;
    }

    /**
     * Return valeur curseur
     * @param val
     */
    public void setVal(int val) {
        this.val = val;
    }
}
