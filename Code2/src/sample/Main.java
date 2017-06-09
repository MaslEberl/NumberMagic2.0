package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("../view/haupt_scene.fxml"));
        primaryStage.setTitle("Test");
        Scene scene = new Scene(root);
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
        final ComboBox Level = new ComboBox();
        Level.getItems().addAll(
                "Baby",
                "Unschwer",
                "Reell",
                "Gemein",
                "Einsame Spitze",
                "Rational");

    }

    public static void main(String[] args) {
        launch(args);
    }
}
