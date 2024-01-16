package lk.ijse.Controller;

import com.jfoenix.controls.JFXCheckBox;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class SingUpFormController {
    @FXML
    private AnchorPane root;

    @FXML
    private TextField txtUserName;

    @FXML
    private TextField txtMail;

    @FXML
    private JFXCheckBox checkBoxAgree;

    @FXML
    private PasswordField txtPassword;

    @FXML
    void btnSingUpOnAction(ActionEvent event) {

    }
}
