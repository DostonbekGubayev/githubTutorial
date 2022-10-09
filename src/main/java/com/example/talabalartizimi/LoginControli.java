package com.example.talabalartizimi;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginControli implements Initializable {
    @FXML
    private Button btnLogin,loginButton;
    @FXML
    private Label successLabel;
    @FXML
    private TextField passTextField,loginTxtField;
    HelloController helloController=new HelloController();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
		loginButton.setOnAction(event -> {
            //helloController.yuklovchi().setVisible(false);
        });
    }
        @FXML
    public void onClickBtnLogin() {
        successLabel.setText("Login successfully");
        successLabel.setTextFill(Color.DARKORANGE);
    }

}
