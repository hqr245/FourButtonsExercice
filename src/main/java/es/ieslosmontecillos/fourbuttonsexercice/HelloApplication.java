package es.ieslosmontecillos.fourbuttonsexercice;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        Group root = new Group();
        Scene scene = new Scene(root, 320, 240);
        stage.setTitle("FourButtonsExercice");
        stage.setScene(scene);
        FlowPane pane = new FlowPane();
        scene.setRoot(pane);

        HBox hBox = new HBox();

        Button newButton = new Button("New");
        Button openButton = new Button("Open");
        Button saveButton = new Button("Save");
        Button printButton = new Button("Print");

        settingAll(newButton,openButton,saveButton,printButton);

        hBox.getChildren().addAll(newButton, openButton, saveButton, printButton);

        pane.getChildren().addAll(hBox);

        stage.show();
    }

    private void settingAll(Button newButton, Button openButton, Button saveButton, Button printButton) {

        newButton.setOnAction(new EventHandler() {


            @Override
            public void handle(Event event) {

                System.out.println("Nuevo proceso.");

            }
        });
        printButton.setOnAction(new EventHandler() {
            @Override
            public void handle(Event event) {
                System.out.println("Imprimir proceso.");
            }
        });
        openButton.setOnAction(new EventHandler() {
            @Override
            public void handle(Event event) {
                System.out.println("Abrir proceso.");
            }
        });
        saveButton.setOnAction(new EventHandler() {
            @Override
            public void handle(Event event) {
                System.out.println("Guardar proceso.");
            }
        });

    }

    public static void main(String[] args) {
        launch();
    }
}