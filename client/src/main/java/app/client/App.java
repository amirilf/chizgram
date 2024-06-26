package app.client;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {
    @SuppressWarnings("exports")
    @Override
    public void start(Stage stage) {
        try {
<<<<<<< HEAD
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/app/client/fxml/auth/Auth.fxml"));
=======
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/app/client/fxml/panel/Base.fxml"));
>>>>>>> e585739698b208530bdcb7d66b93d53c612cc543
            Parent root = loader.load();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.setTitle("Chizgram");
            stage.setResizable(false);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch();
    }
}
