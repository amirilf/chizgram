package app.client.gui.panel;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

public class Rightbar {

    @FXML
    private Label lbl_title;

    @FXML
    private Label lbl_detail;

    @FXML
    private ImageView img_profile;

    @FXML
    private TextField fld_search;

    @FXML
    private void handleSearchButton() {
        System.out.println("Search button clicked!");
    }

    @FXML
    private void handleDeleteButton() {
        System.out.println("Delete button is clicked!");
    }

    @FXML
    private void handleMembersButton() {
        System.out.println("Delete button is clicked!");
    }

    @FXML
    private void handleSendButton() {
        System.out.println("Send message is clicked!");
    }
}
