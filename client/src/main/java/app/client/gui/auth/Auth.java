package app.client.gui.auth;

import app.client.gui.Utility;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Auth {

    @FXML
    private Label lbl_login;

    @FXML
    private void handleLoginButton() {
        Utility.changeSceneofStage((Stage) lbl_login.getScene().getWindow(), "/app/client/fxml/auth/Login.fxml");
    }

    @FXML
    private void handleRegisterButton() {
        Utility.changeSceneofStage((Stage) lbl_login.getScene().getWindow(), "/app/client/fxml/auth/Register.fxml");
    }
}
