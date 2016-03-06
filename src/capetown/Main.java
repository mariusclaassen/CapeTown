
package capetown;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    // Entry point of JavaFX application
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("CapeTown.fxml"));
        primaryStage.setTitle("Welcome to Cape Town");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    // Java main for when running without JavaFX launcher
    public static void main(String[] args) {
        launch(args);
    }
}
