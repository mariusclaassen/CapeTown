package capetown;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Controller {

    @FXML private Button stadiumButton;
    @FXML private Button islandButton;
    @FXML private ImageView imageView;
    @FXML private Label textLabel;

    @FXML public void buttonClicked (ActionEvent event){
        Image image;
         if(event.getSource().equals(stadiumButton)) {
             imageView.setImage(image = new Image("file:src/capetown/Images/CapeTownStadium.jpg"));
             textLabel.setText("The 55,000-capacity stadium used for the 2010 football world cup.");
        } else if(event.getSource().equals(islandButton)) {
            imageView.setImage(image = new Image("file:src/capetown/Images/RobbenIsland.jpg"));
            textLabel.setText("The former prison island of South Africa where Nelson Mandela spent " +
                    "18 of his 27 years' imprisonment.");
        } else {
             imageView.setImage(image = new Image("file:src/capetown/Images/TableMountain.jpg"));
             textLabel.setText("The flat-topped mountain is a prominent landmark overlooking Cape Town.");
        }
    }
}