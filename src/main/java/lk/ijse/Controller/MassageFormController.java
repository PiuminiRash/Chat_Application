package lk.ijse.Controller;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

public class MassageFormController extends Thread {
    @FXML
    private AnchorPane root;

    @FXML
    private ScrollPane scrollPanne;

    @FXML
    private VBox vBox;

    @FXML
    private TextField txtMsg;

    @FXML
    private AnchorPane emojiAnchorPane;

    @FXML
    private GridPane emojiGridPane;

    @FXML
    private Label lblName;

    BufferedReader reader;

    PrintWriter writer;

    Socket socket;

    private FileChooser fileChooser;

    private File filePath;

    BufferedReader bufferedReader;

    PrintWriter printWriter;

    public void initialize(){
        try {
            socket = new Socket("localhost",3000);
            System.out.println("server connected");
            bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            printWriter = new PrintWriter(socket.getOutputStream());

        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    void txtMsgOnAction(ActionEvent event) throws IOException {
        sendMessage();
    }

    private void sendMessage() {
        String text = txtMsg.getText();
        if (text != null) {
            appendText(text);
            //client.sendMessage(text);
            txtMsg.setText(null);
        }

    }

    void appendText(String message) {
        HBox hBox = new HBox();
        hBox.setStyle("-fx-alignment: center-right;-fx-fill-height: true;-fx-min-height: 50;-fx-pref-width: 520;-fx-max-width: 520;-fx-padding: 10");
        Label messageLbl = new Label(message);
        messageLbl.setStyle("-fx-background-color:  #e6ff00;-fx-background-radius:15;-fx-font-size: 16;-fx-font-weight: normal;-fx-text-fill: white;-fx-wrap-text: true;-fx-alignment: center-left;-fx-content-display: left;-fx-padding: 10;-fx-max-width: 350;");
        hBox.getChildren().add(messageLbl);
        vBox.getChildren().add(hBox);

    }

    public void writeMessage(String message) {
        HBox hBox = new HBox();
        hBox.setStyle("-fx-alignment: center-left;-fx-fill-height: true;-fx-min-height: 50;-fx-pref-width: 520;-fx-max-width: 520;-fx-padding: 10");
        Label messageLbl = new Label(message);
        messageLbl.setStyle("-fx-background-color:   #696969;-fx-background-radius:15;-fx-font-size: 16;-fx-font-weight: normal;-fx-text-fill: white;-fx-wrap-text: true;-fx-alignment: center-left;-fx-content-display: left;-fx-padding: 10;-fx-max-width: 350;");
        hBox.getChildren().add(messageLbl);
        Platform.runLater(() -> vBox.getChildren().add(hBox));

    }

}
