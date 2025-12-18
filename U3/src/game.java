import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import javax.swing.*;
import javax.swing.border.Border;

public class game {
    static void main(String[] args) {
        // making the frame
        JFrame frame = new JFrame("Password Checker");
        frame.setSize(300,200);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // button
        JButton button = new JButton("Enter your password:");

        // Action listener
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                // password
                JPasswordField passwordField = new JPasswordField();

                int option = JOptionPane.showConfirmDialog(
                        frame,
                        passwordField,
                        "Enter password",
                        JOptionPane.OK_CANCEL_OPTION,
                        JOptionPane.PLAIN_MESSAGE
                );

                if (option == JOptionPane.OK_OPTION) {
                    String password = new String(passwordField.getPassword());

                    if (password.equals("67")) {
                        JOptionPane.showMessageDialog(frame, "Harhar 67");
                    }
                    else if (password.equals("poutine")) {
                        JOptionPane.showMessageDialog(frame, "Here's your poutine!");


                        frame.setLayout(new BorderLayout());
                        frame.add(photo, BorderLayout(CENTER));
                        ImageIcon icon = new ImageIcon("poutine.webp");
                        JLabel photo = new JLabel(icon);
                        frame.getContentPane().add(photo);
                        frame.revalidate();
                        frame.repaint();
                    } else {
                        JOptionPane.showMessageDialog(frame,"Access denied!");
                    }
                }
            }
        });

        frame.setVisible(true);

    }
}
