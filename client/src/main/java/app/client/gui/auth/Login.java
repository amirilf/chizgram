package app.client.gui.auth;

import app.client.gui.Utility;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Login {

    @FXML
    private TextField fld_username;

    @FXML
    private PasswordField fld_password;

    @FXML
    private void handleLoginButton() {
        System.out.println("Login button clicked!");
    }

    @FXML
    private void handleRegisterPageButton() {
        Utility.changeSceneofStage((Stage) fld_username.getScene().getWindow(), "/app/client/fxml/auth/Register.fxml");
    }

    @FXML
    private void handleAuthPageButton() {
        Utility.changeSceneofStage((Stage) fld_password.getScene().getWindow(), "/app/client/fxml/auth/Auth.fxml");
    }
}
