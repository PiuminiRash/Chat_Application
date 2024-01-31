package lk.ijse.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import lk.ijse.Model.ClientModel;
import lk.ijse.Server.ClientTo;
import lk.ijse.Util.Client;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.regex.Pattern;

public class SingInController implements Initializable {
    @FXML
    private AnchorPane root;

    @FXML
    private TextField txtUserName;

    @FXML
    private TextField txtMail;

    @FXML
    private PasswordField txtPassword;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }

    @FXML
    void btnSingInOnAction(ActionEvent event) throws IOException {
        try {
            if (Pattern.matches("^[a-zA-Z\\s]+", txtUserName.getText())) {
                Client client = new Client(txtUserName.getText());

                Thread thread = new Thread(client);
                thread.start();

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void linkForgotPassword(ActionEvent event) {

    }
}
