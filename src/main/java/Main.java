import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.fundacionjala.prog101CoffeeMaker.coffeeMaker.Implementation.ControllerCoffeeMaker;

import java.io.IOException;

public class Main extends Application {

    public static void main(final String[] args) {
        ControllerCoffeeMaker coffeeMaker = new ControllerCoffeeMaker();
        launch(args);
        coffeeMaker.initialize();
    }

    /**
     * Start graphical interface
     * @param primaryStage
     * @throws IOException
     */
    @Override
    public void start(final Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

        primaryStage.setTitle("CoffeeMaker");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();


    }
}
