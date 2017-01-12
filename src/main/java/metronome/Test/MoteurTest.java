package src.main.java.metronome.Test;

import org.junit.Before;
import org.junit.Test;
import src.main.java.metronome.Command.Command;
import src.main.java.metronome.Command.UpdateMesure;
import src.main.java.metronome.IHM.Ihm;
import src.main.java.metronome.IHM.IhmImpl;
import src.main.java.metronome.Invoker.MoteurImpl;
import src.main.java.metronome.Receiver.CtrlImp;

import static org.junit.Assert.*;

/**
 * Created by H-raf on 12/01/2017.
 */
public class MoteurTest {

    IhmImpl ihm;

    @Before
    public void setUp() throws Exception {
        ihm = new IhmImpl();


    }

    @Test
    public void init() throws Exception {

    }

    @Test
    public void getTempo() throws Exception {
        assertEquals("valeur tempo non equal assert1",this.ihm.getCtl().getMoteur().getTempo(),120);
        this.ihm.getCtl().getMoteur().decTempo();
        this.ihm.getCtl().getMoteur().decTempo();
        assertEquals("valeur tempo non equal assert2",this.ihm.getCtl().getMoteur().getTempo(),118);
    }

    @Test
    public void getMesure() throws Exception {
        /*Command c = new UpdateMesure();
        this.moteur.setCmdUpdateMesure(c);
        assertEquals("valeur mesure non equal assert1",this.moteur.getMesure(),5);
        this.moteur.incMesure();
        this.moteur.incMesure();
        assertEquals("valeur mesure non equal assert2",this.moteur.getMesure(),7);*/
    }

    @Test
    public void setEnMarche() throws Exception {

    }

    @Test
    public void getEnMarche() throws Exception {

    }

    @Test
    public void setCmdMarquerTemps() throws Exception {

    }

    @Test
    public void setCmdMarquerMesure() throws Exception {

    }

    @Test
    public void play() throws Exception {

    }

    @Test
    public void incTempo() throws Exception {

    }

    @Test
    public void decTempo() throws Exception {

    }

    @Test
    public void incMesure() throws Exception {

    }

    @Test
    public void decMesure() throws Exception {

    }

    @Test
    public void setMesure() throws Exception {

    }

    @Test
    public void setTempo() throws Exception {

    }

    @Test
    public void setCmdUpdateMesure() throws Exception {

    }

    @Test
    public void setCmdUpdateTempo() throws Exception {

    }

}