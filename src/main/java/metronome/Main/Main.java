package src.main.java.metronome.Main;

import src.main.java.metronome.Command.Command;
import src.main.java.metronome.Command.MarquerMesure;
import src.main.java.metronome.Command.MarquerTemps;
import src.main.java.metronome.Invoker.Moteur;
import src.main.java.metronome.Invoker.MoteurImpl;
import src.main.java.metronome.Receiver.Ctrl;
import src.main.java.metronome.Receiver.CtrlImp;

/**
 * Created by h-raf on 11/11/16.
 */
public class Main {

    public static void main (String[] args){
        Ctrl c = new CtrlImp();
        Moteur m = new MoteurImpl();
        Command mes = new MarquerMesure(c);
        Command temps = new MarquerTemps(c);

        m.setCmdMarquerMesure(mes);
        m.setCmdMarquerTemps(temps);

        m.play(true);
    }
}
