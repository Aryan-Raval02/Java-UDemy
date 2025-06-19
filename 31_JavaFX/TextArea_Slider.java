import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.scene.text.Font;
import javafx.geometry.Pos;
import java.io.*;
import java.util.*;

public class TextArea_Slider extends Application
{
    Slider s;
    TextArea ta;

    @Override
    public void start(Stage stage) throws Exception
    {
        s = new Slider();
        s.setMin(10);
        s.setMax(100);
        s.setValue(40);
        //s.setBlockIncrement(5);
        s.setMajorTickUnit(5);
        s.setShowTickMarks(true);

        ta = new TextArea();
        ta.setPrefColumnCount(100);
        ta.setPrefRowCount(20);

        s.valueProperty().addListener( e -> {
            ta.setFont(Font.font(s.getValue()));
        });

        DatePicker dp = new DatePicker();
        dp.setShowWeekNumbers(true);
        dp.setOnAction(ae -> {
            String existing = ta.getText();
            String[] lines = existing.split("\n", 2);
            String newDateLine = "Date : " + dp.getValue();

            if (lines.length > 0 && lines[0].startsWith("Date : ")) {
                if (lines.length > 1) {
                    ta.setText(newDateLine + "\n" + lines[1]);
                } else {
                    ta.setText(newDateLine + "\n");
                }
            } else {
                ta.setText(newDateLine + "\n" + existing);
            }
        });

        ColorPicker cp =new ColorPicker();
        cp.setOnAction(ae -> {
            String hex = cp.getValue().toString().substring(2,8);
            ta.setStyle("-fx-text-fill:#"+hex+";");
        });

        Button b = new Button("Open File");
        b.setOnAction(e -> {
            FileChooser fc = new FileChooser();
            java.io.File file = fc.showOpenDialog(stage);
            
            try(Scanner sc = new Scanner(new FileInputStream(file)))
            {
                String str = "";
                while(sc.hasNext())
                {
                    str = str + sc.nextLine()+"\n";

                    ta.setText(str);
                }
            }
            catch(Exception ex)
            {
                ta.setText("Select Valid File");
            }
        });

        VBox vb = new VBox();
        vb.getChildren().addAll(ta,s,dp,cp,b);
        vb.setAlignment(Pos.TOP_CENTER);

        Scene sc = new Scene(vb,400,700);
        stage.setScene(sc);
        stage.show();
    }
    public static void main(String[] args) 
    {
        launch(args);    
    }
}
