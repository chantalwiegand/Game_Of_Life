package gameoflife;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
/**
 * "Aan de slag met Java en JavaFX" opstartklasse
 * @author chantalwiegand
 */
public class GameOfLife extends Application 
{

    @Override
    public void start(Stage primaryStage) 
    {
        GridPane root = new GridPane();
        Scene scene = new Scene(root, 527, 525);

        // start here new GUI
        new Pane(root);


        primaryStage.setTitle("Game of life");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        launch(args);
    }

}
