package com.example.talabalartizimi;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class SignupControli implements Initializable {
    @FXML
    private Button btnSignup;

    @FXML
    private Label successLabel;
    @FXML
    private TextField emailText,passText,firstText,lastText;

    boolean rostmi=true;
    @FXML
    public void onClickBtnSignup() {
    }


    public void initialize(URL location, ResourceBundle resources) {
        boolean qanaqa=rostlikka_tekshir();
        if (rostlikka_tekshir()){
            successLabel.setText("To'g'ri");
        }
    }


    public boolean rostlikka_tekshir(){
        if (firstText.getText().isEmpty()){
            rostmi=false;
        }
        if (lastText.getText().isEmpty()) {
          rostmi=false;
        }if (passText.getText().isEmpty()) {
            rostmi=false;
        }if (emailText.getText().isEmpty()) {
            rostmi=false;
        }
        return rostmi;
    }
}
