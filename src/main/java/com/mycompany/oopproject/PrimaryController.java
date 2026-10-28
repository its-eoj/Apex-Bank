package com.mycompany.oopproject;



import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class PrimaryController {
    
    
    // 1. Controls matching your FXML fx:id's
    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Label statusLabel;

    // 2. Login button action
    @FXML
    private void handleLogin() throws IOException {
        String username = usernameField.getText().trim();
        String password = passwordField.getText().trim();

        if (username.isEmpty() || password.isEmpty()) {
            statusLabel.setText("Please enter username and password.");
            return;
        }

        // TODO: Replace this with your database check logic!
        boolean isValidUser = checkDatabaseCredentials(username, password);

        if (isValidUser) {
            // Switches screen using your group's App setup!
            App.setRoot("secondary"); 
        } else {
            statusLabel.setText("Invalid username or password.");
        }
    }

    // 3. Register button action
    @FXML
    private void handleRegisterView() throws IOException {
        // Switches screen to register view
        App.setRoot("register"); 
    }

    // Helper method for database check
    private boolean checkDatabaseCredentials(String user, String pass) {
        // Temporary placeholder so you can test right away
        // Change this once you connect your JDBC database!
        return user.equals("admin") && pass.equals("1234");
    }
}
