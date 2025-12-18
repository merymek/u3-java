import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PasswordPopupExample {

    public static void main(String[] args) {
        // Create frame
        JFrame frame = new JFrame("Password Example");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create button
        JButton button = new JButton("Enter Password");

        // Add ActionListener
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                // Password field
                JPasswordField passwordField = new JPasswordField();

                int option = JOptionPane.showConfirmDialog(
                        frame,
                        passwordField,
                        "Enter Password",
                        JOptionPane.OK_CANCEL_OPTION,
                        JOptionPane.PLAIN_MESSAGE
                );

                if (option == JOptionPane.OK_OPTION) {
                    String password = new String(passwordField.getPassword());

                    if (password.equals("1234")) {
                        JOptionPane.showMessageDialog(frame, "Access granted!");
                    } else {
                        JOptionPane.showMessageDialog(frame, "Wrong password.");
                    }
                }
            }
        });

        // Add button to frame
        frame.add(button);
        frame.setVisible(true);
    }
}
