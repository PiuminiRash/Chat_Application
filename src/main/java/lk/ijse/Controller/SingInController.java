package lk.ijse.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import lk.ijse.Model.ClientModel;
import lk.ijse.Server.ClientTo;

import java.net.URL;
import java.util.ResourceBundle;

public class SingInController implements Initializable {
    @FXML
    private TextField txtUserName;

    @FXML
    private TextField txtMail;

    @FXML
    private PasswordField txtPassword;

    private ClientModel clientModel = new ClientModel();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }

    @FXML
    void btnSingInOnAction(ActionEvent event) {
//        if (txtUserName.getText()==null) {
//            txtUserName.setStyle("-fx-border-color: red; -fx-border-width: 1px");
//        }
//        if (txtPassword.getText()==null) {
//            txtPassword.setStyle("-fx-border-color: red; -fx-border-width: 1px");
//        }
//        if (txtUserName.getText()!=null && txtPassword.getText()!=null) {
//            ClientTo client = clientModel
//        }
    }

    @FXML
    void linkForgotPassword(ActionEvent event) {

    }
}
