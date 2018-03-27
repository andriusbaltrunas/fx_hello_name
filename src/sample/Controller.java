package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private Label myDummyText;

    @FXML
    private TextField myDummyTextField;

    public void changeText(ActionEvent event){
        String txt = myDummyText.getText();
        String input = myDummyTextField.getText();
        myDummyTextField.setText("");
        myDummyText.setText(txt + " " + input);
}
}