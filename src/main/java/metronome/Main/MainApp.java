package src.main.java.metronome.Main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.AmbientLight;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


/**
 */
public class MainApp extends Application{
    public static void main (String[] args) {

        launch(args);
    }

    /**
     *
     * {@inheritDoc}
     * @param primaryStage
     * @throws Exception
     */
    @Override
    public void start(Stage primaryStage) throws Exception {
        System.out.println("staraaaaaart");
        Parent root = FXMLLoader.load(getClass().getResource("../sample.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setTitle("métronome V1");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
