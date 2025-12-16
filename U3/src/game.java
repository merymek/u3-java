import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import javax.swing.*;

public class game implements ActionListener {
    static int clicks = 0;
    static JFrame frame = new JFrame();
    static JLabel label = new JLabel("Number of clicks: 0");
    public game() {
        // Read CSV file
        JButton button = new JButton("Click me!");
        button.addActionListener(this);

        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(60,60,60,60));
        panel.add(button);
        panel.add(label);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("GUI");
        frame.pack();
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        clicks++;
        label.setText("Number of clicks: " + clicks);
    }

    public static void main(String[] args) {
        new game();
    }
}
