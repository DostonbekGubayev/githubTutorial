package com.example.talabalartizimi;

import javafx.animation.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private Label welcomeText;
    @FXML
    Button ochishYopish,loginButton;
    @FXML private HBox hBox;
    @FXML private AnchorPane asosiyPane, boshPane,menuPane,oddiyPane;
    @FXML
    private Pane rangPane;


    Parent parent;


    boolean rostmi=true;


    @Override
    public void initialize(URL location, ResourceBundle resources) {

        ochishYopish.setOnAction(this::handle);
      //  loginButton.setOnAction(this::loginAction);
        tugmaOrnat();
    }

    public void handle(ActionEvent event){
        Label label=new Label();
        label.setLayoutX(200);
        label.setLayoutY(100);
        asosiyPane.getChildren().add(label);
        if(rostmi) {
            TranslateTransition tt = new TranslateTransition(Duration.millis(1), menuPane);
            tt.setToX(menuPane.getLayoutX() * (-1));
            tt.play();
            ochishYopish.setText("Yopish");
            rostmi=false;
        }else if(!rostmi){

            TranslateTransition tt = new TranslateTransition(Duration.millis(1), menuPane);
            tt.setToX(menuPane.getLayoutX()/10 );
            tt.play();
            ochishYopish.setText("Ochish");
           rostmi=true;
        }



    }
    public void  tugmaOrnat(){
        Button kirish,chiqish,yozish;
        kirish=new Button("Kirish");
        kirish.setLayoutX(30);
        kirish.setLayoutY(20);
        kirish.setStyle("-fx-background-radius=30");
        kirish.setStyle("-fx-background-color=#ff00ff");
        kirish.getStylesheets().add("-fx-background-color=#ff00ff");

        kirish.setOnAction(event -> {
           yuklovchi();

        });
        menuPane.getChildren().add(kirish);

    }
    public void  loginAction(ActionEvent event){
        ;
    }
    public void yuklovchi(){
        Parent yukla= null;
        Stage stage = new Stage();
        try {
            yukla = new FXMLLoader(getClass().getResource("login1.fxml")).load();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        yukla.setLayoutX(asosiyPane.getPrefWidth()/4);
        yukla.setLayoutY(asosiyPane.getHeight()/4);
        asosiyPane.getChildren().add(yukla);
        Scene scene=new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }
}