package cct_fx;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        
        login();
        showHome();
        exit();
    }

    public void login() {

        try {
            Stage stage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("LoginView.fxml"));

            Scene scene = new Scene(root);
            stage.setTitle("Login");
            stage.setScene(scene);
            stage.showAndWait();

        } catch (Exception e) {
            System.out.println("Exception: " + e.toString());
        }
    }

    public void showHome() {
        try {
            Stage stage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("HomeView.fxml"));

            Scene scene = new Scene(root);
            stage.setTitle("Credit Check Tool V-15.02");
            stage.setScene(scene);
            stage.showAndWait();
            
        } catch (Exception e) {
            System.out.println("Exception " + e.toString());
        }
    }
    
    private void exit(){
        Platform.exit();
        System.exit(0);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
