package src.main.java.metronome.Test;

import org.junit.Before;
import org.junit.Test;
import src.main.java.metronome.Receiver.CtrlImp;

import static org.junit.Assert.assertEquals;

/**
 * Created by MELLALI on 12/01/2017.
 */
public class CtrlImpTest {
    CtrlImp ctrl;


    @Before
    public void SetUp() throws Exception{
        this.ctrl = new CtrlImp();
        this.ctrl.start();

    }

    @Test
    public void init() throws Exception {

    }

    @Test
    public void updateTempo() throws Exception {
        // test ihm
    }

    @Test
    public void updateMesure() throws Exception {
        // test ihm
    }


    @Test
    public void incrMesure() throws Exception {
        // mesure initialisé a 5
        ctrl.IncrMesure(); // 6
        ctrl.IncrMesure(); // 7
        ctrl.IncrMesure(); // 7
        ctrl.IncrMesure(); // 7
        ctrl.IncrMesure(); // 7

        assertEquals("Not equal",this.ctrl.getMoteur().getMesure(),7);
    }

    @Test
    public void decMesure() throws Exception {
        ctrl.DecMesure();
        assertEquals("Not equal",this.ctrl.getMoteur().getMesure(),4);

    }

    @Test
    public void incrTempo() throws Exception {
        // Tempo intialisé à 120
        ctrl.getMoteur().setTempo(145);
        ctrl.IncrTempo();
        ctrl.IncrTempo();
        assertEquals("Not equal ",this.ctrl.getMoteur().getTempo(),147);
    }


    @Test
    public void decTempo() throws Exception {
        // Tempo intialisé à 120
        ctrl.DecTempo();
        ctrl.DecTempo();
        assertEquals("Not equal",this.ctrl.getMoteur().getTempo(),118);
    }

    @Test
    public void start() throws Exception {
        assertEquals("Not equal",this.ctrl.getMoteur().getEnMarche(),true);

    }


    @Test
    public void stop() throws Exception {
        ctrl.stop();
        assertEquals("Not equal",this.ctrl.getMoteur().getEnMarche(),false);

    }

    @Test
    public void updateCurseur() throws Exception {
        ctrl.updateCurseur(145);
//        ctrl.UpdateTempo();
        assertEquals("Not equal",this.ctrl.getMoteur().getTempo(),145);
    }


}