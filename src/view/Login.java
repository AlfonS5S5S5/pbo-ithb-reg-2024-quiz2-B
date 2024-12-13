package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import controller.LoginCheck;

public class Login {
    private JFrame frame;
    
    
    public Login() {
        inputLogin();
    }
    public static void main(String[] args) {
        new Login().inputLogin();
    }
    public void inputLogin() {
        frame = new JFrame();
        frame.setBounds(50, 50, 400, 1000);
        frame.setTitle("LOGIN");
        frame.setLayout(null);

        JLabel labelTitleLogin = new JLabel("==LOGIN==");
        labelTitleLogin.setBounds(150, 50, 70, 35);
        frame.add(labelTitleLogin);

        JLabel labelEmail = new JLabel("Email : ");
        labelEmail.setBounds(25, 80, 90, 55);
        frame.add(labelEmail);
        JTextField emailField = new JTextField();
        emailField.setBounds(110, 95, 150, 25);
        frame.add(emailField);


        JLabel labelPassword = new JLabel("Password : ");
        labelPassword.setBounds(25, 110, 90, 55);
        frame.add(labelPassword);
        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(110, 130, 150, 25);
        frame.add(passwordField);

        JButton loginButton = new JButton("LOGIN");
        loginButton.setBounds(110, 210, 100, 30);
        frame.add(loginButton);
        
        frame.setVisible(true);

        loginButton.addActionListener(e -> {
            String email = emailField.getText();
            String password = String.valueOf(passwordField.getPassword());

            new LoginCheck(email, password);
            frame.dispose();
            new ArtWork();
        });
    }
}
