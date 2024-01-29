package lk.ijse.Controller;

import com.jfoenix.controls.JFXCheckBox;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import lk.ijse.Model.ClientModel;
import lk.ijse.Server.ClientTo;

import java.io.IOException;
import java.sql.SQLException;

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

    private ClientModel clientModel = new ClientModel();

    @FXML
    void btnSingUpOnAction(ActionEvent event) throws SQLException, IOException {
        ClientTo client = new ClientTo(txtUserName.getText(),txtPassword.getText());
        if (checkBoxAgree.isSelected()) {
            if (!clientModel.save(client)) {
                invalidSingUp();
            } else {
                sendClientRegisterMail();

                root.getChildren().clear();
                Stage stage = (Stage) root.getScene().getWindow();
                stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/singin_form.fxml"))));
                stage.setTitle("Sign In Form");
                stage.show();
            }
        }else {
            checkBoxAgree.setStyle("-fx-background-color: #e6ff00;");
        }
    }

    private void sendClientRegisterMail() {
    }

    private void invalidSingUp() throws SQLException {
    }
}
