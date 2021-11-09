package wholeworthsgrocery;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class WholeWorthsGrocery extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("WholeWorthsGrocery.fxml"));

        Scene scene = new Scene(root);
        stage.setTitle("WholeWorths Grocery App");
        stage.setMinWidth(500);
        stage.setMinHeight(450);
        stage.setWidth(500);
        stage.setHeight(450);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
