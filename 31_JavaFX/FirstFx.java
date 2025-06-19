import javafx.application.*;
import javafx.stage.*;
import javafx.scene.control.*;
import javafx.scene.*;
import javafx.scene.layout.*;

public class FirstFx extends Application
{
    @Override
    public void start(Stage stage) throws Exception
    {
        Button b = new Button("Click Me");
        FlowPane fp = new FlowPane();
        fp.getChildren().add(b);
        Scene sc = new Scene(fp);

        stage.setScene(sc);
        stage.show();
    }

    public static void main(String[] args) 
    {
        launch(args);
    }
}