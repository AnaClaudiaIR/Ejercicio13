package org.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.control.Button;
//import java.awt.*;
//import java.awt.TextField; --> No se necesitan estos imports
import javafx.scene.control.*;

import java.util.Optional;


public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Dirección");

        //Cuadrícula
        GridPane gridPane = new GridPane();
        gridPane.setHgap(10);
        gridPane.setVgap(10);

        Label direcionLabel = new Label("Dirección: ");
        TextField direccionField = new TextField();
        gridPane.add(direcionLabel, 0, 0);
        gridPane.add(direccionField, 1, 0);

        Button aceptarButton = new Button("Confirmar");
        gridPane.add(aceptarButton, 1, 1);

        aceptarButton.setOnAction(e -> {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION); //mensaje para que el usuario confirme si los datos son correctos
            alert.setTitle("Confirmar");
            alert.setHeaderText(null);
            alert.setContentText("¿Desea confirmar?");
            Optional<ButtonType> result = alert.showAndWait();

            if (result.get() == ButtonType.OK) {
                String direccion = direccionField.getText();
                System.out.println("Dirección introducida: " + direccion);
            }
        });
        Scene scene = new Scene(gridPane, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
