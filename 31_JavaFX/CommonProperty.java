import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Tooltip;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;


public class CommonProperty extends Application
{
    @Override
    public void start(Stage stage) throws Exception
    {
        Button b = new Button("_Click Me");
        b.setTextFill(Color.BLUE);
        b.setMnemonicParsing(true);
        b.setTooltip(new Tooltip("Click this button to save data"));
        //b.setStyle("-fx-border-color:yellow;-fx-background-color:red;");
        
        // Alert a  = new Alert(AlertType.INFORMATION,"Button is Clicked");
        // b.setOnAction(e -> {
        //     a.show();
        // });

        FlowPane fn = new FlowPane(b);
        Scene sc = new Scene(fn,400,400);

        stage.setScene(sc);

        stage.show();
    }

    public static void main(String[] args) 
    {
        launch(args);
    }
}
