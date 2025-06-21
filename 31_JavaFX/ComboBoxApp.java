import javax.swing.text.LabelView;
import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.control.*;
import javafx.scene.text.*;
import javafx.scene.layout.*;
import javafx.geometry.*;
import java.util.*;
import java.io.*;

class Customer
{
    private int custid;
    private String name;
    private String address;

    Customer(int c, String n, String a)
    {
        custid = c;
        name = n;
        address = a;
    }

    public int getID() { return custid; }
    public String getName() { return name; }
    public String getAddress() { return address; }
    public void setAddress(String add) { address = add; }
}

public class ComboBoxApp extends Application
{
    static int count = 0;
    HashMap<Integer,Customer> hm = new HashMap<>();

    public void start(Stage stage) throws Exception
    {
        Font f = new Font("Times New Roman",20);

        Label l1 = new Label("Customer ID : ");
        l1.setFont(f);
        ComboBox<Integer> cust = new ComboBox<>();
        cust.setStyle("-fx-font-size:20;");
        HBox hb1 = new HBox();
        hb1.getChildren().addAll(l1,cust);
        hb1.setAlignment(Pos.CENTER);

        Label l2 = new Label("Name : ");
        l2.setFont(f);
        TextField name = new TextField();
        name.setFont(f);
        name.setPrefColumnCount(15);
        HBox hb2 = new HBox();
        hb2.getChildren().addAll(l2,name);
        hb2.setAlignment(Pos.CENTER);

        Label l3 = new Label("Address : ");
        l3.setFont(f);
        TextField adr = new TextField();
        adr.setFont(f);
        adr.setPrefColumnCount(20);
        HBox hb3 = new HBox();
        hb3.getChildren().addAll(l3,adr);
        hb3.setAlignment(Pos.CENTER);

        Button save = new Button("Save");
        save.setFont(f);
        Button create = new Button("Create");
        create.setFont(f);
        HBox hb4 = new HBox();
        hb4.getChildren().addAll(create,save);
        hb4.setAlignment(Pos.CENTER);

        create.setOnAction(ae -> {
            count++;
            cust.getItems().add(count);
            cust.setValue(count);
            name.setText("");
            adr.setText("");
        });

        save.setOnAction(ae -> {
            Customer c = new Customer(cust.getValue(),name.getText(),adr.getText());
            hm.put(count,c);

            try(PrintStream ps = new PrintStream(new FileOutputStream("Customer.txt")))
            {
                for(Customer ct : hm.values())
                {
                    ps.println(ct.getID());
                    ps.println(ct.getName());
                    ps.println(ct.getAddress());
                }
            }
            catch(Exception ex){}
        });
        
        VBox vb = new VBox();
        vb.getChildren().addAll(hb1,hb2,hb3,hb4);
        vb.setAlignment(Pos.CENTER);

        try(Scanner sc = new Scanner(new FileInputStream("Customer.txt")))
            {
                int c;
                String n;
                String a;

                while(sc.hasNext())
                {
                    c = sc.nextInt();
                    n = sc.next();
                    a = sc.next();

                    hm.put(c,new Customer(c,n,a));

                    if(c > count)
                    {
                        count = c;
                    }
                    cust.getItems().add(c);
                }

            }
            catch(Exception ex){}

        cust.valueProperty().addListener( e -> {
            int c = cust.getValue();
            Customer ct = hm.get(c);
            name.setText(ct.getName());
            adr.setText(ct.getAddress());
        });

        Scene sc = new Scene(vb,500,500);
        stage.setScene(sc);
        stage.show();
    }

    public static void main(String[] args) 
    {
        launch(args);
    }
}
