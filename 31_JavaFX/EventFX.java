import javafx.application.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.stage.*;
import javafx.event.*;

public class EventFX extends Application implements EventHandler<ActionEvent>
{
    Button b;
    FlowPane fn;
    static int count = 0;
    @Override
    public void start(Stage stage) throws Exception
    {
        b = new Button("OK");

        //Implementing Interface
        //b.setOnAction(this);

        //Anonymous Inner Class
        // b.setOnAction(new EventHandler<ActionEvent>(){
        //     public void handle(ActionEvent ae){
        //         count++;
        //         b.setText(""+count);
        //     }
        // });

        //Lambda Expression
        b.setOnAction(e -> {
            count++;
            b.setText(""+count);
        });

        b.setPrefSize(100,30);

        fn = new FlowPane(b);

        Scene sc = new Scene(fn,400,400);
        stage.setScene(sc);
        stage.show();
    }

    @Override
    public void handle(ActionEvent ae)
    {
        count++;
        b.setText(""+count);
    }

    public static void main(String[] args) 
    {
        launch(args);    
    }    
}
