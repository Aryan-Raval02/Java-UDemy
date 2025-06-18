import java.awt.*;
import java.awt.event.*;

class FrameMenu extends Frame
{
    Menu file,sub;
    MenuItem open,save,close,closeAll;
    CheckboxMenuItem auto;

    TextField tf;

    FrameMenu()
    {
        super("Menu Demo");

        open = new MenuItem("Open");
        save = new MenuItem("Save");
        close = new MenuItem("Close");
        closeAll = new MenuItem("Close All");

        auto = new CheckboxMenuItem("Auto Save");

        file = new Menu("File");
        sub = new Menu("Close");

        file.add(open);
        file.add(save);
        file.add(sub);
        file.add(auto);

        sub.add(close);
        sub.add(closeAll);

        MenuBar mb = new MenuBar();
        mb.add(file);

        setMenuBar(mb);

        tf = new TextField(20);
        setLayout(new FlowLayout());
        add(tf);

        open.addActionListener((ActionEvent ae) -> tf.setText("Open"));
        save.addActionListener((ActionEvent ae) -> tf.setText("Save"));
        close.addActionListener((ActionEvent ae) -> tf.setText("Close"));
        closeAll.addActionListener((ActionEvent ae) -> tf.setText("Close All"));

        auto.addItemListener((ItemEvent e) -> {
            if(auto.getState()) tf.setText("Auto Save ON");
            else tf.setText("Auto Save OFF");
        });
    }
}

public class MenuDemo 
{
    public static void main(String[] args) 
    {
        FrameMenu f = new FrameMenu();
        f.setSize(300,300);
        f.setVisible(true);
    }    
}
