package lk.ijse.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class WelcomeFormController {
    @FXML
    private AnchorPane root;

    @FXML
    void btnSingInOnAction(ActionEvent event) throws IOException {
        root.getChildren().clear();
        Stage stage = (Stage) root.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/singin_form.fxml"))));
        stage.setTitle("Sign In Form");
        stage.show();
    }

    @FXML
    void btnSingUpOnAction(ActionEvent event) throws IOException {
        root.getChildren().clear();
        Stage stage = (Stage) root.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/singup_form.fxml"))));
        stage.setTitle("Sign Up Form");
        stage.show();
    }
}
