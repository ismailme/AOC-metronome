package src.main.java.metronome.Command;

import src.main.java.metronome.Receiver.Ctrl;

/**
 * Created by H-raf on 22/12/2016.
 */
public class UpdateCurseur implements Command {

    int val;
    Ctrl c;

    public UpdateCurseur(){


    }

    public UpdateCurseur(int val,Ctrl c){
        this.val = val;
        this.c = c;
    }
    @Override
    public void execute() {
        System.out.println("Update Curszur  check");
        this.c.updateCurseur(this.getVal());

    }

    @Override
    public void setMoteur(Ctrl m) {
        this.c=m;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }
}
