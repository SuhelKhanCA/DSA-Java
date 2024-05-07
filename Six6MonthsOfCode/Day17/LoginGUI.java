import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LoginGUI extends JFrame {
    private JTextField userIdField;
    private JPasswordField passwordField;
    private JLabel messageLabel;

    public LoginGUI() {
        setTitle("Login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLayout(new GridLayout(3, 2));

        JLabel userIdLabel = new JLabel("User ID:");
        userIdField = new JTextField();
        add(userIdLabel);
        add(userIdField);

        JLabel passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField();
        add(passwordLabel);
        add(passwordField);

        JButton submitButton = new JButton("Submit");
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String userId = userIdField.getText();
                char[] passwordChars = passwordField.getPassword();
                String password = new String(passwordChars);

                if (isValidUser(userId, password)) {
                    messageLabel.setText("Login successful!");
                } else {
                    messageLabel.setText("Invalid user ID or password.");
                }
            }
        });
        add(submitButton);

        messageLabel = new JLabel("");
        add(messageLabel);

        setVisible(true);
    }

    private boolean isValidUser(String userId, String password) {
        try (BufferedReader br = new BufferedReader(new FileReader("password.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(":");
                if (parts.length == 2 && parts[0].equals(userId) && parts[1].equals(password)) {
                    return true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static void main(String[] args) {
        new LoginGUI();
    }
}
