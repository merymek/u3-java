import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import javax.swing.*;

public class game {
    public static void main(String[] args) {
        // making the frame
        JFrame frame = new JFrame("Password Checker");
        frame.setSize(300,200);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // button
        JButton button = new JButton("Enter your password:");

        // Action listener
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                // password
                JPasswordField passwordField = new JPasswordField();

                // options for password field
                int option = JOptionPane.showConfirmDialog(
                        frame,
                        passwordField,
                        "Enter password",
                        JOptionPane.OK_CANCEL_OPTION,
                        JOptionPane.PLAIN_MESSAGE
                );

                // in the case the person clicks the button
                if (option == JOptionPane.OK_OPTION) {
                    String password = new String(passwordField.getPassword());

                    if (password.equals("67")) {
                        JOptionPane.showMessageDialog(frame, "Harhar 67");
                    }
                    else if (password.equals("poutine")) {
                        JOptionPane.showMessageDialog(frame, "Here's your poutine!");

                        // making icon
                        ImageIcon icon = new ImageIcon(game.class.getResource("po.png"));
                        JLabel photo = new JLabel(icon);

                        // making a new frame for poutine
                        JFrame new_frame = new JFrame();
                        new_frame.setSize(300,200);
                        new_frame.add(photo);
                        new_frame.pack();
                        new_frame.setVisible(true);

                    } else {
                        JOptionPane.showMessageDialog(frame,"Access denied!");
                    }
                }
            }
        });

        // packing the main frame
        frame.add(button);
        frame.pack();
        frame.setVisible(true);
    }
}
