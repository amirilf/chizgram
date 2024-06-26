module app.client {
    requires javafx.controls;
    requires javafx.fxml;

    opens app.client.gui.auth to javafx.fxml;
    opens app.client.gui.panel to javafx.fxml;

    exports app.client;
}
