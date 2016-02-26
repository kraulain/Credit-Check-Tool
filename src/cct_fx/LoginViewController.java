package cct_fx;

import cct_fx.dao.UsersDao;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginViewController implements Initializable {
    @FXML
    TextField userName_txt;
    @FXML
    PasswordField password_txt;
    @FXML
    Label error_lbl;
    
    @FXML
    private void handelLoginAction(ActionEvent event){
        error_lbl.setText("Verifying ...");
        String userName = userName_txt.getText().trim();
        String passWord = password_txt.getText().trim();
        UsersDao usersDao = new UsersDao();
        Boolean valid = usersDao.authenticate(userName, passWord);
        if(!valid){
            error_lbl.setText("Invalid Credentials");
        }else{
            error_lbl.setText("OK");
            Stage stage = (Stage) error_lbl.getScene().getWindow();
            stage.close();
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        error_lbl.setText("");
    }    
    
}
