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

    MoteurImpl moteur;

    @Before
    public void setUp() throws Exception {
        moteur = new MoteurImpl();



    }

    @Test
    public void init() throws Exception {

    }

    @Test
    public void getTempo() throws Exception {
        assertEquals("valeur tempo non equal assert1",this.moteur.getTempo(),120);
        this.moteur.decTempo();
        this.moteur.decTempo();
        assertEquals("valeur tempo non equal assert2",this.moteur.getTempo(),118);
    }

    @Test
    public void getMesure() throws Exception {

       assertEquals("valeur mesure non equal assert1",this.moteur.getMesure(),5);
        this.moteur.incMesure();
        this.moteur.incMesure();
        assertEquals("valeur mesure non equal assert2",this.moteur.getMesure(),7);
    }

    @Test
    public void setEnMarche() throws Exception {
        this.moteur.setEnMarche(false);
        assertFalse("setEnMarche(): valeur en marche erreur assert 1",this.moteur.getEnMarche());
        this.moteur.setEnMarche(true);
        assertTrue("setEnMarche(): valeur en marche erreur assert 1",this.moteur.getEnMarche());

    }

    @Test
    public void getEnMarche() throws Exception {
        assertFalse(" getEnMarche() : valeur en marche erreur assert 1",this.moteur.getEnMarche());
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
        this.moteur.decTempo();
        this.moteur.decTempo();
        this.moteur.decTempo();
        this.moteur.decTempo();
        this.moteur.decTempo();
        this.moteur.decTempo();
        this.moteur.decTempo();
        this.moteur.decTempo();
        this.moteur.decTempo();
        this.moteur.decTempo();
        this.moteur.decTempo();
        this.moteur.decTempo();
        assertEquals("decTempo(): val tempo erroné assert1",this.moteur.getTempo(),108);

        this.moteur.setTempo(305);
        assertEquals("decTempo(): val tempo erroné assert2",this.moteur.getTempo(),108);



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