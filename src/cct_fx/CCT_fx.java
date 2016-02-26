package cct_fx;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CCT_fx extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        login();
        
        Platform.exit();
    }

    public void login() {

        try {
            Stage stage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("LoginView.fxml"));

            Scene scene = new Scene(root);
            stage.setTitle("Login");
            stage.setScene(scene);
            stage.showAndWait();
            System.out.println("Stage closed");
        } catch (Exception e) {
            System.out.println("Exception: " + e.toString());
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
