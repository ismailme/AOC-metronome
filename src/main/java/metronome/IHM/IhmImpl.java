package src.main.java.metronome.IHM;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import src.main.java.metronome.Command.*;
import src.main.java.metronome.Invoker.ButtonFX;
import src.main.java.metronome.Invoker.ButtonFXImpl;
import src.main.java.metronome.Receiver.Ctrl;
import src.main.java.metronome.Receiver.CtrlImp;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by H-raf on 17/11/2016.
 */
public class IhmImpl implements Ihm,Initializable {


    Ctrl ctl;
    @FXML Button incrementerT,decrementerT,incrementerM,decrementerM,startMetro,stopMetro;
    Command incrT,decrT,incrM,decrM,start,stop;
    ButtonFX btn;

    public IhmImpl(){
        this.ctl = new CtrlImp();
        this.btn = new ButtonFXImpl();
    }

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



        this.btn = new ButtonFXImpl();



        this.incrementerT.setOnAction((event -> {
            this.btn.setCmd(this.incrT);
            System.out.println("incrementer Tempo bejeghe");
        }));

        this.decrementerT.setOnAction((event -> {
            this.btn.setCmd(this.decrT);
            System.out.println("decrementer Tempo bejeghe");
        }));

        this.incrementerM.setOnAction((event -> {
            this.btn.setCmd(this.incrM);
            System.out.println("incrementer mesure bejeghe");
        }));

        this.decrementerM.setOnAction((event -> {
            this.btn.setCmd(this.decrM);
            System.out.println("decrementer mesure bejeghe");
        }));

        this.startMetro.setOnAction((event -> {
            System.out.println("1");
            this.btn.setCmd(this.start);
            System.out.println("start bejeghe");
        }));
    }



}
