package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {launch(args); }

    @Override
    public void start(Stage stage) throws Exception {
        Parent rootNode = FXMLLoader.load(this.getClass().getResource("login.fxml"));

        Scene scene = new Scene(rootNode);

        stage.setTitle("Railway Managing System");
        stage.centerOnScreen();
        stage.setScene(scene);

        stage.show();
    }
}
