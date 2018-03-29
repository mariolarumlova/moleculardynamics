package pakiet;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 * Klasa odpowiedzialna za uruchamianie aplikacji
 */
public class App extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setScene(MDtester.getScene());
        primaryStage.show();
    }
}
