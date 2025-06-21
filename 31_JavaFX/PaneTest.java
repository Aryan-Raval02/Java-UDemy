import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import java.io.*;

public class PaneTest extends Application
{
    @Override
    public void start(Stage stage) throws Exception
    {
        Button btn1 = new Button("One");
        Button btn2 = new Button("Two");
        Button btn3 = new Button("Three");
        Button btn4 = new Button("Four");
        Button btn5 = new Button("Five");

        // FlowPane root = new FlowPane();
        // root.setHgap(10);
        // root.setVgap(10);
        // root.getChildren().addAll(btn1,btn2,btn3,btn4,btn5);

        //TilePane root = new TilePane();
        //root.setHgap(10);
        //root.setVgap(10);
        //root.getChildren().addAll(btn1,btn2,btn3,btn4,btn5);

        // BorderPane root = new BorderPane();
        // root.setBottom(btn1);
        // root.setTop(btn2);
        // root.setRight(btn3);
        // root.setLeft(btn4);
        // root.setCenter(btn5);

        // GridPane root = new GridPane();
        // root.add(btn1,0,0);
        // root.add(btn2,1,0);
        // root.add(btn4,2,1);
        // root.add(btn3,2,2);

        // ImageView iv1 = new ImageView(new Image(new FileInputStream("path of Image")));
        // ImageView iv2 = new ImageView(new Image(new FileInputStream("path of Image")));
        // ImageView iv3 = new ImageView(new Image(new FileInputStream("path of Image")));
        // ScrollPane sp1 = new ScrollPane(iv1);
        // ScrollPane sp2 = new ScrollPane(iv2);
        // ScrollPane sp3 = new ScrollPane(iv3);

        // SplitPane root = new Splitpane(sp1,sp2,sp3);
        // root.setDividerPosition(0.33,0.66);

        // Tab t1 = new Tab("Title",sp1);
        // Tab t2 = new Tab("Title",sp2);
        // Tab t3 = new Tab("Title",sp3);
        // TabPane root = new TabPane();
        // root.getTabs().addAll(t1,t2,t3);

        // TitledPane t1 = new TitledPane("Title",sp1);
        // TitledPane t2 = new TitledPane("Title",sp2);
        // TitledPane t3 = new TitledPane("Title",sp3);
        // Accordion root = new Accordion();
        // root.getPanes().addAll(t1,t2,t3);

        Scene sc = new Scene(root,400,400);
        stage.setScene(sc);
        stage.show();
    }
    public static void main(String[] args) 
    {
        launch(args);
    }
}
