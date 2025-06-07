import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class WhiteboardGUI {
    private JTextArea boardText;
    private JButton nextNoteButton;
    private JLabel studentReadLabel;

    private String[] notes = {
        "Java is a language",
        "It is OOPs",
        "It is platform Independent",
        "It supports Thread",
        "end"
    };
    private int noteIndex = 0;
    private int studentCount = 4;
    private int readCount = 0;

    public WhiteboardGUI() {
        JFrame frame = new JFrame("Teacher-Student Whiteboard");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);

        boardText = new JTextArea(3, 40);
        boardText.setFont(new Font("Arial", Font.BOLD, 18));
        boardText.setEditable(false);
        boardText.setLineWrap(true);

        nextNoteButton = new JButton("Teacher: Write Next Note");
        nextNoteButton.addActionListener(e -> writeNextNote());

        studentReadLabel = new JLabel("Students Read: 0 / " + studentCount);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(new JScrollPane(boardText), BorderLayout.CENTER);
        panel.add(nextNoteButton, BorderLayout.NORTH);
        panel.add(studentReadLabel, BorderLayout.SOUTH);

        frame.getContentPane().add(panel);
        frame.setVisible(true);

        // Simulate students reading
        Timer studentReader = new Timer(2000, e -> simulateStudentReading());
        studentReader.start();
    }

    private void writeNextNote() {
        if (readCount < studentCount) {
            JOptionPane.showMessageDialog(null, "Wait! All students haven't read yet.");
            return;
        }

        if (noteIndex < notes.length) {
            boardText.setText(notes[noteIndex]);
            readCount = 0;
            studentReadLabel.setText("Students Read: 0 / " + studentCount);
            noteIndex++;
        } else {
            nextNoteButton.setEnabled(false);
        }
    }

    private void simulateStudentReading() {
        if (readCount < studentCount && noteIndex > 0) {
            readCount++;
            studentReadLabel.setText("Students Read: " + readCount + " / " + studentCount);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(WhiteboardGUI::new);
    }
}
