package src.main.java.metronome.IHM;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import src.main.java.metronome.Command.*;
import src.main.java.metronome.Invoker.ButtonFX;
import src.main.java.metronome.Invoker.ButtonFXImpl;
import src.main.java.metronome.Invoker.CurseurFX;
import src.main.java.metronome.Invoker.CurseurFXImpl;
import src.main.java.metronome.Receiver.Ctrl;
import src.main.java.metronome.Receiver.CtrlImp;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Ihm
 */
public class IhmImpl implements Ihm,Initializable {


    Ctrl ctl;
    @FXML Button incrementerT,decrementerT,incrementerM,decrementerM,startMetro,stopMetro;
    @FXML Circle ledTemps,ledMesure;
    @FXML Slider tempo;
    @FXML public TextField textmesure, texttempo;
    Command incrT,decrT,incrM,decrM,start,stop;
    ButtonFX btn;
    CurseurFX cFX;

    /**
     *  sono metronome
     */
    private MediaPlayer SonoLed1 = null, SonoLed2 = null;

    public IhmImpl(){
        this.ctl = new CtrlImp(this);
        this.btn = new ButtonFXImpl();
        this.cFX = new CurseurFXImpl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void initialize(URL location, ResourceBundle resources) {

        this.incrT = new IncrTempo();
        this.incrT.setMoteur(this.ctl);

        this.decrT = new DecTempo();
        this.decrT.setMoteur(this.ctl);

        this.incrM = new IncMesure();
        this.incrM.setMoteur(this.ctl);

        this.decrM = new DecMesure();
        this.decrM.setMoteur(this.ctl);

        this.start = new StartMetronome();
        this.start.setMoteur(this.ctl);

        this.stop = new StopMetronome();
        this.stop.setMoteur(this.ctl);


        this.btn = new ButtonFXImpl();
        this.textmesure.setText("5");
        this.texttempo.setText("120");


        this.incrementerT.setOnAction((event -> {
            this.btn.setCmd(this.incrT);
        }));

        this.decrementerT.setOnAction((event -> {
            this.btn.setCmd(this.decrT);
        }));

        this.incrementerM.setOnAction((event -> {
            this.btn.setCmd(this.incrM);
        }));

        this.decrementerM.setOnAction((event -> {
            this.btn.setCmd(this.decrM);
        }));

        this.startMetro.setOnAction((event -> {
            this.btn.setCmd(this.start);
        }));

        this.stopMetro.setOnAction((event -> {
            this.btn.setCmd(this.stop);
        }));

        this.tempo.valueProperty().addListener((observable, oldValue, newValue) ->{
            this.cFX.setCmd(new UpdateCurseur(newValue.intValue(),this.ctl));

        });

        final Media soundLED1 = new Media(getClass().getResource("/sound/led1.wav").toString());
        SonoLed1 = new MediaPlayer(soundLED1);
        SonoLed1.setCycleCount(MediaPlayer.INDEFINITE);

        final Media soundLED2 = new Media(getClass().getResource("/sound/led2.wav").toString());
        SonoLed2 = new MediaPlayer(soundLED2);
        SonoLed2.setCycleCount(MediaPlayer.INDEFINITE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void marquerTemps() {

        ledTemps.setFill(Color.web("#1fff32"));


        SonoLed1.play();
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ledTemps.setFill(Color.web("#1fff327d"));

        SonoLed1.stop();
    }

    /**
     *
     * {@inheritDoc}
     */
    @Override
    public void marquerMesure() {
        ledMesure.setFill(Color.web("#ff1f1f"));
        SonoLed2.play();
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ledMesure.setFill(Color.web("#ff1f1f7d"));
        SonoLed2.stop();

    }

    public Ctrl getCtl() {
        return ctl;
    }

    public void setCtl(Ctrl ctl) {
        this.ctl = ctl;
    }
}
